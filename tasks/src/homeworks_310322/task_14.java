package homeworks_310322;

import java.util.Scanner;

public class task_14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i,fact=1;
        System.out.println("Enter your number:");
        int number= input.nextInt();
        if (number==0) {
            System.out.println("Factorial of "+number+" is: 1");
        }else{
            for(i=1;i<=number;i++){
                fact=fact*i;
            }
            System.out.println("Factorial of "+number+" is: "+fact);
    }
}
}
