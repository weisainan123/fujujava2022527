package Test;

/*作用域及细节
1、在java编程中，主要的变量就是属性（成员变量）和局部变量；
2、局部变量一般是指在成员方法中定义的变量；
3、java中作用域的分类：
     全局变量： 也就是属性，作用域为整个类
     局部变量： 也就是除了属性之外的其他变量，作用域为定义它的代码块中
4、全局变量可以不赋值，直接使用，因为有默认值。局部变量必须复制后才能使用，因为没有默认值；
注意事项：
1、属性和局部变量可以重名，访问时遵循就近原则；
2、在同一个作用域中，比如在同一个成员方法中，两个局部变量，不能重名；
3、属性生命周期较长，伴随着对象的创建而创建，伴随着对象的销毁而销毁
   局部变量生命周期较短，伴随着它的代码块的执行而创建，伴随着代码块的结束而死亡，即在一次方法调用中。
4、作用域范围不同
   全局变量：可以被本类使用，或其它类使用（通过对象调用）
   局部变量：只能在本类中对应的方法中使用
5、修饰符不同
   全局变量/属性可以加修饰符
   局部变量不可以加修饰符
 */
public class VarScopeDetail {
    public static void main(String[] args){
       Person2 person2 = new Person2();
       person2.woman();

       T1 t1 = new T1();
       t1.test();
       t1.test1(person2);
    }
}
class Person2{
    String name = "fuju";
    public void woman(){
        String name = "福橘";//属性和局部变量可以重名，访问时遵循就近原则；
        System.out.println(name);
    }
    public void woman1(){
        int age = 12;
//        int age = 13;在同一个作用域中，比如在同一个成员方法中，两个局部变量，不能重名；

    }
}
//作用域范围不同
//   全局变量：可以被本类使用，或其它类使用（通过对象调用）
class T1{
    public void test(){//方式1
        Person2 p2 = new Person2();//fuju
        System.out.println("----test----");
        System.out.println(p2.name);
    }
    public void test1(Person2 p){//方式2
        System.out.println("----test1----");
        System.out.println(p.name);//fuju
    }
}


