package CaseStudy;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int val=input.nextInt();
		if(val%2==0)
		{
			System.out.println("The entered number is even");
		}
		else
		{
			System.out.println("The entered number is odd");
		}
	}

}
