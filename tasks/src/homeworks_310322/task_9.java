package homeworks_310322;

import java.util.Scanner;

public class task_9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 3 number in the row.");
        int n1= input.nextInt();
        int n2= input.nextInt();
        int n3= input.nextInt();
        boolean b1=n1>n2&&n1>n3;
        boolean b2=n2>n1&&n2>n3;
        boolean b3=n3>n1&&n3>n2;
        int bigger=(b1)?n1:(b2)?n2:(b3)?n3:0;
        System.out.println("Bigger number = " + bigger);
    }
}
