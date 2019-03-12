/*

*  Java Program to Implement AVL Tree
*  https://www.sanfoundry.com/java-program-implement-avl-tree/
*Sanfoundry Global Education & Learning Series – 1000 Java Programs.

*/

//AVLNode Class 
public class AVLNode
 {    
     AVLNode left, right;
     String data;
     String power;
     String voltage;
     int height;

     /* Constructor */
     public AVLNode()
     {
         left = null;
         right = null;
         data = null;
	 power=null;
	 voltage=null;
         height = 0;
     }
     /* Constructor */
     public AVLNode(String n, String p, String v)
     {
         left = null;
         right = null;
         data = n;
		 power=p;
	 	 voltage=v;
         height = 0;
     }   

//	public int compareTo(AVLNode node){
//		if (data.compareTo(node.data)==0){return 0;}
//		if (data.compareTo(node.data)>0){return 1;}
//		if (data.compareTo(node.data)<0){return -1;}
//	}


 }
