package homeworks_033122;

import java.util.Scanner;

public class task_03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first float number:");
        float number1=input.nextFloat();
        System.out.println("Enter your second float number:");
        float number2=input.nextFloat();
        float total=number1*number2;
        System.out.println("Your total = " + total);;
    }
}
