package Test;
import java.util.Scanner;

public class JumpControl {
    public static void main(String[] args){
        /*
       1、 break
        默认终止最近的一个循环；
        可以通过标签指定终止哪一层循环；
         */
        //题目：实现登录验证 有三次机会，如果用户名为“丁真”，密码“666” 提示登陆成功，
        // 否则提示还有几次登陆机会，请使用for+break完成
//        int chance = 0;//剩余机会
//        Scanner myScanner = new Scanner(System.in);
//        for(int q = 1;q <= 3;q++){
//            System.out.println("请输入用户名：");
//            String name = myScanner.next();
//            System.out.println("请输入密码：");
//            String pwd = myScanner.next();
//            if("丁真".equals(name) && "666".equals(pwd)){
//                System.out.println("恭喜 登陆成功");
//                break;
//            }
//            chance = 3-q;
//            System.out.println("剩余次数"+chance);
//        }

        /*
        2、continue
        结束本次循环，继续执行下次循环
        可以通过标签指明要跳过哪一层循环
         */
        //continue在while循环中的使用
//        int w = 1;
//        while(w <= 4){
//            w++;
//            if(w ==2){
//                continue;
//            }
//            System.out.println("w="+w);
//        }

        /*
        3、return
        return使用在方法上，表示跳出所在的方法
        如果return写在main方法，会退出程序
         */
        for(int i = 1;i<=5;i++){
            if(i==3){
                System.out.println("hahaha"+i);
                return;//break/continue   可将三者做对比
            }
            System.out.println("ninini");
        }
        System.out.println("go on...");


        /*
        本章作业
        1、某人有100000元，没经过一次路口，需要交费，规则如下：
        当现金>50000时，每次交5%
        当现金<=50000，每次交1000
        编程计算该人可以经过多少次路口，要求使用 while break方式完成
         */
//        int e = 0;//经过e次路口
//        double money = 100000;//剩余金额
//        while(money >= 1000){
//            if(money > 5000){
//                money = money*(1-0.05);
//            }else{
//                money = money-1000;
//            }
//            e++;
//            System.out.println("e="+e+"-----money="+money);
//        }
//        System.out.println("该人有" + e + "次过路机会");

        //2、实现判断一个整数，属于哪个范围：大于0；小于0；等于0
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("请输入一个整数：");
//        int r =myScanner.nextInt();
//        if(r > 0){
//            System.out.println(r+">0");
//        }else if(r<0){
//            System.out.println(r+"<0");
//        }else{
//            System.out.println(r+"=0");
//        }

        //3、判断一个年份是否为闰年
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("请输入一个年份：");
//        int t = myScanner.nextInt();
//        if((t%4==0) && (t%100!=0)){
//            System.out.println(t+"为闰年");
//        }else if((t%400)==0){
//            System.out.println(t+"为闰年");
//        }else {
//            System.out.println(t+"为平年");
//        }

        //4、判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，其各位上数字立方和等于其本身。例如153=1*1*1+3*3*3+5*5*5
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("请输入一个数字：");
//        int y = myScanner.nextInt();
//        int u = y / 100;
//        int i = y % 100 /10;
//        int o = y % (y / 10);
//        System.out.println("u="+u);
//        System.out.println("i="+i);
//        System.out.println("o="+o);
//        if(u*u*u+i*i*i+o*o*o == y){
//            System.out.println(y+"是水仙花数");
//        }else{
//            System.out.println(y+"不是水仙花数");
//        }

        //6、输出1-100之间的不能被5整除的数，每五个一行
//        int count = 0;//统计输出个数
//        for (int p = 1; p <= 100; p++) {
//                if (p % 5 != 0) {
//                    count++;
//                    System.out.print(p + "\t");
//                    //每五个 换行
//                    if(count%5==0){
//                        System.out.println();
//                    }
//                }
//        }

//        7、输出小写的a-z以及大写的Z-A
//        for(char s = 'a';s<=122;s++){
//            System.out.print(s+"\t");
//        }
//        System.out.println();
//        for(char d = 'A';d<=90;d++){
//            System.out.print(d+"\t");
//        }


        //8、求出1-1/2+1/3-1/4....1/100的和
//        int a =1;
//        double sum = 0;
//        for(;a<100;a++){
//            //根据分母判断是奇数还是偶数，做不同的处理
//            if(a%2 !=0){
//                sum +=1/a;
//            }else {
//                sum -= 1 / a;
//            }
//        }
//        System.out.println(sum);


         //9、求1+（1+2）+（1+2+3）+（1+2+3+4）+.....+(1+2+3+..+100)的结果
//        int sum = 0;
//        for(int g = 1;g<=100;g++){//g表示第几项，同时也是当前项的最后一个数
//            for(int f = 1;f<=g;f++){//括号里的值
//                sum +=f;
//            }
//        }
//        System.out.println("sum="+sum);

    }
}
