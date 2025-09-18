package set_1_interview;

import java.util.Scanner;

public class armstrongnumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		int orginalnum = num;
		int n = String.valueOf(num).length();
		int sum = 0;
		while(num>0) {
			int digit=num%10;
			sum+=Math.pow( digit,n);
			num/=10;
		}
		if(sum==orginalnum) {
			System.out.println(orginalnum+" is a Armstrong number.");
		}else {
			System.out.println(orginalnum+" is Not a Armstrong number.");
		}
		sc.close();
	}

}
