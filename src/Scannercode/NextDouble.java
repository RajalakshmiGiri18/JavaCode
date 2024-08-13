package Scannercode;

import java.util.Scanner;

public class NextDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Double value");
		double value=input.nextDouble();
		System.out.println("Entered Double value is : "+ value);
		input.close();

	}

}
