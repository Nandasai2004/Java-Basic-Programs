package set_1_interview;
import java.util.*;

public class primenumber {
//	public static void main(String[]args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the number:");
//		int num = sc.nextInt();
//		int count =0;
//		
//		for(int i=1;i<=num;i++) {
//			if(num%i==0){
//				count++;
//			}
//		}
//		if(count==2) {
//			System.out.println("Prime number:"+num);
//		}else {
//			System.out.println("Is not a prime number:"+num);
//		}
//	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		int count =0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime number:"+num);
		}else {
			System.out.println("Is not a prime number:"+num);
		}
	}
	
	

}
