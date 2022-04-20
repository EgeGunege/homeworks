package homeworks_041922;

import java.util.ArrayList;
import java.util.Arrays;

public class task_08 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(numbers);//[1, 2, 3, 4, 5, 6, 7, 8, 9]
        ArrayList<Integer> numbers2=new ArrayList<>();
        numbers2=numbers;
        System.out.println(numbers2);//[1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
