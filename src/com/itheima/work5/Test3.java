package com.itheima.work5;
//正则表达式
public class Test3 {
    public static void main(String[] args){
        //电话号码
        String regex1="1[3-9]\\d{9}";
        System.out.println("13112345678".matches(regex1));
        System.out.println("18976545678".matches(regex1));
        System.out.println("139456790271".matches(regex1));
        System.out.println("----------------------------");
        //座机号码
        String regex2="0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(regex2));
        System.out.println("----------------------------");
        //邮箱
        String regex3="\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("zhangsan@itcast.com".matches(regex3));
        System.out.println("----------------------------");
        //身份证号码
        String regex4="[1-9]\\d{5}(1[89]|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}(\\d|(?i)x)";
        System.out.println("411528200708256640".matches(regex4));
        System.out.println("411528175609308849".matches(regex4));
        String regex5="[1-9]\\d{5}(?:18|19|20)\\d{2}(?:0[1-9]|10|11|12)(?:0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
    }
}
