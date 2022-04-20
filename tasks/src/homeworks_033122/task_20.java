package homeworks_033122;

import java.util.Scanner;

public class task_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n1 = input.nextInt();
        System.out.println("Enter your power of number:");
        int n2 = input.nextInt();
        int n3=n2;
        long result = 1;
        while (n2 != 0) {
            result *= n1;
            --n2;
        }
        System.out.println(n1+" power of "+n3+" is "+result);
    }
}
