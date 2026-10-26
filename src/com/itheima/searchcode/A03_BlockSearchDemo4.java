package com.itheima.searchcode;

public class A03_BlockSearchDemo4 {
    //二分查找扩展
    public static void main(String[] args){
        int[] arr={27,22,30,40,36,13,19,16,20,7,10,43,50,48};
        Block1 b1=new Block1(22,40,0,4);
        Block1 b2=new Block1(13,20,5,8);
        Block1 b3=new Block1(7,10,9,10);
        Block1 b4=new Block1(43,50,11,13);
        Block1[] blockArr={b1,b2,b3,b4};
        int num=48;
        System.out.println(getIndex(blockArr,arr,num));
    }
    public static int getIndex(Block1[] blockArr,int[] arr,int num){
        int index=indexBlock(blockArr,num);
        if(index==-1){
            return -1;
        }
        int startIndex=blockArr[index].getStartIndex();
        int endIndex=blockArr[index].getEndIndex();
        for(int i=startIndex;i<=endIndex;i++){
            if(arr[i]==num){
                return i;
            }
        }return -1;
    }
    public static int indexBlock(Block1[] blockArr,int num){
        for (int i = 0; i < blockArr.length; i++) {
            if(num>=blockArr[i].getMin()&&num<=blockArr[i].getMax()){
                return i;
            }
        }return -1;
    }
}
class Block1{
    private int min;
    private int max;
    private int startIndex;
    private int endIndex;

    public Block1() {
    }

    public Block1(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}
