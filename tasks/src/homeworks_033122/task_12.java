package homeworks_033122;

import java.util.Scanner;

public class task_12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your character:");
        char c=input.next().charAt(0);
        boolean b=(c>='a'&&c<='z')||(c>='A'&&c<='Z');
        String r=(b)?(c+" is an alphabet."):(c+" is not an alphabet.");
        System.out.println(r);
    }
}
