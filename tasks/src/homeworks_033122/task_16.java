package homeworks_033122;

import java.util.Scanner;

public class task_16 {
    public static void main(String[] args) {

        int i = 1, t1 = 0, t2 = 1;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your number:");
        int n=input.nextInt();
        System.out.println("Fibonacci Series till " + n + " terms:");

        while (i <= n) {
            System.out.print(t1 + ", ");

            int t3 = t1 + t2;
            t1 = t2;
            t2 = t3;

            i++;
        }
    }
}
