package homeworks_041922;

import java.util.ArrayList;
import java.util.Arrays;

public class task_13 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(numbers);//[1, 2, 3, 4, 5, 6, 7, 8, 9]
        Integer [] numbers2={10,11,12,13,14,15};
        numbers.addAll(Arrays.asList(numbers2));
        System.out.println(numbers);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
    }
}
