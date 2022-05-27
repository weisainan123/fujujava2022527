package Test;

//this  哪个对象调用，this就代表哪个对象
public class ThisExercise {
    public static void main(String[] args){
           T2 t2 = new T2();
           t2.f2();
           t2.f3();
    }
}
/*this 细节
（1）this关键字可以用来访问本类的属性、方法、构造器；
（2）this用于区分当前类的属性和局部变量
（3）访问成员方法的语法：this.方法名（参数列表）;
（4）访问构造器语法：this(参数列表); 注意只能在构造器中使用（在构造器中访问另一个构造器）;访问构造器语法，必须放在第一条语句
（5）this不能在类定义的外部使用，只能在类定义的方法中使用
 */
class T2{
    String name = "福橘";
    int age = 18;
    //(4)访问构造器语法：this(参数列表); 注意只能在构造器中使用（在一个构造器中访问另一个构造器）;
    // 访问构造器语法，必须放在第一条语句
    public T2(){
        this("jack",100);//这里去访问T2(String name, int age)构造器
        System.out.println("T2构造器");
    }

    public T2(String name, int age) {
        System.out.println("T2(String name, int age)构造器");
    }

    //(3)访问成员方法的语法：this.方法名（参数列表）;
    public void f1(){
        System.out.println("f1()方法");
    }
    public void f2(){
        System.out.println("f2()方法");
        //调用本类的f1
        f1();//第一种方式
        this.f1();//第二种方式
    }
    //（1）this访问本类的属性
    public void f3(){
        String name = "橙子";
        System.out.println("f3()name="+name+"f3()age="+age);//传统方式,根据就近原则来找的  橙子  18
        System.out.println("f3()name="+this.name+"f3()name="+this.age);//用this访问属性，明确要找的属性  福橘  18
    }

}

class Dog{
    String name;
    int age;
    public Dog(String name,int age){
       this.name = name;//this.name就是当前对象的属性name
       this.age = age;//this.age就是当前对象的属性age
    }
}
