//Source of Binary Search Tree Code
//https://www.moreofless.co.uk/binary-search-tree-bst-java/
//Author- Steve Claridge

public class BSTNode {

    private String key;
    private Object value1;
    private Object value2;
    private BSTNode left, right;
    private static int count=0;

    public BSTNode( String key, Object value1, Object value2)
    {
        this.key = key;
        this.value1 = value1;
	this.value2 = value2;
    }

   public int getCount(){
	return count;
}

    //if key not found in BST then it is added. If jey already exists then that node's value
    //is updated.
    public void put( String key, Object value1, Object value2)
    {
	count++;
        if ( key.compareTo( this.key ) < 0 ) 
      
        {     
 	//count++;        
            if ( left != null )             
            { 
		//count++;                
                left.put( key, value1, value2);            
            }             
            else             
            {       
                left = new BSTNode( key, value1, value2);             
            }         
        }         
        else if ( key.compareTo( this.key ) > 0 )
        {
 	//count++;
            if ( right != null )

            {
		//count++;
                right.put( key, value1, value2);

            }
            else
            {
                right = new BSTNode( key, value1, value2);
            }
        }
        else
        {
            //update this one
            //this.value = value;
            this.value1 = value1;
	    this.value2 = value2;
        }
    }

    //find Node with given key and return it's value
    public String get( String key)

    {
        if ( this.key.equals( key ) )
        {
	count++;
            return (key+" "+value1+" "+value2);
        }
        if ( key.compareTo( this.key ) < 0 )
        {
	count++;
            return left == null ? null : left.get( key );
	   
        }
        else
        {
	count++;
            return right == null ? null : right.get( key );
        }
    }

}

