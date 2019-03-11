import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Source of Binary Search Tree Code
//https://www.moreofless.co.uk/binary-search-tree-bst-java/
//Author- Steve Claridge

public class PowerBSTApp{

	public static BST muti = new BST();

	public static void main(String[] args){
        if(args.length!=0){
		if((args[0].endsWith(".txt"))){		
		makeSearch(args[0]);}
		else{printDateTime(args[0]);}

	}

	else{ printAllDateTimes();}
	}

	public static void extractData(){

		String line = null;
	try{
	
            BufferedReader filereader = new BufferedReader(new FileReader("cleaned_data.csv"));
            while ((line = filereader.readLine())!=null){
                String [] lineinfo = line.split(",");
		muti.put(lineinfo[0], lineinfo[1], lineinfo[3]);
		}
	}
        catch (Exception e){ e.printStackTrace();}
	}




	public static void printDateTime(String dateTime){
		extractData();
		if (muti.get(dateTime)!=null){
		System.out.println(muti.get(dateTime));
		System.out.println(muti.root.getCount()+muti.getCount_two());
		}
		else{System.out.println("date and time not found");
		System.out.println(muti.root.getCount()+muti.getCount_two());}
	
	}



	
	public static void printAllDateTimes(){
		BST muti = new BST();
		String line = null;
	try{

            BufferedReader filereader = new BufferedReader(new FileReader("cleaned_data.csv"));
            int x = 0;
            while ((line = filereader.readLine())!=null){
                String [] lineinfo = line.split(",");
		if(lineinfo[0].equals("Date/Time")){continue;}
		else{
		muti.put(lineinfo[0], lineinfo[1], lineinfo[3]);
		System.out.println(muti.get(lineinfo[0]));
		}}
	}

        catch (Exception e){ e.printStackTrace();}

	}


	public static void makeSearch(String filename){
		BST muti = new BST();

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
						muti.put(line[0], line[1], line[3]);
						//System.out.println(muti.get(line[0]));	
						break;
					}
					else{System.out.println(lineTwo+" not matching"+" "+line[0]);break;}
				}			
			}
			BufferedReader keyfileTwo = new BufferedReader(new FileReader("datasets/"+filename));
			while ((lineSearch=keyfileTwo.readLine())!=null){
				System.out.println(muti.get(lineSearch));
				System.out.println(muti.root.getCount()+muti.getCount_two());	
			}
			
		}


		catch (Exception e){ e.printStackTrace();}



}














}
