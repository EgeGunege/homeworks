package homeworks_310322;

import java.util.Scanner;

public class task_22 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your number:");
        int n1= input.nextInt();
        boolean result=false;
        for (int i=2;i<=n1/2;i++){
            if (n1%i==0){
                result=true;
                break;
            }
        }
        if(!result){
            System.out.println(n1+" is prime number.");
        }else{
            System.out.println(n1+" is not prime number.");
        }
    }
}
