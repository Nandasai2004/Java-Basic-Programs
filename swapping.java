// write a java program to swapping the numbers:
package set_1_interview;
import java .util.*;

public class swapping {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a:");
		int a = sc.nextInt();
		System.out.print("Enter the value of b:");
		int b = sc.nextInt();
		int temp = a;
		a=b;
		b=temp;
		System.out.println("After swapping:"+a);
		System.out.println("After Swapping:"+b);
		
	}
	
	

}
