package set_1_interview;
import java.util.*;

public class countnumberofdigits {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an numbers:");
		int num = sc.nextInt();
		int count =0;
		while(num>0) {
			num/=10;
			count++;
		}
		System.out.println("The number of digits are:"+count);
	}

}
