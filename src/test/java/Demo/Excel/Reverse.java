package Demo.Excel;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Provide the input");
		
		String name = scn.nextLine();
		
		System.out.println("Input provided is : " + name);  
		
		//String name = "Rajat Rana";
		
		int length = name.length();
		
		String reverse = "";
		
		for(int i = length-1; i>=0; i--) {
			
			reverse = reverse + name.charAt(i);
			
		}System.out.println(reverse);
		

	}

}

