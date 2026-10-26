package com.studentsystem;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class App {
    static ArrayList<User> list=new ArrayList<>();
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("--------欢迎来到学生管理系统----------");
            System.out.println("请选择操作：1.注册 2.登录  3.忘记密码  4.退出系统");
            String choose=sc.next();
            switch(choose){
                case "1" -> register();
                case "2" -> login();
                case "3" -> forgetPassword();
                case "4" -> {
                    System.out.println("感谢使用，系统已安全退出");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项，请重新输入");
            }
        }
    }
    public static void forgetPassword(){
        System.out.println("忘记密码");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名");
        String username=sc.next();
        //判断用户名是否注册
        boolean flag1=contains(username);
        if(!flag1){
            System.out.println("用户名未注册,请先注册");
            return;
        }
        System.out.println("请输入身份证号码");
        String personID=sc.next();
        System.out.println("请输入手机号码");
        String phoneNumber=sc.next();
        int per=getIndex(username);
        if(containsPersonId(personID,per)&&containsPhoneNumber(phoneNumber,per)){
            System.out.println("身份证号码和手机号码一致，请输入密码，进行修改");
            list.get(per).setPassword(sc.next());
            System.out.println("密码修改成功！");
        }
        else{
            System.out.println("账号信息不匹配，修改失败");
        }
    }
    public static void register(){
        System.out.println("注册");
        Scanner sc=new Scanner(System.in);
        String username,password,personID,phoneNumber;
        while (true) {
            System.out.println("请输入用户名");
            username=sc.next();
            boolean flag1=isValidUsername(username);
            if(!flag1){
                System.out.println("用户名不符合格式，请重新输入");
                continue;
            }
            boolean flag2=contains(username);
            if(flag2){
                System.out.println("用户名"+username+"已存在，请重新输入");
                continue;
            }else{
                System.out.println("用户名"+username+"可用");
                break;
            }
        }
        while (true) {
            System.out.println("请设置密码");
            String password1=sc.next();
            System.out.println("请再次输入密码");
            String password2=sc.next();
            if(!(password1.equals(password2))){
                System.out.println("密码输入不一致，请重新输入");
                continue;
            }else{
                System.out.println("密码设置成功，请记住密码");
                password=password2;
                break;
            }
        }
        while (true) {
            System.out.println("请输入身份证号码");
            personID=sc.next();
            boolean flag3=isValidPersomID(personID);
            if(!flag3){
                System.out.println("身份证号码输入格式不对，请重新输入");
                continue;
            }else{
                System.out.println("身份证号码输入正确");
                break;
            }
        }
        while (true) {
            System.out.println("请输入手机号码");
            phoneNumber=sc.next();
            boolean flag4=isValidPhoneNumber(phoneNumber);
            if(!flag4){
                System.out.println("手机号码输入格式不正确，请重新输入");
                continue;
            }else{
                System.out.println("手机号码成功输入");
                break;
            }
        }
        User u=new User(username,password,personID,phoneNumber);
        list.add(u);
    }
    public static void login(){
        System.out.println("登录");
        Scanner sc=new Scanner(System.in);
        while (true) {
            //随机生成一个验证码
            String realcode=createCode(5);
            System.out.println("本次的验证码为"+realcode);
            System.out.println("请输入用户名");
            String username=sc.next();
            System.out.println("请输入验证码");
            String code = sc.next();
            System.out.println("请输入密码");
            String password=sc.next();
            //判断用户名是否注册
            boolean flag1=contains(username);
            if(!flag1){
                System.out.println("用户名未注册,请先注册");
                return;
            }
            //判断验证码是否正确
            while(!code.equals(realcode)) {
                System.out.println("输入的验证码不正确，请重新输入");
                System.out.println("请输入验证码");
                code = sc.next();
            }
            System.out.println("输入的验证码正确");
            //判断密码和用户名是否输入正确，一共有三次机会
            int count=3;
            int per=getIndex(username);
            while(count>0) {
                if (!(contains(username) && containsPassword(password,per))) {
                    count--;
                    if(count>0){
                        System.out.println("用户名或密码错误，请重新输入,还剩下"+count+"次机会");
                        System.out.println("请输入用户名");
                        username=sc.next();
                        System.out.println("请输入密码");
                        password=sc.next();
                    }
                }else{
                    System.out.println("登录成功!欢迎您，"+username);
                    StudentSystem.start();
                    return;
                }
            }
            System.out.println("机会已用完,登录失败");
        }
    }
    public static String createCode(int length){
        Random r=new Random();
        char[] arr=new char[5];
        for (int i = 0; i < arr.length; i++) {
            int num1=r.nextInt(52);
            if(num1<26) {
                arr[i] =(char) (num1+ 'A');
            }else{
                arr[i] =(char) (num1-26+ 'a');
            }
        }
        int num2=r.nextInt(5);
        arr[num2]=(char)(r.nextInt(10)+'0');
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
    public static boolean contains(String username){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getUsername().equals(username)){
                return true;
            }
        }return false;
    }
    //per代表的是username下的密码个人信息等
    public static boolean containsPassword(String password,int per){
        if(list.get(per).getPassword().equals(password)){
            return true;
        }
        return false;
    }
    public static boolean containsPersonId(String personId,int per){
        if(list.get(per).getPersonID().equals(personId)){
            return true;
        }
        return false;
    }
    public static boolean containsPhoneNumber(String phoneNumber,int per){
        if(list.get(per).getPhoneNumber().equals(phoneNumber)){
            return true;
        }
        return false;
    }
    public static int getIndex(String username){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getUsername().equals(username)){
                return i;
            }
        }return -1;
    }
    public static boolean isValidUsername(String username){
        int len=username.length();
        if(len<3||len>15){
            return false;
        }
        /*for(int i=0;i<username.length();i++){
            char c=username.charAt(i);
            if(!((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9'))){
                return false;
            }
        }*/
        if(!(username.matches("[\\w&&[^_]]+"))){
            return false;
        }
        int count=0;
        /*for(int i=0;i<username.length();i++){
            char c=username.charAt(i);
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                count++;
                break;
            }
        }*/
        if(username.matches(".*[a-zA-Z].*")){
            count++;
        }
        return count>0;
    }
    public static boolean isValidPersomID(String personID){
        int len=personID.length();
        if(len!=18){
            return false;
        }
        if(personID.charAt(0)==0){
            return false;
        }
        /*for (int i = 0; i < personID.length()-1; i++) {
            char c=personID.charAt(i);
            if(c<'0'||c>'9'){
                return false;
            }
        }*/
        if(!personID.matches("[1-9]\\d{5}(?:18|19|20)\\d{2}(?:0[1-9]|10|11|12)(?:0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]")){
            return false;
        }
        /*int end=personID.length()-1;
        char c=personID.charAt(end);
        if(!((c>='0'&&c<='9')||c=='X'||c=='x')){
            return false;
        }*/
        return true;
    }
    public static boolean isValidPhoneNumber(String phoneNumber){

        if(!phoneNumber.matches("\\d{11}")){
            return false;
        }

        if(phoneNumber.charAt(0)==0){
            return false;
        }
        return true;
    }
}
