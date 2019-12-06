package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Mathematics {

    public String add (String x, String y) {
        return x.concat(y);
    }

       public double add (double x, double y){
        return x += y;
    }

    public int add (int x, int y){
        return x += y;
    }

    public int[] add (int[] array1, int[] array2){
        int [] result = Arrays.copyOf(array1, array1.length + array2.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }


    public List add (List list1, List list2){
        list1.addAll(list2);
        return list1;
    }

    public Map add (Map map1, Map map2){
        map1.putAll(map1);
        return map1;
    }

}
