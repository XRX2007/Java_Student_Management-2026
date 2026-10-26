package com.itheima.work2;

public class Test3 {
    public static void main(String[] args){
        String str1="abcde";
        String str2="cdeab";
        boolean str=change(str1,str2);
        System.out.println(str);
    }
    public static boolean change(String str1,String str2){
        for (int i = 0; i < str1.length(); i++) {
            str1=rotate(str1);
            if(str1.equals(str2)){
                return true;
            }
        }return false;
    }
    public static String rotate(String str1){
        char[] arr=str1.toCharArray();
        char first=arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=first;
        String result=new String(arr);
        return result;
    }
}
