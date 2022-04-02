package homeworks_310322;

import java.util.Scanner;

public class task_02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first number:");
        int number1=input.nextInt();
        System.out.println("Enter your second number:");
        int number2=input.nextInt();
        int total=number1+number2;
        System.out.println("Your total = " + total);
    }
}
