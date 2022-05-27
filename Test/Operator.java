package Test;
public class Operator {
    public static void main(String[] args){
        //1、算术运算符+ - * / %(取模，取余) a++ ++a(自增)  a-- --a（自减）
        System.out.println(5/2);//数学中是2.5，Java中是2
        System.out.println(5.0/2);//2.5
        System.out.println(-10%3);//-1
        System.out.println(10%3);//1
        System.out.println(10%(-3));//1
        /*
        a%b=a-a/b*b
        10%-3=10-10/(-3)*(-3)
        10/(-3)=-3
        (-3)*(-3)=9
        10-9=1
         */

        //有59天放假 剩余几个星期几天
        int days = 59;
        int date = days / 7;
        int lastDay = days % 7;
        System.out.println("剩余" + date + "个星期" + lastDay + "天");

        /*
        2、关系运算符（比较运算符）==  !=  >  <   <=   >=   instanceof（检查是否是类的对象）
        关系运算符的结果都是boolean类型，要么true 要么false
        */
        int i1 = 1;
        int i2 = 2;
        System.out.println(i1 < i2);//true
        System.out.println(i1 > i2);//false
        System.out.println(i1 <= i2);//true
        System.out.println(i1 >= i2);//false
        System.out.println(i1 == i2);//false
        System.out.println(i1 != i2);//true
        boolean flag = i1 < i2;
        System.out.println("flag=" + flag);

        /*
        3、逻辑运算符  &（逻辑与）   &&（短路与）   |（逻辑或）   ||（短路或）  ！（取反）    ^(逻辑异或)
        用于联接多个条件（多个关系表达式），最终的结果也是一个boolean类型
        a&b  a和b同时为true，才为true,否则为false；
        a&&b  a和b同时为true，才为true,否则为false；
        a|b  a和b有一个为true,则为true;
        a||b  a和b有一个为true,则为true;
        !a  a为true,则结果为false.  a为false,则结果为true;
        a^b  a和b 不同时则为true，相同则为false;
         */
        /*
        &与&&区别
        & 第一个条件为false,后面依旧会判断
        && 第一个条件为false,后面无需再判断(使用较多 效率高)
         */
        int n1 = 2;
        int m1 = 5;
        int n2 = 2;
        int m2 = 5;
        if(n1 < 1 & ++m1 < 7){
            System.out.println("ok1");
        }
        System.out.println("n1=" + n1 +"m1=" + m1);//2   6
//        if(n2 < 1 && ++m2 < 7){
//            System.out.println("ok2");
//        }
//        System.out.println("n2=" + n1 +"m2=" + m1); //2  5

        /*
        ||与|区别
        | 无论第一个条件是true还是false,都需要判断第二个条件
        ||第一个条件为true,后面无需再判断（使用较多，效率高）
         */

        /*4、三元运算符
        4.1表达式1和表达式2要为可以赋值给接受变量的类型（自动转换/强转）
        4.2三元运算符可以转成if-else语句
         */
        int a = 10;
        int b = 12;
        int result = a < b ? a++ : b-- ;
        System.out.println("result=" + result); //10
        System.out.println("a=" + a); //11
        System.out.println("b=" + b);//12
        //4.1
        int c = a < b ? (int)1.1 : (int)2.2;//ok的
        double d = a > b ? a : b + 3;//ok的，满足int---double 自动转换类型
        /*
        5、运算符优先级
        1）（） {}
        2）单目运算符   （只有单目运算符、赋值运算符是从右向左运算的）
        3）算术运算符
        4）位移运算符
        5）比较运算符
        6）逻辑运算符
        7）三元运算符
        8）赋值运算符
         */

        /*
        6、标识符的命名规则和规范
        6.1规则（必须遵守）
        由26个英文字母，大小写，0-9，_或$组成；
        数字不可以开头；
        不可以使用关键字和保留字，但是可以包含关键字和保留字；int int1
        java中严格区分大小写，长度无限制；int n   int N
        标识符不能包含空格 int a b=90;
        6.2规范（更加专业）
        包名:多单词组成时所有字母都小写
        类名、接口名：多单词组成时，所有单词的首字母大写 ThankShotGame(大驼峰)
        变量名、方法名：多单词组成时第一个单词首字母小写，第二个单词开始首字母大写 thankShotGame(小驼峰)
        常量名：所有字母都大写，多单词时每个单词用下划线连接
        6.3关键字
        关键字所有字母都为小写，高亮
        6.4保留字
        现有Java版本尚未使用，但以后版本可能会作为关键字使用，命名标识符时要避免使用这些保留字
         */







    }
}
