package CaseStudy;
import java.util.Scanner;

public class LarNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=input.nextInt();
		System.out.println("Enter the second number");
		int b=input.nextInt();
		System.out.println("Enter the third number");
		int c=input.nextInt();
		int temp,lar;
		temp=a>b?a:b;
		lar=temp>c?temp:c;
		System.out.println("The largest number is "+lar);
		
		

	}

}
