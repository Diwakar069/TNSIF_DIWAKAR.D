package basic.java;
import java.util.Scanner;
public class Addition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no:1: ");
		int a = scan.nextInt();
		System.out.println("enter no:2: ");
		int b = scan.nextInt();
		int res =a+b;
		System.out.println("Addition of "+a+" and "+b+" is: "+res);

	}

}
