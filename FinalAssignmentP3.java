package ineuron;



import java.io.*;
import java.util.Scanner;
public class FinalAssignmentP3  {
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("user please enter first integer");
		int a = sc1.nextInt();
		System.out.println("user please enter second integer");
		int b = sc1.nextInt();
		try {
			System.out.println(a / b); // throw Exception
		}
		catch (ArithmeticException e) {
			// Exception handler
			System.out.println(
				"Divided by zero operation cannot possible");
		}
	}
}

