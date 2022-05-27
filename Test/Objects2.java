package Test;

public class Objects2 {
    public static void main(String[] args){
//        A a = new A();
//        int[] res = a.getSumAndSub(1,4);
//        System.out.println("和="+res[0]);
//        System.out.println("差="+res[1]);

        D d = new D();
//        d.sayOK();

        d.m1();
    }
}

/*
       成员方法定义
        public 数据返回类型  方法名(形参列表....){ //方法体，为了实现某一功能代码块
              语句；
              return 返回值；  //return 语句不是必须的，有一个具体的数据返回类型 需要return；如果是void 就不需要return
        }
       注意：
       （1）修饰符  作用是控制方法使用的范围（可选）
       （2）返回类型
           一个方法最多有一个返回值（如何反回多个结果？？---返回数组的方式）；
           返回类型可以为任意类型，包含基本类型或引用类型（数组，对象）；
           如果方法要求有 返回数据类型，则方法体中最后的执行语句必须为 return 值，
         而且要求返回值类型必须和return的值类型一致或兼容；
          如果方法是void 则方法体中可以没有return语句，或者只写 return；
       （3）方法名
           遵循驼峰命名法，见名知义，表达出该功能意思即可
        (4) 形参列表
            一个方法可以有0个参数，也可以有多个参数，中间用逗号隔开；
            参数类型可以为任意类型，包含基本数据类型和引用数据类型；
            调用带参数的方法时，一定对应着参数列表传入相同类型或兼容类型 的参数；
            方法定义时的参数成为形式参数，简称形参，方法调用时参数称为实际参数，简称实参，
          实参和形参的类型要一致或兼容、个数、顺序必须一致；
       （5）方法体
            里面写 完成功能的具体语句，可以为输入、输出、变量、运算、分支、循环、方法调用，
          但是里面不能再定义方法！即 方法不能嵌套定义
        (6) 方法细节调用说明
            同一个类中的方法调用：直接调用即可 比如 print(参数)；
            跨类中的方法A类 调用B类方法：需要通过对象名调用。比如 对象名.方法名（参数）;  案例演示：B类 sayhello 调用 print()
            特别说明：跨类的方法调用和方法的访问修饰符相关，
        */
class A {
    public int[] getSumAndSub(int n1, int n2) {
        int[] resArr = new int[2]; //创建一个数组,返回多个结果
        resArr[0] = n1 + n2 ;
        resArr[1] = n1 - n2 ;
        return resArr;
    }
}

class B {
    public double D(){
        int n = 1;
        return n;//int---double  强制转换兼容
    }
}

class C {//如果方法是void 则方法体中可以没有return语句，或者只写 return；
    public void V(){
        System.out.println("hello");
        return ;
    }
}

class D{// 同一个类中的方法调用：直接调用即可
    public void print(int n){
        System.out.println("print()方法被调用 n="+n);
    }

    public void sayOK(){
        print(10);
        System.out.println("继续执行sayOK()");
    }

    public void m1(){//跨类中的方法A类 调用B类方法：需要通过对象名调用
        System.out.println("调用D类中的m1方法");
       E e = new E();//创建E对象  然后再调用方法即可
        e.m2();
        System.out.println("继续调用m1");
    }
}
class E{
    public void m2(){
        System.out.println("调用E类中的m2方法");
    }
}
