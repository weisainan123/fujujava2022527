package Test;
import java.util.Scanner;//表示把java.util下的Scanner类导入

public class JpInput {
    public static void main(String[] args){
        //Scanner类表示 简单文本扫描器，在java.util包
        /*
        1、引入Scanner类导入包
        2、创建Scanner类对象，new 创建一个对象
         */
        Scanner myScanner = new Scanner(System.in);
        //3、接受用户输入
        System.out.println("请输入名字：");
        //4、当程序执行到 next 方法时，会等待用户输入
        String name = myScanner.next();//接受用户输入字符串
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();//接受用户输入int
        System.out.println("请输入分数：");
        Double sal = myScanner.nextDouble();//接受用户输入double
        System.out.println("——----学生信息如下----——");
        System.out.println("姓名：" + name + "年龄：" + age + "分数：" + sal);
    }

}
