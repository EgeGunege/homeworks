package homeworks_310322;

import java.util.Scanner;

public class task_24 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1=1;
        int n2=0;
        System.out.println("Please enter your number:");
        int n3= input.nextInt();
        int n4=1;
        int n5=n3;
        int n6=n3;
        for( ;n3!=0;n3/=10){
            n1=n3%10;
        }
        while(n3>0){
            n1=n3%10;
            n4*=n1;
            n2+=n4;
            n3=n3/10;
        }

        System.out.println("n4 = " + n4);
        System.out.println("n5 = " + n5);
        System.out.println("n2 = " + n2);
        if(n5==n2){
            System.out.println("It's Armstrong Number");
        }else{
            System.out.println("It's not Armstrong Number");
        }
    }
}
