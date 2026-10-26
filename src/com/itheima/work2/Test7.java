package com.itheima.work2;

public class Test7 {
    public static void main(String[] args){
        String s="Hello Worldht";
        int count=0;
        for (int i = s.length()-1; i> 0; i--) {
            char c=s.charAt(i);
            if(c!=' '){
                count++;
            }else{
                if(count>0)
                    break;
            }
        }
        System.out.println(count);
    }
}
