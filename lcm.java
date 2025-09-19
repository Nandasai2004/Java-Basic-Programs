package set_1_interview;

import java.util.Scanner;

public class lcm {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number1:");
		int a = sc.nextInt();
		
		System.out.print("Enter a number 2:");
		int b = sc.nextInt();
		
		int num1 = a,num2=b;
		
		while(b!=0) {
			int temp = b;
			b = a%b;
			a = temp;
			
		}
		int gcd = a;
		int lcm = (num1*num2)/gcd;
		System.out.println("LCM is:"+lcm);
	}

}
