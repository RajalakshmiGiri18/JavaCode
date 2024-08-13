package Scannercode;
import java.util.Scanner;

public class NextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the name :");
		String value= input.nextLine();
		System.out.println("Entered name is ..."+value);
		input.close();
	}

}
