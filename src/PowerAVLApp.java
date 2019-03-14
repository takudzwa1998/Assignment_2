/*

*  Java Program to Implement AVL Tree
*  https://www.sanfoundry.com/java-program-implement-avl-tree/
*Sanfoundry Global Education & Learning Series – 1000 Java Programs.

*/


 /* Class AVL Tree Test */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
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
		//avlTree.search(lineinfo[0]);
		}
	}
        catch (Exception e){ e.printStackTrace();}
	}

	public static void printDateTime(String dateTime){
		extractData();
		//if ((avlTree.search(dateTime)).length!=0){
		System.out.println(avlTree.search(dateTime));
		System.out.println(avlTree.count());
		//}
		//else{System.out.println("date and time not found");
		//System.out.println(avlTree.count());}
	
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
		System.out.println(lineinfo[0]+" "+lineinfo[1]+" "+lineinfo[3]);}
		}
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



public static void start(){
try{
	File min = new File("PowerAVLOutputs/min.txt");
	PrintWriter file = new PrintWriter(min);
	File max = new File("PowerAVLOutputs/max.txt");
	PrintWriter file_two = new PrintWriter(max);
	File avg = new File("PowerAVLOutputs/avg.txt");
	PrintWriter file_three = new PrintWriter(avg);

	for (int i =1;i<=500;i++){
		AVLTree avlTree = new AVLTree();

		String lineTwo = null;
		String lineSearch=null;
		try{
			BufferedReader filereader = new BufferedReader(new FileReader("cleaned_data.csv"));
			int x = 0;
			filereader.readLine();
			String lineOne = null;
			BufferedReader keyfile = new BufferedReader(new FileReader("datasets/"+Integer.toString(i)+".txt"));
			while ((lineTwo = keyfile.readLine())!=null){
			x++;
            		while ((lineOne = filereader.readLine())!=null){
					String [] line = lineOne.split(",");
					if (lineTwo.equals(line[0])){
						avlTree.insert(line[0], line[1], line[3]);	
						break;
					}
					else{System.out.println(lineTwo+" not matching"+" "+line[0]);break;}
				}			
			}
			int arr[]=new int[i];
			int arrayIndex=0;
			BufferedReader keyfileTwo = new BufferedReader(new FileReader("datasets/"+Integer.toString(i)+".txt"));
			while ((lineSearch=keyfileTwo.readLine())!=null){
				avlTree.search(lineSearch);
				avlTree.count();
				//System.out.println(avlTree.search(lineSearch)+" "+avlTree.count());
				arr[arrayIndex]=avlTree.count();			
				arrayIndex++;
			}
			Arrays.sort(arr);
			file.println(arr[0]);
			System.out.println(arr[0]+" min here");
			file_two.println(arr[i-1]);
			System.out.println(arr[i-1]+" max here");
			int sum=0;
			int avgNum;
			for (int r=0;r<i;r++){
				sum=sum+arr[r];
			}
			avgNum=sum/i;
			file_three.println(avgNum);
			System.out.println(avgNum+" avg here");
			
	}
	catch (Exception e){ e.printStackTrace();}

}
			file.close();
			file_two.close();
			file_three.close();
}

catch (Exception e){ e.printStackTrace();}



}

	public static void main(String[] args){

	if(args.length!=0){
		if((args[0].endsWith(".txt"))){makeSearch(args[0]);}
		if((args[0].equals("start"))){start();}
		else{printDateTime(args[0]);}

	}

	else{ printAllDateTimes();}

	}

}















