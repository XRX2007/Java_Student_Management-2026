package com.itheima.searchcode;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo1 {
    public static void main(String[] args){

        Integer[] arr={2,3,1,5,6,7,8,4,9};
        /*
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr));
        */
        //lambda表达式
        Arrays.sort(arr, (Integer o1, Integer o2)-> {
                return o2-o1;
            }
        );System.out.println(Arrays.toString(arr));
        //lambda表达式省略写法
        Arrays.sort(arr, (o1,  o2)-> o2-o1);
        System.out.println(Arrays.toString(arr));

    }
}
