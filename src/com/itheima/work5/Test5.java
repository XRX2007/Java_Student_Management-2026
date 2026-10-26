package com.itheima.work5;

public class Test5 {
    public static void main(String[] args){
        //统计有多少个水仙花数
        int count=0;
        for(int i=10000;i<100000;i++){
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/100%10;
            int qiang=i/1000%10;
            int wan=i/10000%10;
            int sum=(int)(Math.pow(ge,5)+Math.pow(shi,5)+Math.pow(bai,5)+Math.pow(qiang,5)+Math.pow(wan,5));
            if(sum==i){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
