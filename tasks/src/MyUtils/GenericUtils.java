package MyUtils;

import java.util.Arrays;

public class GenericUtils {
    public static void evenNumber(int i, int j){
        for (; i<=j ; i++) {
            if(i%2==0){
                System.out.println(i+", ");
            }
        }
    }
    public static void reverseString(String word) {
        String reverseWord="";
        for (int i=word.length()-1;i>=0;i--){
            reverseWord+=word.charAt(i);
        }
        System.out.println(reverseWord);
    }
    public static void reverseSentence(String sentence){
        String sentenceReverse="";
        String [] sentenceArray=sentence.split(" ");
        int arrayLenght=sentenceArray.length,i;
        for(i=arrayLenght-1;i>=0;i--){
            sentenceReverse+=sentenceArray[i]+" ";
        }
        System.out.println(sentenceReverse);
    }
    public static void maxNumber(int i,int j){
        if (i==j){
            System.out.print("Numbers are equal.");
        }else if(i>j){
            System.out.print(i);
        }else{
            System.out.print(j);
        }
    }
    public static void Stars(){
        System.out.println("*************************************");
    }
    public static void descendingSort(int [] arr){
        //first i will sort it and reverse the arrray
        //so i can have from large to small
        Arrays.sort(arr);

        int []descArr=new int[arr.length];
        int lastIndex= arr.length -1 ;

        for (int i =0 ; i < descArr.length ; i ++){
            //descArr[0] == arr[lastindex]
            //descArr[1] == arr[lastindex-1]
            //descArr[2] == arr[lastindex-2]
            //descArr[3] == arr[lastindex-3]
            //....
            //descarr[lastindex]==arr [0]
            descArr[i]=arr[lastIndex];
            lastIndex--;

        }

        System.out.println(Arrays.toString(descArr));
    }

    //create a return method that will print array in descending order
    //logic is to take an array and return that array in descending order
    //that means my return type is int []
    public static int [] descendingSort2(int [] arr){
        //first i will sort it and reverse the arrray
        //so i can have from large to small
        Arrays.sort(arr);

        int []descArr=new int[arr.length];
        int lastIndex= arr.length -1 ;

        for (int i =0 ; i < descArr.length ; i ++){
            //descArr[0] == arr[lastindex]
            //descArr[1] == arr[lastindex-1]
            //descArr[2] == arr[lastindex-2]
            //descArr[3] == arr[lastindex-3]
            //....
            //descarr[lastindex]==arr [0]
            descArr[i]=arr[lastIndex];
            lastIndex--;

        }

        return descArr;
    }

}
