package com.itheima.work4;
//数字加密
public class Test5 {
    public static void main(String[] args){
        int m=12345;
        int count=0;
        int n=m;
        while(m!=0){
            m=m/10;
            count++;
        }
        int[] arr=new int[count];
        int index=arr.length-1;
        while(n!=0){
            int ge=n%10;
            n=n/10;
            arr[index]=ge;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(arr[i]+5)%10;
        }
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            num=num*10+arr[i];
        }
        System.out.println(num);
    }

}
