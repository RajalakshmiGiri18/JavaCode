package CaseStudy;

import java.util.Scanner;

public class AbsNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,res;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number");
		num=input.nextInt();
		res=Math.abs(num);
		System.out.println("The absolute value of the number is "+res);
		
	}

}
