package Test;

//成员方法传参机制1---基本数据类型传递的是值，形参不影响实参
public class Objects3 {
    public static void main(String[] args){
//        AA aa = new AA();
////        if(aa.isOdd(8)){
////            System.out.println("是偶数");
////        }else{
////            System.out.println("是奇数");
////        }

        BB b = new BB();
        b.print(4,4,'$');
    }
}

/*
    编写类AA，有一个方法 判断一个数是奇数还是偶数 返回boolean
    思路：
    1、方法的返回类型
    2、方法的名字
    3、方法的形参
    4、方法体 判断
     */
class AA{
    public boolean isOdd(int n){
//        if(n%2 == 0){
//            return false;
//        }else{
//            return true;
//        }

//        return n%2 == 0 ? false:true;

        return n%2 == 0;
    }
}

/*
    编写类BB，根据行、列、字符打印 对应行数和列数的字符。比如行4 列4  字符$ 打印对应的效果
    思路：
    1、方法的返回类型--直接打印--void
    2、方法的名字  print
    3、方法的形参  int row (行)  int col (列)  char c （字符）
    4、方法体   二维数组 循环遍历输出
     */
class BB{
    public void print(int row,int col,char c){
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++){
                System.out.print(c);
            }
            System.out.println();//换行

        }
    }
}



