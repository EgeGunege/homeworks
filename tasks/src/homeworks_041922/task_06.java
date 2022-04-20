package homeworks_041922;

import MyUtils.GenericUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class task_06 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(numbers.contains(5));//true
        GenericUtils.Stars();
        boolean b1=numbers.contains(5);
        System.out.println(b1);//true

    }
}
