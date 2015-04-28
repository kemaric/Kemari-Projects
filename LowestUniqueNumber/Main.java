package LowestUniqueNumber;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.List;
import java.util.ArrayList;;

public class Main {

	/**
	 * @param args
	 */
	public Map<Integer,Integer> numbers;
	public static int main(String[] args) {
		// TODO Auto-generated method stub
		//Read in the file name from args
				if(args.length > 0){
					//String fileToRead = args[1];
					
					BufferedReader sentenceFile = null;
					System.out.println(args[0]);
					try {
						sentenceFile = new BufferedReader( new FileReader(args[0]));
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
						return -1;
					}
					String line = null;
					try {
						while((line = sentenceFile.readLine()) != null){
							if(!line.isEmpty());
								
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
						return -1;
					}
				}else{
					System.out.println("Did not input a file name!");
					return -1;
				}
				
				return 0;
	}
	
	public int getLowestUnique(String line){
		Integer lowest = Integer.MAX_VALUE;
		String [] tokens = line.split(" ");
		numbers = new HashMap<Integer,Integer>();
		for( String num :tokens){
			int numInt =  Integer.getInteger(num);
			if(numbers.containsKey(numInt)){
				numbers.put(numInt, numbers.get(numInt)+1);
			}else{
				numbers.put(numInt, 1);
			}
		}
		
		/*List <Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(numbers.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>(){

			public int compare(Entry<Integer, Integer> arg0,
					Entry<Integer, Integer> arg1) {
				return arg0.getValue().compareTo(arg1.getValue());
			}
			
		});*/
		for (Map.Entry<Integer, Integer> i: numbers.entrySet()){
			if(i.getValue() == 1){
				if(i.getKey() < lowest){
					lowest = i.getKey();
				}
			}
		}
		
		if(lowest  < Integer.MAX_VALUE){
			for(int i = 0; i < tokens.length-1;i++){
				int num = Integer.getInteger(tokens[i]);
				if((lowest == num)){
					return i+1;
				}
				
			}
		}
		return 0;
	}

}
