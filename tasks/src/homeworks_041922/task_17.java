package homeworks_041922;

import java.util.ArrayList;
import java.util.Arrays;

public class task_17 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int i=0;
        for (Integer each:numbers
             ) {
            System.out.println(i+" index of element "+each);
            i++;
        }
    }
}
