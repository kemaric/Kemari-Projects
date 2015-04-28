package SumOfDigits;

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
		// TODO Auto-generated method stub
		 File file = new File(args[0]);
	        BufferedReader buffer = null;
			try {
				buffer = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        String line;
	        try {
				while ((line = buffer.readLine()) != null) {
				    line = line.trim();
				    // Process line of input Here
				    System.out.println(sumDigits(line));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	
	public static int sumDigits(String number){
		if(number.length() <= 0)
			return 0;
		if(number.length() == 1)
			return Integer.getInteger(number);
		int sum = 0;
		char [] nums = number.toCharArray();
		for(int i = 0; i < number.length(); i++){
			int x =  Integer.parseInt(Character.toString(nums[i]));
			sum+=x;
		}
		return sum;
	}

}
