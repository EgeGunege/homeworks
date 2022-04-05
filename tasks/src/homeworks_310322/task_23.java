package homeworks_310322;

import java.util.Scanner;

public class task_23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your number:");
        int n1= input.nextInt();
        System.out.println("Please enter your second number:");
        int n2= input.nextInt();
        String primeNumbers="";
        while (n1 < n2) {
            boolean flag = false;

            for(int i = 2; i <= n1/2; ++i) {
                // condition for nonprime number
                if(n1 % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && n1 != 0 && n1 != 1)
                System.out.print(n1 + " ");

            ++n1;
        }
    }
}