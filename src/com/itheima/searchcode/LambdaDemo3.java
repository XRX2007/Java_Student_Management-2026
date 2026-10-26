package com.itheima.searchcode;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo3 {
    public static void main(String[] args){
        String[] arr={"a","aaa","aaaa","aa"};
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, (String o1, String o2)-> {
                return o1.length()-o2.length();
            }
        );
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, ( o1,  o2)->o1.length()-o2.length());
        System.out.println(Arrays.toString(arr));
    }
}
