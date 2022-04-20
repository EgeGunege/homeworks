package homeworks_033122;

import java.util.Scanner;

public class task_19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number:");
        int number=input.nextInt();
        String reverseNumber="";

        int length=String.valueOf(number).length();
        int lastIndex=length-1;

        for (int i=lastIndex; i>=0; i--){
            reverseNumber+=String.valueOf(number).charAt(i);
        }
        System.out.println("Your words reverse type: " + reverseNumber);
    }
}
