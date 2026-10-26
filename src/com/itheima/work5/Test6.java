package com.itheima.work5;
//System的方法类
public class Test6 {
    public static void main(String[] args){
        //终止当前运行的虚拟机
        /*0:正常停止
        非0：异常停止
        System.exit(0);
        System.out.println("看看执行了吗");
         */

        //long currentTimeMillis() 返回当前系统的时间毫秒值形式
        /*long start=System.currentTimeMillis();
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
        long end=System.currentTimeMillis();
        System.out.println(end-start);
         */
        //拷贝数组
        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        int[] arr2=new int[10];
        System.arraycopy(arr1,0,arr2,0,10);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
