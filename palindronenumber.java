package set_1_interview;
import java.util.*;

public class palindronenumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		int orginal = num;
		int reversed =0;
		while(num!=0) {
			int digit = num%10;
			reversed=reversed*10+digit;
			num= num/10;
		}
		if(orginal==reversed) {
			System.out.println("Is a palindrone number:"+orginal);
		}else {
			System.out.println("Is not a palindrone number:"+orginal);
		}
		
	}

}
