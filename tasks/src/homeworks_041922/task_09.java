package homeworks_041922;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task_09 {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.addAll(Arrays.asList("Blue","Red","White","Black"));
        System.out.println(colors);//[Blue, Red, White, Black]
        Collections.shuffle(colors);
        System.out.println(colors);//[Red, Black, Blue, White]
    }
}
