package ArmstrongNumbers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File file = new File(args[0]);
		 try{
	        BufferedReader buffer = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = buffer.readLine()) != null) {
	            line = line.trim();
	            // Process line of input Here
	            String result = isArmstrong(line) == true? "True":"False";
	            System.out.println(result);
	        }
	        
		 }catch (Exception e){
			 
			 
		 }
	}
	
	public static boolean isArmstrong(String num){
		if(num != null && num.compareTo("") != 0){
			char[] number = num.toCharArray();
			int originalNum = Integer.parseInt(num);
			int sum = 0;
			for(int i = 0; i < num.length(); i++){
				sum += Math.pow(Integer.parseInt(Character.toString(number[i])), num.length());
			}
			if(sum == originalNum) return true;
		}
		return false;
	}

}
