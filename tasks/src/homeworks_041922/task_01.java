package homeworks_041922;

import MyUtils.GenericUtils;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.Arrays;

public class task_01 {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.addAll(Arrays.asList("Blue","Red","White","Black"));
        System.out.println(colors);
        GenericUtils.Stars();
        for (String each:colors
             ) {
            System.out.println(each);
        }
    }
}
