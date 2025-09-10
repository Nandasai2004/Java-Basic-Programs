// write a java  program to print positive/negative/zero
package set_1_interview;
import java.util.*;
public class positive_negative_zero {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value:");
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("Positive");
		}else if(a<0) {
			System.out.println("Negative");
		}else {
			System.out.println("Zero");
		}
	}
	

}
