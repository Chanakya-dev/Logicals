package Integer;
import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
    	System.out.println("Enter Number");
        int num = in.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
                System.out.println("Factors: " + i);
            }
        }

        if (sum == num) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}
