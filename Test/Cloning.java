package Test;

//成员方法传参机制3----成员方法返回类型是引用类型
//克隆对象
public class Cloning {
        public static void main(String[] args){
                Person1 p1=new Person1();
                p1.name = "jack";
                p1.age = 22;
                myTools tools = new myTools(); //创建tools
                Person1 p2 = tools.copyPerson(p1);//至此 p 和p2都是person1对象 ，但是是两个独立的对象，只是属性相同
                System.out.println("p1的属性 age="+p1.age+"p1的属性 name="+p1.name);
                System.out.println("p2的属性 age="+p2.age+"p2的属性 name="+p2.name);

                System.out.println(p1 == p2);//通过输出对象的比较 看看是否是同一个对象
        }
}

class Person1 {
    String name ;
    int age ;
}

class myTools{
    /*
        编写一个方法 copyPerson,可以复制一个Person1对象，返回复制的对象。
        克隆对象，注意 要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
        思路：
        1、方法的返回类型  Person1
        2、方法的名字  copyPerson
        3、方法的形参  Person1 p1
        4、方法体 创建一个新对象，并复制属性，返回即可
        */
    public Person1 copyPerson(Person1 p1){
        Person1 p2=new Person1();//创建一个新的对象
        p2.name = p1.name;//把原来对象的名字 赋给p2.name
        p2.age = p1.age;//把原来对象的年龄 赋给p2.age
        return p2;
    }
}
