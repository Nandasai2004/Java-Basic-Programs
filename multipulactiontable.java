package set_1_interview;
import java.util.*;

public class multipulactiontable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        
        for (int i = 1; i <= 10; i++) {
            int mul = num * i;
            System.out.println(num + " * " + i + " = " + mul);
        }

        sc.close();
    }
}
