package com.itheima.searchcode;



public class Test2 {
    //不死神兔解法1
    /*public static void main(String[] args){
        System.out.println(getSum(6));
    }
    public static int getSum(int month){
        if(month==1||month==2){
            return 1;
        }
        return getSum(month-1)+getSum(month-2);
    }*/
    public static void main(String[] args){
        int[] arr=new int[12];
        arr[0]=1;
        arr[1]=1;
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[11]);
    }

}
