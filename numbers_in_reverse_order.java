package set_1_interview;

import java.util.Scanner;

public class numbers_in_reverse_order {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		for(int i =n;i>=1;i--) {
			System.out.println(i+" ");
		}
	}

}
