package LongestLine;
import java.io.BufferedReader;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ArrayList
		//Try reading in the file to process
		try {
			File file = new File(args[0]);
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			int numLines = Integer.parseInt(in.readLine());
			while ((line = in.readLine()) != null) {
				//String[] lineArray = line.split("\\s");
				//if (lineArray.length > 0) {
					System.out.println(longesLines(line));
				//} 
			}
		} catch (IOException e) {
			System.out.println("File Read Error: " + e.getMessage());
		}               
	}
	
	


	public static char [] longesLines(String sen){
		int len = sen.length();
		if(sen !=  null && len > 0){
			char newSen [] = sen.toCharArray();
			if(len == 1){
				return newSen;
			}else{
				boolean prevL = true; 
				for(int i = 0; i < len; i++){
					if(Character.isLetter(newSen[i])){
						if(prevL){
							newSen[i] = Character.toUpperCase(newSen[i]);
							prevL = false;
						}else{
							newSen[i] = Character.toLowerCase(newSen[i]);
							prevL = true;
						} 
					}else{

					}
				}
				return newSen;
			}
		}
		return sen.toCharArray();
	}




}
