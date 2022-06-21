package com.extends_;

//继承-快速入门案例
public class Extends01 {
    public static void main(String[] args){
        com.extends_.Pupil pupil = new Pupil();
        pupil.name = "张三";
        pupil.age = 12;
        pupil.testing();
        pupil.setScore(66);
        pupil.showInfo();
        System.out.println("--------------------------");

        com.extends_.Graduate graduate = new Graduate();
        graduate.name = "里斯";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(98);
        graduate.showInfo();

    }
}
/*
继承细节
1、子类继承了所有的属性和方法，但是私有属性不能在子类直接访问，要通过公共的方法去访问；
2、子类没有继承父类的构造器，但必须调用父类的构造器，完成父类的初始化
3、当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器，
   如果父类没有提供无参构造器，则必须在子类的构造器中用super去指定使用父类的哪个构造器完成对父类的初始化工作，否则，编译不会通过。
4、如果希望指定去调用父类的某个构造器，则显式的调用一下：super(参数列表)
5、super在使用时，必须放在构造器第一行（super只能在构造器中使用）
6、super()和this() 都只能放在构造器第一行，因此这两个方法不能共存在一个构造器
7、Java所有类都是object类的子类，object是所有类的基类
8、父类构造器的调用不限于直接父类！将一直往上追溯到object类（顶级父类）
9、子类最多只能继承一个父类（指直接继承），即java中是单继承机制
10、不能滥用继承，子类和父类之间必须满足is -a的逻辑关系
 */
