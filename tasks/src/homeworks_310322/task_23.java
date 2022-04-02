package homeworks_310322;

import java.util.Scanner;

public class task_23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your number:");
        int n1= input.nextInt();
        System.out.println("Please enter your second number:");
        int n2= input.nextInt();
        String primeNumbers="";
        for (int i = 1; i <= n2; i++)
        {
            int counter=0;
            for(int l=n1; l<=n2; n2--)
            {
                if(l%n2==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to n are :");
        System.out.println(primeNumbers);
    }
}
