package homeworks_310322;

import java.util.Scanner;

public class task_13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your natural number:");
        int number= input.nextInt();
        int sum=0;
        for (int i=1;i<=number;i++){
            sum+=i;
        }
        System.out.println("Until "+number+" all numbers sum is "+sum);

    }
}
