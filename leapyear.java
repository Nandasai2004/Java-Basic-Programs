package set_1_interview;
import java.util.*;

public class leapyear {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year:");
		int year = sc.nextInt();
		if((year % 400==0)||(year %4  == 0 && year%100!=0)) {
			System.out.println("Is a leap year:"+year);
			
		}else {
			System.out.println("Is not a leap year:"+year);
		}
		
	}

}
