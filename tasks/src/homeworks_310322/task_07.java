package homeworks_310322;

import java.util.Scanner;

public class task_07 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your number:");
        int number=input.nextInt();
        String result;
        if (number%2==0){
            result="Number is Even Number";
        }else if(number%2!=0){
            result="Number is Odd Number";
        }else{
            result="Please enter number.";
        }
        System.out.println(result);
    }
}
