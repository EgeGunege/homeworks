package homeworks_041922;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task_10 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(numbers);//[1, 2, 3, 4, 5, 6, 7, 8, 9]
        Collections.reverse(numbers);
        System.out.println(numbers);//[9, 8, 7, 6, 5, 4, 3, 2, 1]
    }
}
