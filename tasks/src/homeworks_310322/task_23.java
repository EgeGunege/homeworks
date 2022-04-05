package homeworks_310322;

import java.util.Scanner;

public class task_23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your number:");
        int n1= input.nextInt();
        System.out.println("Please enter your second number:");
        int n2= input.nextInt();
        while (n1 < n2) {
            boolean b1= false;

            for(int i = 2; i <= n1/2; ++i) {
                if(n1 % i == 0) {
                    b1= true;
                    break;
                }
            }

            if (!b1 && n1 != 0 && n1 != 1)
                System.out.print(n1 + " ");

            ++n1;
        }
    }
}