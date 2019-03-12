/*

*  Java Program to Implement AVL Tree
*  https://www.sanfoundry.com/java-program-implement-avl-tree/
*Sanfoundry Global Education & Learning Series – 1000 Java Programs.

*/


 /* Class AVL Tree Test */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 public class PowerAVLApp{
	public static AVLTree avlTree = new AVLTree(); 

	public static void extractData(){

	String line = null;
	try{
	
            BufferedReader filereader = new BufferedReader(new FileReader("cleaned_data.csv"));
            while ((line = filereader.readLine())!=null){
                String [] lineinfo = line.split(",");
		avlTree.insert(lineinfo[0], lineinfo[1], lineinfo[3]);
		avlTree.search(lineinfo[0]);
		}
	}
        catch (Exception e){ e.printStackTrace();}
	}

	public static void printDateTime(String dateTime){
		extractData();
		if (avlTree.search(dateTime)!=null){
		System.out.println(avlTree.search(dateTime));
		System.out.println(avlTree.count());
		}
		else{System.out.println("date and time not found");
		System.out.println(avlTree.count());}
	
	}


	public static void main(String[] args){


	}

}















