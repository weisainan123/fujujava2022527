package Test;

//递归--斐波那契数
//请使用递归的方式求出斐波那契数1，1，2，3，5，8，13.....给你一个整数n，求出他的值是多少
public class RecursiveFibonacci {
    public static void main(String[] args){
            Fibo f = new Fibo();
            int res = f.fibonacci(8);
            System.out.println("n对应的斐波那契数="+res);
    }

}

/*
        n=1    f=1
        n=2    f=1
        n=3    f=2
        n=4    f=3
        n=5    f=5
        n      f(n)=f(n-1)+f(n-2)

        1、方法的返回类型  int
        2、方法的名字  Fibonacci
        3、方法的形参  int n
        4、方法体 递归
 */
class Fibo{
    public int fibonacci(int n){
        if(n==1 || n==2 ){
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

}
