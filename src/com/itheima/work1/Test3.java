package com.itheima.work1;

public class Test3 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] copy=copyOfRange(arr,3,7);
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]+" ");
        }
    }
    public static int[] copyOfRange(int[] arr,int from,int to){
        int[] arr1=new int[to-from];
        int idnex=0;
        for (int i = from; i < to; i++) {
            arr1[idnex]=arr[i];
            idnex++;
        }return arr1;
    }
}
