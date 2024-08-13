package Scannercode;

import java.util.Scanner;

public class NextInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the integer:");
		int data=input.nextInt();
		System.out.println("Entered integer is : "+data);
		input.close();

	}

}
