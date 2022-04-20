package homeworks_041922;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task_07 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(11,5,7,3,22,18,1));
        System.out.println(numbers);//[11, 5, 7, 3, 22, 18, 1]
        Collections.sort(numbers);
        System.out.println(numbers);//[1, 3, 5, 7, 11, 18, 22]
    }
}
