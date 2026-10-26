package com.itheima.searchcode;
import java.util.Arrays;
public class MyArrayDemo1 {
    public static void main(String[] args){
        //toString将数组变成字符串
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------------------");
        //binarySearch二分查找法查找元素
        System.out.println(Arrays.binarySearch(arr,10));
        System.out.println(Arrays.binarySearch(arr,3));
        System.out.println(Arrays.binarySearch(arr,20));
        System.out.println("--------------------------------");
        //copyOf拷贝数组
        int[] newArr1=Arrays.copyOf(arr,20);
        System.out.println(Arrays.toString(newArr1));
        System.out.println("--------------------------------");
        //copyOfRange 指定范围拷贝数组(包头不包尾)
        int[] newArr2=Arrays.copyOfRange(arr,0,9);
        System.out.println(Arrays.toString(newArr2));
        System.out.println("--------------------------------");
        //fill填充数组
        Arrays.fill(arr,100);
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------------------");
        //sort 排序：快速排序
        int[] arr2={10,2,3,5,6,1,7,8,4,9};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
