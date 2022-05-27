package Test;

import java.util.Scanner;
public class Britch {
    public static void main(String[] args){
        /*
        1、switch 注意细节
        表达式数据类型，应和case后的常量类型一致，或者是可以自动转成可以相互比较的类型，比如输入的是字符，而常量是int
        switch(表达式)中表达式的返回值必须是：byte\short\int\char\enum\String
        case子句中的值必须是常量，而不能是变量
        default子句是可选的，当没有匹配的case时，执行default
        break语句用来执行完一个case分支后使用程序跳出switch语句块；如果没有写break,程序会顺序执行到switch结尾
         */
        char c = 'a';
        switch(c){
            case 'a':
                System.out.println("aaaaa");
                break;
            case 'b':
                System.out.println("bbbbb");
                break;
            case 'c':
                System.out.println("ccccc");
                break;

//            case"hello":     //表达式数据类型，应和case后的常量类型一致，
//                System.out.println("hello");
//                break;
            case 20:           //或者是可以自动转成可以相互比较的类型，比如输入的是字符，而常量是int
                System.out.println("hello20");
                break;
            default:
                System.out.println("ddddd");
        }

        /*2、练习题
        题目1：输入学生成绩>60  输出合格，反之不合格.提示：成绩/60；分数在0-100
         */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double d = myScanner.nextDouble();
        int n = (int)(d/60);
        switch(n){
            case 1:
                System.out.println("合格");
                break;
            case 0:
                System.out.println("不合格");
                break;
            default:
                System.out.println("输入分数不在范围内");
        }

        /*
        题目2：根据用于指定月份，打印该月份所属季节3.4.5春季、6.7.8夏季、9.1.11秋季、12.1.2冬季。提示：使用穿透
         */
        Scanner myScanner1 = new Scanner(System.in);
        System.out.println("输入月份：");
        int num1 = myScanner1.nextInt();
        switch(num1){
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("输入月份不对");
        }

    }
}
