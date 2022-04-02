package homeworks_310322;

import java.util.Scanner;

public class task_05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number:");
        int n1= input.nextInt();
        System.out.println("Enter your dividing number:");
        int n2= input.nextInt();
        int d1=n1/n2;
        int r1=n1%n2;
        System.out.println(n1+" divided to "+n2+". Result: "+d1+". Reminder: "+r1+".");
    }
}
