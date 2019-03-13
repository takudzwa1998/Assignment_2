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

	try{
	
            BufferedReader filereader = new BufferedReader(new FileReader("cleaned_data.csv"));
	    filereader.readLine();
	String line = null;
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
		if (avlTree.search(dateTime)==true){
		System.out.println(avlTree.root.data+" "+avlTree.root.power+" "+avlTree.root.voltage);
		System.out.println(avlTree.count());
		}
		else{System.out.println("date and time not found");
		System.out.println(avlTree.count());}
	
	}

	public static void printAllDateTimes(){
		AVLTree alvTree = new AVLTree();
		String line = null;
	try{

            BufferedReader filereader = new BufferedReader(new FileReader("cleaned_data.csv"));
            int x = 0;
            while ((line = filereader.readLine())!=null){
                String [] lineinfo = line.split(",");
		if(lineinfo[0].equals("Date/Time")){continue;}
		else{
		avlTree.insert(lineinfo[0], lineinfo[1], lineinfo[3]);
		if ( avlTree.search(lineinfo[0]) ){System.out.println(lineinfo[0]+" "+lineinfo[1]+" "+lineinfo[3]);}
		}}
	}

        catch (Exception e){ e.printStackTrace();}

	}





	public static void makeSearch(String filename){
		AVLTree avlTree = new AVLTree();

		String lineTwo = null;
		String lineSearch=null;
		try{
			BufferedReader filereader = new BufferedReader(new FileReader("cleaned_data.csv"));
			int x = 0;
			filereader.readLine();
			String lineOne = null;
			BufferedReader keyfile = new BufferedReader(new FileReader("datasets/"+filename));
			while ((lineTwo = keyfile.readLine())!=null){
			x++;
            		while ((lineOne = filereader.readLine())!=null){
					String [] line = lineOne.split(",");
					if (lineTwo.equals(line[0])){
						avlTree.insert(line[0], line[1], line[3]);
						//System.out.println(muti.get(line[0]));	
						break;
					}
					else{System.out.println(lineTwo+" not matching"+" "+line[0]);break;}
				}			
			}
			BufferedReader keyfileTwo = new BufferedReader(new FileReader("datasets/"+filename));
			while ((lineSearch=keyfileTwo.readLine())!=null){
				System.out.println(avlTree.search(lineSearch));
				System.out.println(avlTree.count());	
			}
			
		}


		catch (Exception e){ e.printStackTrace();}



}


	public static void main(String[] args){

	if(args.length!=0){
		if((args[0].endsWith(".txt"))){		
		makeSearch(args[0]);}
		else{printDateTime(args[0]);}

	}

	else{ printAllDateTimes();}

	}

}















