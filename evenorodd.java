//write a java program to print even or odd
package set_1_interview;

import java.util.Scanner;

public class evenorodd {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a:");
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println("The given number is even");
		}else {
			System.out.println("The given number is odd");
		}
	}
	

}
