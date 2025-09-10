//write a java program to print the addition of two numbers
package set_1_interview;
import java.util.*;

public class Addition {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the value of a:");
		int  a = sc.nextInt();
		System.out.print("Enter the value of b:");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("The addition of two numbers is:"+c);
		sc.close();
	}
	
	

}
