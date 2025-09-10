//Find the largest among three numbers

package set_1_interview;
import java.util.*;

public class largestnumberusing3rd {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a:");
		int a = sc.nextInt();
		System.out.print("Enter the value of b:");
		int b = sc.nextInt();
		System.out.print("Enter the value of c:");
		int c = sc.nextInt();
		if(a>b) {
			System.out.println("The largest number is :"+a);
		}else if(b>c) {
			System.out.println("The largest number is:"+b);
		}else if(c>a) {
			System.out.println("The largest number is :"+c);
		}else {
			System.out.println("All values are equal");
		}
	}

}
