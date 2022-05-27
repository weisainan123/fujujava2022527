package Test;

//成员方法传递机制2---引用数据类型传递的是地址（传递也是值，但是值就是地址）可以通过形参影响实参
public class Objects4 {
    public static void main(String[] args){
        B1 b1 = new B1();
        int[] arr = {1,2,3};
        b1.test100(arr);
        System.out.println("main函数 数组值");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}
class B1{
    public void test100(int[] arr){
        arr[0] = 100 ;
        System.out.println("B1类中数组：");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

}
