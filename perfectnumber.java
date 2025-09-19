package set_1_interview;

import java.util.Scanner;

public class perfectnumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=n/2;i++) {
			if(n%1==0) {
				sum+=i;
			}
		}
		if(sum==n&&n!=0) {
			System.out.println("Is a perfect number:"+n);
		}else {
			System.out.println(n + "Is not a perfect number:");
		}
		sc.close();
	}
	

}
