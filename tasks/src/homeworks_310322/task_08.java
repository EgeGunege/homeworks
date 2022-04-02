package homeworks_310322;

import java.util.Scanner;

public class task_08 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your letter:");
        char c1=input.next().charAt(0);
        if (c1=='a'||c1=='A'||c1=='e'||c1=='E'||c1=='i'||c1=='I'||c1=='o'||c1=='O'||c1=='u'||c1=='U'){
            System.out.println(c1+" is vowel.");
        }else{
            System.out.println(c1+" is consonant.");
        }

    }
}
