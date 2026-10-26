package com.studentsystem;
import java.util.Scanner;
import java.util.ArrayList;
public class StudentSystem {
    static ArrayList<Student> list=new ArrayList<>();
    public static void start(){
        while (true) {
            System.out.println("---------------欢迎来到黑马学生管理系统---------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择");
            Scanner sc=new Scanner(System.in);
            String choose=sc.next();
            switch(choose){
                case "1" -> addStudent();
                case "2" -> deleteStudent();
                case "3" -> updateStudent();
                case "4" -> queryStudent();
                case "5" -> {
                    System.out.println("5.已退出黑马学生管理系统");
                    //System.exit(0);
                    return;
                }
                default -> System.out.println("没有这个选项，请重新输入");
            }
        }
    }
    public static void addStudent(){
        System.out.println("1.添加学生");
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入id");
            String id=sc.next();
            if(isIdExists(id,list)!=-1) {
                System.out.println("id已存在，请重新输入！");
            }else{
                Student s=new Student();
                s.setId(id);
                System.out.println("请输入学生姓名");
                String name=sc.next();
                s.setName(name);
                System.out.println("请输入学生的年龄");
                String age=sc.next();
                s.setAge(age);
                System.out.println("请输入学生的住址");
                String adress=sc.next();
                s.setAdress(adress);
                list.add(s);
                System.out.println("添加成功");
                break;
            }
        }

    }
    public static void deleteStudent(){
        System.out.println("2.删除学生");
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入要删除学生的id");
            String id=sc.next();
            int index=isIdExists(id,list);
            if(index==-1){
                System.out.println("id不存在");
                break;
            }else{
                list.remove(index);
                System.out.println("删除成功");
                break;
            }
        }
    }
    public static void updateStudent(){
        System.out.println("3.修改学生");
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入要修改的学生的id");
            String id=sc.next();
            int index=isIdExists(id,list);
            if(index==-1){
                System.out.println("id不存在");
                break;
            }else{
                System.out.println("请重新输入学生姓名");
                list.get(index).setName(sc.next());
                System.out.println("请重新输入学生的年龄");
                list.get(index).setAge(sc.next());
                System.out.println("请重新输入学生的住址");
                list.get(index).setAdress(sc.next());
                System.out.println("修改成功");
                break;
            }
        }
    }
    public static void queryStudent(){
        System.out.println("4.查询学生");
        if(list.size()==0){
            System.out.println("当前无学生信息,请添加后再查询");
        }else{
            System.out.println("id\t\t姓名\t年龄\t家庭住址");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getId()+"\t"+list.get(i).getName()+"\t"+list.get(i).getAge()+"\t"+list.get(i).getAdress());
            }

        }
        System.out.println("查询完毕，按回车键返回主菜单");
        Scanner sc=new Scanner(System.in);
        sc.nextLine();
    }
    public static int  isIdExists(String id,ArrayList<Student> list){
        for(int i=0;i< list.size();i++){
            Student stu=list.get(i);
            String id1=stu.getId();
            if(id.equals(id1)){
                return i;
            }
        }return -1;
    }
}

