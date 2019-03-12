/*

*  Java Program to Implement AVL Tree
*  https://www.sanfoundry.com/java-program-implement-avl-tree/
*Sanfoundry Global Education & Learning Series – 1000 Java Programs.

*/

 /* Class AVLTree */
 class AVLTree{

     private AVLNode root;     
     /* Constructor */
     private static int count=0;
     public AVLTree()
     {
         root = null;
     }
	//Function to return comparison ops
	public int count(){return count;}

     /* Function to check if tree is empty */

     public boolean isEmpty()
     {
         return root == null;
     }
     /* Make the tree logically empty */
     public void makeEmpty()
     {
         root = null;
     }

     /* Function to insert data */

     public void insert(String data, String power, String voltage)
     {
		count++;
         root = insert(data, root, power, voltage);
     }

     /* Function to insert data recursively */
     private AVLNode insert(String x, AVLNode t, String p, String v)
     {
         if (t == null)
             t = new AVLNode(x, p, v);
         else if (x.compareTo(t.data)<0)
         {
             t.left = insert( x, t.left, p, v);
             if( height( t.left ) - height( t.right ) == 2 )
                 if( x.compareTo(t.left.data)<0)
                     t = rotateWithLeftChild( t );
                 else
                     t = doubleWithLeftChild( t );
         }
         else if( x.compareTo(t.data)>0)
         {
			count++;
             t.right = insert( x, t.right, p, v );
             if( height( t.right ) - height( t.left ) == 2 )
                 if( x.compareTo(t.right.data)>0)
                     t = rotateWithRightChild( t );
                 else
                     t = doubleWithRightChild( t );
         }
         else
           ;  // Duplicate; do nothing
         t.height = max( height( t.left ), height( t.right ) ) + 1;
         return t;
     }

     /* Rotate binary tree node with left child */     
     private AVLNode rotateWithLeftChild(AVLNode k2)
     {
         AVLNode k1 = k2.left;
         k2.left = k1.right;
         k1.right = k2;
         k2.height = max( height( k2.left ), height( k2.right ) ) + 1;
         k1.height = max( height( k1.left ), k2.height ) + 1;
         return k1;
     }

     /* Rotate binary tree node with right child */

     private AVLNode rotateWithRightChild(AVLNode k1)
     {
         AVLNode k2 = k1.right;
         k1.right = k2.left;
         k2.left = k1;
         k1.height = max( height( k1.left ), height( k1.right ) ) + 1;
         k2.height = max( height( k2.right ), k1.height ) + 1;
         return k2;
     }

     /**

      * Double rotate binary tree node: first left child

      * with its right child; then node k3 with new left child */

     private AVLNode doubleWithLeftChild(AVLNode k3)
     {
         k3.left = rotateWithRightChild( k3.left );
         return rotateWithLeftChild( k3 );
     }

     /**

      * Double rotate binary tree node: first right child

      * with its left child; then node k1 with new right child */      

     private AVLNode doubleWithRightChild(AVLNode k1)
     {
         k1.right = rotateWithLeftChild( k1.right );
         return rotateWithRightChild( k1 );
     }    


     /* Functions to count number of nodes */
     public int countNodes()
     {
         return countNodes(root);
     }
     private int countNodes(AVLNode r)
     {
         if (r == null)
             return 0;
         else
         {
             int l = 1;
             l += countNodes(r.left);
             l += countNodes(r.right);
             return l;
         }
     }

     /* Functions to search for an element */

     public boolean search(String val)
     {
         return search(root, val);
     }

     private boolean search(AVLNode r, String val)
     {
         boolean found = false;
         while ((r != null) && !found)
         {
             String rval = r.data;
             if (val.compareTo(rval)<0){
				count++;
                 r = r.left;}
             else if (val.compareTo(rval)>0)
                 r = r.right;
             else
             {
                 found = true;
		System.out.println(r.data+" "+r.power+" "+r.voltage+" "+count());
                 break;
             }
             found = search(r, val);
         }
         return found;
     }

     /* Function to get height of node */
     private int height(AVLNode t )
     {
         return t == null ? -1 : t.height;
     }

     /* Function to max of left/right node */
     private int max(int lhs, int rhs)
     {
         return lhs > rhs ? lhs : rhs;
     }
}
