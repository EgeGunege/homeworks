package homeworks_033122;

import java.util.Scanner;

public class task_11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your number:");
        int number= input.nextInt();
        String result=(number>0)?(number+" is positive number."):(number<0)?(number+" is negative number."):("Number is zero.");
        System.out.println(result);
    }
}
