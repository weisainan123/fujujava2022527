package Test;

//可变参数
/*
Java允许将同一个类中多个同名同功能但参数个数不同的方法，封装成一个方法
语法： 访问修饰符 返回类型 方法名（数据类型... 形参名）{}
注意事项：（1）可变参数的实参可以为0个或任意多个；
         （2）可变参数的实参可以为数组；
         （3）可变参数的本质就是数组；
         （4）可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后；
         （5）一个形参列表中只能出现一个可变参数
 */
public class VarParameter {
    public static void main(String[] args){
           Method1 me1 = new Method1();

           System.out.println(me1.sum(1,2,3));
    }
}

/*案例
一个类 方法sum 可以计算2个数的和，3个数的和，4个数的和，5....
可以用重载，也可以用可变参数
 */
class Method1{
    public int sum(int... nums){
        int res = 0;
        System.out.println("接受参数的个数"+nums.length);
        //当成一个数组，遍历求和
        for(int i = 0;i<nums.length;i++){
            res += nums[i];
        }
        return res;
    }

    //（4）可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后；
    //（5）一个形参列表中只能出现一个可变参数
//    public void xi(int... n,int m){
//    }
    public void xi4(int m,int... n){

    }
//    public void xi5(int... m,int... n){
//    }
    public void xi5(int... n){

    }

}

