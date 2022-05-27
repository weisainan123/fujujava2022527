package Test;

//构造器/构造方法
public class VarConstructorDetail {
    public static void main(String[] args){
        Person3 p = new Person3("fuju",18);
        System.out.println("p的信息如下：");
        System.out.println("p对象age="+p.age);//fuju
        System.out.println("p对象name="+p.name);//18
        Person3 p1 = new Person3("福橘");//福橘
    }
}
/*
题目：前面在创建人类对象的时，是先把一个对象创建好后，再给他的年龄和姓名属性赋值，
如果现在我要求，在创建人类的时候，就直接指定这个对象的年龄和姓名，该怎么做？这时可以使用构造器

语法：
    [修饰符] 方法名(形参列表){
                方法体;
                }

说明：
构造器的修饰符可以默认；
构造器没有返回值；
方法名和类名必须一样；
参数列表和成员方法一样的规则；
构造器由调用,系统完成

介绍：
是类的一种特殊方法，主要作用是完成对 新对象的初始化

特点：
方法名和类名相同；
没有返回值；
在创建对象时，系统会自动调用该类的构造器完成对象的初始化
如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造方法（也叫默认构造方法），比如Person(){}
一旦定义了自己的构造器，默认的构造器就覆盖了，就不能再使用默认的无参构造器，除非显式地定义一下，即：Person(){}
 */

class Person3{
    String name;
    int age;
    //构造器
    //1、构造器没有返回值，也不能写void
    //2、构造器的名称和类Person一样
    //3、(String pName,int pAge)是构造形参列表，规则和成员方法一样
    public Person3(String pName,int pAge){
        System.out.println("构造器被调用~~ 完成对象的属性初始化");
        name = pName;
        age = pAge;
    }
    //第二个构造器，只指定人名不指定年龄
    public Person3(String pName){
        name = pName;
    }
}

/*注意事项和使用细节
一个类可以定义多个不同的构造器，即构造器重载
构造器是完成对象的初始化，并不是创建对象
在创建对象时，系统自动的调用该类的构造方法
 */
