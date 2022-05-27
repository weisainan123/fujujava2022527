package Test;
import java.util.Scanner;

public class Circulation {
    public static void main(String[] args){
        /*
        for(循环变量初始化;循环条件;循环变量迭代){
            循环操作（可以多条语句）;
        }
        如果 循环操作（语句）只有一条语句，可以省略{},建议不省略
         */
        //打印10句话 hello world
        for(int i = 1;i<=10;i++){
            System.out.println("hello world"+i);
        }

        /*
        for循环细节
        循环条件时返回一个布尔值的表达式；
        for(;循环判断条件;)中的初始化和变量迭代可以写到其他地方，但是两边的分号不能省略；
        循环初始值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开，循环变量迭代也可以有多条变量迭代语句，中间用逗号隔开
         */
        //for(;循环判断条件;)中的初始化和变量迭代可以写到其他地方，但是两边的分号不能省略；
        int l = 1;
        for(;l<11;){
            System.out.println("hello world"+l);
            l++;
        };
        //循环初始值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开，循环变量迭代也可以有多条变量迭代语句，中间用逗号隔开
//        for(int i = 1,m = 2;i<=10;i++,m++){
//            System.out.println("i="+i+"----m="+m);
//        };

        //for循环题目
        //打印1~100之间所有是9的倍数的整数，统计个数及和
        //1、化繁为简 复杂需求简单化
        //2、先死后活 先考虑固定值 然后转成可以灵活变化的值
//        int count = 0;
////        int sum = 0;
////        for(int a = 1;a<101;a++){
////            if(a % 9 == 0){
////                System.out.println("a="+a);
////                count++;
////                sum = sum+a;//累积
////            };
////        };
////        System.out.println("count="+count);
////        System.out.println("sum="+sum);

        /*
        do while
        循环条件是返回一个布尔值的表达式
        do while循环是先执行，再判断，因此至少执行一次
         */
        //题目1、统计1-200之间能被5整除不能被3整除的个数
        //化繁为简 （1）使用do while输出1-200  （2）过滤能被5整除不能被3整除的数 %  （3）统计满足条件的个数 int count = 0
        //先死后活 （1）范围的值 1-200你可以做出变量   （2）能被5整除但不能被3整除的，5和3可以改成变量
//        int num1 =1;
//        int count1 = 0;
//        do{
//            if(num1%5 ==0 && num1%3 !=0){
//                System.out.println("---------do while循环题目-----------");
//                System.out.println("1-200之间能被5整除不能被3整除的数"+num1);
//                count1++;
//            }
//            num1++;
//
//        }while(num1<201);
//        System.out.println("count1="+count1);

        //题目2、如果张三不还钱，老李将一直使出五连鞭，直到李三说还钱
//        Scanner myScanner = new Scanner(System.in);
//        char answer = ' ';
//        do{
//            System.out.println("老李问还钱么?y/t");
//            answer = myScanner.next().charAt(0);
//            System.out.println("他的回答是"+answer);
//        }while(answer != 't');


        /*
        多重循环
         */
        //题目1、统计3个班成绩情况，每个班有五名学生，求出各个班的平均分和所有班级的平均分【学生成绩从键盘输入】
//        Scanner myScanner1 = new Scanner(System.in);
//        for(int i = 1;i<4;i++){
//            double sum1 = 0;
//            for(int j = 1;j<6;j++){
//                System.out.println("请输入第"+i+"班级，第"+j+"个学生的成绩：");
//                double score = myScanner1.nextDouble();
//                System.out.println("第"+j+"个学生的成绩是"+score);
//                sum1 = sum1+score;//累计
//            }
//            System.out.println("五个学生的成绩和"+sum1);
//            double average = sum1/5;
//            System.out.println("第"+i+"个班级的平均分是"+average);
//        }



        //题目2、统计三个班及格人数，每个班有五名学生
//        Scanner myScanner2 = new Scanner(System.in);
//        for(int s = 1;s<4;s++){
//            int num2 = 0;
//            for(int f = 1;f<6;f++){
//                System.out.println("请输入第"+s+"班级，第"+f+"个学生的成绩：");
//                double score = myScanner2.nextDouble();
//                System.out.println("第"+f+"个学生的成绩是"+score);
//                if(score >= 60){
//                    num2++;
//                    System.out.println(num2);
//                }
//            }
//            System.out.println("这个班级及格人数"+num2);
//        }


            //题目3、打印出九九乘法表
//        for(int c = 0;c<10;c++){
//            for(int d = 1;d<=c;d++){
//                int sum2 = c*d;//接收值
//                System.out.print(c+"*"+d+"="+sum2+"\t");
//            }
//            System.out.println();//换行
//        }


        //题目4、打印金字塔  e 层数
//        for(int e = 1;e<=5;e++){
//            //输出空格   每行对应空格=总数-层数
//            for(int h=1;h<=5-e;h++){
//                System.out.print(" ");
//            }
//            //输出*
//            for(int k = 1;k<=2*e-1;k++){
//                if(k==1 || k==2*e-1 || e==5){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();//换行
//        }

        int z;//层数
        int x;//每层*个数
        int v;//每层空格数
        for(z=1;z<=5;z++){
            for(v=1;v<=5-z;v++){
                System.out.print(" ");
            }
            for(x=1;x<=z*2-1;x++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
