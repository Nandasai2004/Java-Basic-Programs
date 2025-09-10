//Fibonacci series

package set_1_interview;
import java.util.*;
public class fibnacoseried {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range:");
		int n=sc.nextInt();
		int fib1 = 0;
		int fib2 = 1;
		for(int i=1;i<=n;i++) {
			System.out.println(fib1+"  ");
			int nextnum = fib1+fib2;
			fib1=fib2;
			fib2=nextnum;
		}
		
		
	}
	

}
