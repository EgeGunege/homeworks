package homeworks_033122;

import java.util.Scanner;

public class task_18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your number:");
        int number= input.nextInt();
        int l=String.valueOf(number).length();
        System.out.println("Number of digits is "+l);

        System.out.println("**************");

        int digit=0;
        while(number>0){
            digit+=1;
            number=number/10;
        }
        System.out.println("Number of digits is " + digit);
    }
}
