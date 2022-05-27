package Test;

//递归--猴子吃桃问题
//有一堆桃子，猴子第一天吃了其中的一半，并再多吃一个。以后每天猴子都吃其中的一半，然后多吃一个。
//当第10天后，想再吃时（还没吃）发现只剩下一个桃。问最初有几个桃
public class RecursiveMonkey {
    public static void main(String[] args){
        Monk m = new Monk();
        int res = m.Monkey(1);
        System.out.println("最初桃子数="+res);
    }
}

/*
day = 10     sum=1
day = 9      sum=(1+1)*2=4
day = 8      sum=(M(9)+1)*2=10
day = 7      sum=(M(day+1)+1)*2

        1、方法的返回类型  int
        2、方法的名字  Monkey
        3、方法的形参  int n
        4、方法体 递归
 */
class Monk{
    public int Monkey(int day){
        if(day == 10){
            return 1;
        }else{
            return (Monkey(day+1)+1)*2;
        }

    }
}
