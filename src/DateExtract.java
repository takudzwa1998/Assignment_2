import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
public class DateExtract{

	public static void main (String [] args){
		String line = null;

		try{
			for(int x=1;x<=500;x++){
				int y=0;
		    		BufferedReader filereader = new BufferedReader(new FileReader("cleaned_data.csv"));
				PrintWriter writer = new PrintWriter("datasets/"+x+".txt", "UTF-8");

			while ((line = filereader.readLine())!=null){
		        String [] lineinfo = line.split(",");
			if (lineinfo[0].equals("Date/Time")){continue;}

			else{writer.println(lineinfo[0]);y++;}

			if (x==y){break;}
			}
			writer.close();

		}}
		catch (Exception e){e.printStackTrace();}

}

}


