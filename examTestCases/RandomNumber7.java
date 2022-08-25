package examTestCases;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber7 {

	public static void main(String[] args) {
				
// Finding nth smallest values from 500 random numbers...
		
		Integer[] randNum1 = new Integer[500];
		
		for(int i=0; i<500; i++) {
		int genNum_1 = generateRandomNo_1(500);
		
		randNum1[i] = genNum_1; // store to an array
		
		System.out.println("Random Number : " + genNum_1);
		
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Nth smallest number: ") ;
		int nthValue =  sc.nextInt();
		
		System.out.println("Array values sorted..");
		
		Arrays.sort(randNum1);
		for(int i=0; i<500; i++) {
		System.out.println(randNum1[i]);
		}
		if(nthValue<=500) {
			System.out.println("nth smallert value: "+ randNum1[nthValue-1]);
		}else {
			System.out.println("nth value entered should be <=500");
		}  
	}

	public static int generateRandomNo_1(int boundNo_1) {
		Random rnd = new Random();
		int generatedNo_1 = rnd.nextInt(boundNo_1);
		return generatedNo_1;
	}
	
}
