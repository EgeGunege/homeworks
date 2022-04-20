package homeworks_041922;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task_12 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(numbers);//[1, 2, 3, 4, 5, 6, 7, 8, 9]
        Collections.swap(numbers,8,0);
        System.out.println(numbers);//[9, 2, 3, 4, 5, 6, 7, 8, 1]
    }
}
