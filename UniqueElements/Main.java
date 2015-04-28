package UniqueElements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Try reading in the file to process
		try {
			File file = new File(args[0]);
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			while ((line = in.readLine()) != null) {
				String[] lineArray = line.split(",");
				if (lineArray.length > 0) {
					StringBuilder newList = new StringBuilder();
					ArrayList<String> uniqArr = getUnique(lineArray);
					for( int i = 0; i < uniqArr.size(); i++){
						if(i+1 != uniqArr.size())
							newList.append(uniqArr.get(i)+",");
						else
							newList.append(uniqArr.get(i));
					}
					System.out.println(newList.toString());
					/*Supported in Java 8
					/System.out.println(String.join(",", getUnique(lineArray)));*/
				} 
			}
		} catch (IOException e) {
			System.out.println("File Read Error: " + e.getMessage());
		}               
	}
	
	public static ArrayList<String> getUnique(String[] arr){
		ArrayList<String> uniqueArr = new ArrayList<String>();
		int i = 0;
	    uniqueArr.add(arr[i++]);
	    while(i < arr.length){
	        if(arr[i-1].compareTo(arr[i]) != 0)
	          uniqueArr.add(arr[i]);
	        i++;
	    }
	      return uniqueArr;
	}
}
