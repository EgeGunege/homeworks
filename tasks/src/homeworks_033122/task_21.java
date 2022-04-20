package homeworks_033122;

import java.util.Scanner;

public class task_21 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your word:");
        String word=input.nextLine();
        String reverseWord="";

        int length=word.length();
        int lastIndex=length-1;

        for (int i=lastIndex; i>=0; i--){
            reverseWord+=word.charAt(i);
        }

        if (word.equals(reverseWord)){
            System.out.println("It's palindrome.");
        }else{
            System.out.println("It's not palindrome.");
        }
    }
}
