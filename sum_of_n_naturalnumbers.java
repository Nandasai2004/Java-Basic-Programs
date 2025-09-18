package set_1_interview;

import java.util.Scanner;

public class sum_of_n_naturalnumbers {
	public static void main(String[]args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter n :");
		int n = sc.nextInt();
		int sum =0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Sum of First"+n+"natural numbers is :"+sum);
	}

}
