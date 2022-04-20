package homeworks_033122;

import java.util.Scanner;

public class task_25 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to calculator.");
        System.out.println("Please enter your first number:");
        int n1= input.nextInt();
        System.out.println("Please enter your second number:");
        int n2= input.nextInt();
        System.out.println("Please enter your process:");
        System.out.println("For Sub:-, Sum:+, Div:/, Mlt:*");
        char ch=input.next().charAt(0);
        String r;
        int n3=0;
        switch (ch){
            case '+':n3=n1+n2;
                r=n1+"+"+n2+"="+n3;
                break;
            case '-':n3=n1-n2;
                r=n1+"-"+n2+"="+n3;
                break;
            case '/':n3=n1/n2;
                r=n1+"/"+n2+"="+n3;
                break;
            case '*':n3=n1*n2;
                r=n1+"*"+n2+"="+n3;
                break;
            default:r="Wrong process, please enter correct";
        }
        System.out.println(r);
        System.out.println("Thanks for using.");
    }
}
