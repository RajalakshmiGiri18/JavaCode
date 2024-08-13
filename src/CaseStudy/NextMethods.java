package CaseStudy;

import java.util.Scanner;

public class NextMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		boolean flag;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the double value: ");
		a=input.nextDouble();
		System.out.println("Enter the boolean datatype");
		flag=input.nextBoolean();
		System.out.println("The Double datatype value is "+a);
		System.out.println("The boolean datatype value is "+flag);
		int ch;
		System.out.println("Enter the integer");
		if(input.hasNextInt())
		{
			ch=input.nextInt();
			System.out.println("You entered the number");
		}
		else
		{
			System.out.println("Invalid input");
		}
		input.nextLine();
		System.out.println("Enter the line of text");
		if(input.hasNextLine())
		{
			String line=input.nextLine();
			System.out.println("You entered the line of input");
		}
		else
		{
			System.out.println("No input detected");
		}
		System.out.println("Enter the pattern string");
		String pattern="program";
		//input.nextLine();
		if(input.hasNext(pattern))
		{
			System.out.println("Pattern matching");
		}
		else
		{
			System.out.println("No matching pattern");
		}
		
		
	

	}

}
