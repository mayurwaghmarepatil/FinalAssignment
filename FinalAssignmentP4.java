package ineuron;

import java.util.Scanner;

public class FinalAssignmentP4 {
	static double bpin=1913;
	static double balance=10000;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("user please enter the pin number");
		double a=scan.nextDouble();
		
		if(a==bpin) {
			System.out.println("user please select the below optin");
			System.out.println("1:Deposite Money");
			System.out.println("2:Withdraw Money");
			System.out.println("3:Check Balance");
			int choice=scan.nextInt();
			
			if(choice==1) {
				System.out.println("Money deposite succesfully");
			}
			else if(choice==2) {
				System.out.println("money withdraw succesfully");
			}
			else if(choice==3) {
				System.out.println("your balance is"+balance);
			}
		}else {
			System.out.println("INVALID PIN ,user please enter Right pin");
		}
		}
		
		
	}


