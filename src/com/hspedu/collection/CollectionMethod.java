package com.hspedu.collection;

import java.util.List;
import java.util.ArrayList;
public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args){
        List list=new ArrayList();
        list.add("jack");
        list.add(10);
        list.add("tom");
        System.out.println("list="+list);
        list.remove(new Integer(10));
        System.out.println("list="+list);
        System.out.println(list.contains("jack"));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println("list="+list);
        ArrayList list2=new ArrayList();
        list2.add("红楼梦");
        list2.add("西游记");
        list.addAll(list2);
        System.out.println("list="+list);
        System.out.println(list.containsAll(list2));
        list.removeAll(list2);
        System.out.println("list="+list);

    }
}
