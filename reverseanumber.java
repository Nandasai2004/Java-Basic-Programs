package set_1_interview;
import java.util.*;
public class reverseanumber {
//	public static void main(String[]args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the number:");
//		int num = sc.nextInt();
//		int reversed = 0;
//		while(num!=0) {
//			int digit =num%10;
//			reversed = reversed*10+ digit;
//			num = num/10;
//		}
//		System.out.println("The reverse number is :"+reversed);
//	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the values:");
		int num = sc.nextInt();
		int reversed = 0;
		while(num!=0) {
			int digit = num%10;
			reversed = reversed*10+digit;
			num=num/10;
		}
		System.out.println("After reversing the numbers are :"+reversed);
	}
	
	
	
	

}
