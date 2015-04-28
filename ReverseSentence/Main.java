package ReverseSentence;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
				String[] lineArray = line.split("\\s");
				if (lineArray.length > 0) {
					System.out.println(reverseSentence(line));
				} 
			}
		} catch (IOException e) {
			System.out.println("File Read Error: " + e.getMessage());
		}               
	}



	public static String reverseSentence(String sen){
		String newSen = null;
		if(sen !=  null && sen.length() > 0){
			if(sen.length() == 1){
				return sen;
			}else{
				newSen = "";
				String [] tokens = sen.split(" ");
				for(int i = tokens.length-1; i >= 0;i--){
					newSen += " "+tokens[i];
				}
			}
			return newSen;
		}
		return newSen;
	}



}
