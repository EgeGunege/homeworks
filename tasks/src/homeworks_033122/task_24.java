package homeworks_033122;

import java.util.Scanner;

public class task_24 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your number:");
        int myNumber= input.nextInt();
        int n2=myNumber;
        int n3=myNumber;
        int digit=0; // 4
        while (myNumber!=0){
            digit++;
            myNumber/=10;
        }


        int result=0;


        while (n2 !=0) {
            int temp1=1;

            int lastDigit = n2 % 10;

            for (int i = 1; i <= digit; i++) {
                temp1 *=  lastDigit;



            }
            result+=temp1;

            n2 /=10;
        }

        if(result==n3){
            System.out.println("Number is Armstrong number");
        }else{
            System.out.println("Number is not Armstrong number");
        }
    }
}
