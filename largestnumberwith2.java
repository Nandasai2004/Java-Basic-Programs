//write a java program to find the largest of 2 numbers
package set_1_interview;
import java.util.*;

public class largestnumberwith2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a:");
		int a = sc.nextInt();
		System.out.print("Enter the value of b:");
		int b = sc.nextInt();
		if(a>b) {
			System.out.println("The largest number is :"+a);
		}else if(a<b) {
			System.out.println("The largest number is:"+b);
		}else {
			System.out.println("Both are equal");
		}
	}

	
	
}
