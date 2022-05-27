package Test;
import java.util.Scanner;

public class Objects1 {

    public static void main(String[] ars) {

        /*一、创建对象：
        1、Cat cat；//声明对象cat
            cat = new Cat();//创建

         2、直接创建
       Cat cat = new Cat();

         访问属性：对象名.属性名   cat.name   cat.age    cat.color

      二、类和对象的内存分配机制
      Java内存的结构分析：
      栈  一般存放基本数据类型
      堆  存放对象（Cat cat,数组等）
      方法区  常量池（常量，比如字符串）、类加载信息
       Person p = new Person();
       p.name = "jack";
       p.age = 10;
           1、先加载person类信息（属性和方法信息 ，只会加载一次）
           2、在堆中分配空间，进行默认初始化（看规则）
           3、把地址赋给p,p就指向对象
           4、进行指定初始化，比如 p.name = "jack" p.age = 10
     */

        //三、方法使用
        //1、方法写好后，如果不去调用，不会输出
        //2、先创建对象，然后调用方法即可
        Person p1 = new Person();
        p1.speak();//调用方法
        p1.cal01(5);//调用cal01,同时给n=5
        p1.cal01(9);//调用cal01,同时给n=9
        int returnsum1 = p1.getSum(2,3);//调用getSum，同时给a赋值2，b赋值3;把方法 getSum 返回的值 赋给变量 sum1
        System.out.println("getSum="+returnsum1);
    }

}

    /*
    成员方法
     */
    class Person {
        String name;
        int age;
        int sum = 0;
        //添加speak 成员方法，输出hello
        //public  方法是公开的 ； void  方法没有返回值 ；speak() spaek是方法名  （）参数列表；
        // {}方法体，可以写我们要执行的代码
        public void speak(){
            System.out.println("hello");
        }

        //添加cal01 成员方法，该方法可以接收一个数n,计算1+...n的结果
        //(int n)形参列表，表示当前有一个形参 n,可以接收用户收入
        public void cal01(int n){
            for(int i = 0;i<=n;i++){
                sum +=i;
            }
            System.out.println("1+....n="+sum);
        }

        //添加getSum成员方法，可以计算两个数的和
        //public 方法是公开的 ；
        // int   表示方法执行后返回一个 int 值 ；
        // getSum 是方法名
        //（int a,int b）  形参列表，2个形参，可以接受用户传入的两个数
        // return sum1;   表示把 sum1 的值 返回
        public int getSum(int a,int b){
            int sum1 = a + b;
            return sum1;
        }
    }








