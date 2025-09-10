//write a java program to print the factorial number
package set_1_interview;
import java.util.*;

public class factrioal {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value:");
		int a = sc.nextInt();
		int product = 1;
		for(int i=1;i<=a;i++) {
			product=product*i;
		}
		System.out.println(product);
	}

}

