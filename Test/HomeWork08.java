package Test;

public class HomeWork08 {
    public static void main(String[] args){
        //new Test() 没有任何变量指向它，称为匿名对象，匿名对象使用后，就不能使用被销毁
        //创建好匿名对象后，就调用count1（）
        new Test().count1();//10
        Test t1= new Test();
        t1.count2();//9
        t1.count2();//10
    }
}
class Test{
    int count = 9;//属性
    public void count1(){//成员方法
        count = 10;//这个count就是属性 9-->10
        System.out.println("count1="+count);//10
    }
    public void count2(){
        System.out.println("count2="+count++);//9--> count++ --> 10
    }
}