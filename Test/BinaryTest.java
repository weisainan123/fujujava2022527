package Test;
//四种进制
public class BinaryTest {
    public static void main(String[] args){
        int a = 0b1010;//二进制，0，1 满2进1 以0b或0B开头
        int b = 1010;//十进制 满10进1
        int c =01010;//八进制 满8进1 以数字0开头表示
        int d = 0x1010;//十六进制 0-9以及A(10)-F(15)  满16进1  以0x或0X开头表示   A-F不区分大小写
        System.out.println("二进制"+a);
        System.out.println("十进制"+b);
        System.out.println("八进制"+c);
        System.out.println("十六进制"+d);

        /*
        位运算符
         */
        int n1 = 1>>2;//1向右位移2位
        int n2 = -1>>2;
        int n3 = 1<<2;
        int n4 = -1<<2;
        int n5 = 3>>>2;//算术右移
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        /*
        位于算符问题
        ~2=    //按位取反
        2&3=   //2按位与3
        2|3=   //
        ~-5=
        13&7=
        5|4=
        -3^3=   //按位异或

        java中有7个位运算符（&、|、^、~、>>、<<、>>>）
        按位与&   按位或|   按位异或^   按位取反~
        运算规则是：
        按位与&    两位全为1，结果为1，否则为0
        按位或|    两位有一个为1，结果则为1，否则为0
        按位异或^  两位一个为0，一个为1，结果为1，否则为0
        按位取反~  0-->1  ,1-->0
         */
        //1、
        System.out.println("2&3=" + (2&3));
        System.out.println("~2=" + (~2));

    }
}
