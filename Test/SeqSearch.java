package Test;
import java.util.Scanner;

public class SeqSearch {
    public static void main(String[] args){

        /*查找
        Java中常用两种方法查找：
        顺序查找
        二分查找

        有一个数列：白眉鹰王、金毛狮王、紫衫龙王猜游戏：从键盘中任意输入一个名称，判断数列中是否包含此名称（顺序查找）
        要求：如果找到了就提示找到，并给出下标值
         */
        String str[] = {"白眉鹰王","金毛狮王","紫衫龙王"};
        int len = str.length;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入文字：");
        String s = myScanner.next();//接收键盘输入值
        int index = -1;
        for(int i = 0;i<len;i++){
            if(s.equals(str[i])){
                System.out.println("找到了"+s+"下标为："+i);
                index= i;//把下标赋给index
                break;
            }
        }
        if(index ==-1){
                System.out.println("没找到");
        }


    }
}
