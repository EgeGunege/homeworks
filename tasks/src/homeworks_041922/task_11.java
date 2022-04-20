package homeworks_041922;

import MyUtils.GenericUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task_11 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        ArrayList<Integer> numbers2=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(numbers.equals(numbers2));
        GenericUtils.Stars();
        boolean b1=numbers.equals(numbers2);
        System.out.println(b1);
    }
}
