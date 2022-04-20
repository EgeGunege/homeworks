package homeworks_041922;

import MyUtils.GenericUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task_FirstQuestion {
    public static void main(String[] args) {
        ArrayList<Double> dList=new ArrayList<>();
        ArrayList<Integer> iList=new ArrayList<>();
        ArrayList<String> sList=new ArrayList<>();
        //********************
        dList.add(1.0);
        dList.add(2.0);
        dList.add(3.0);
        dList.add(4.0);
        dList.add(5.0);
        //********************
        sList.add("One");
        sList.add("Two");
        sList.add("Three");
        sList.add("Four");
        sList.add("Five");
        //********************
        iList.add(1);
        iList.add(2);
        iList.add(3);
        iList.add(4);
        iList.add(5);
        //********************
        dList.remove(0);
        dList.remove(2.0);
        //********************
        System.out.println(dList.size());
        System.out.println(iList.size());
        System.out.println(iList.size());
        GenericUtils.Stars();
        System.out.println(sList.indexOf(sList.get(sList.size()-1)));
        GenericUtils.Stars();
        System.out.println(sList.contains("Five"));
        GenericUtils.Stars();
        Collections.sort(sList);
        for (int i = 0; i < sList.size(); i++) {
            System.out.println(sList.get(i));
        }
        GenericUtils.Stars();
        dList.clear();
        iList.clear();
        sList.clear();
        System.out.println(dList.isEmpty());
        System.out.println(iList.isEmpty());
        System.out.println(sList.isEmpty());
        //********************
        dList.addAll(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0));
        iList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        sList.addAll(Arrays.asList("One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"));
        //********************
        dList.contains(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0));//true
        sList.contains(Arrays.asList("One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"));//true
        iList.contains(Arrays.asList(1,2,3,4,5,6,7,8,9,10));//true
        GenericUtils.Stars();
        dList.retainAll(Arrays.asList(1.0,2.0,3.0,4.0,5.0));
        sList.retainAll(Arrays.asList("One","Two","Three","Four","Five"));
        iList.retainAll(Arrays.asList(1,2,3,4,5));
        System.out.println(dList);
        System.out.println(sList);
        System.out.println(iList);
        GenericUtils.Stars();
        dList.removeAll(Arrays.asList(5.0,4.0,3.0));
        iList.removeAll(Arrays.asList(5,4,3));
        sList.removeAll(Arrays.asList("Five","Four","Three"));
        System.out.println(dList);
        System.out.println(sList);
        System.out.println(iList);










    }
}
