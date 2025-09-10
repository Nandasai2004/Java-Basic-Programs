//Swap two numbers (without using third variable)

package set_1_interview;
import java.util.*;

public class largestnumberusing3rdvarible {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a:");
		int a = sc.nextInt();
		System.out.print("Enter b:");
		int b = sc.nextInt();
		System.out.println("Before Swapping a="+a+",b="+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After Swapping a="+a+",b="+b);
		
	}

}
