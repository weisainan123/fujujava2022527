package Test;
import java.util.Scanner;
//数组
public class ArrayTest {
    public static void main(String[] args){
        /*
        数组可以存放多个同一类型的数据，数组也是一种数据类型，是引用类型。
        即 数（数据）组（一组）就是一组数据
        通过for 可以循环访问数组的元素/值
         */

        //1、快速入门  求6只鸡平均体重
//        double[] hens = {1,2,3,4,88.01,12.5};//定义一个double类型的数组  数组名hens
//        int len = hens.length;//可以通过 数组名.length 得到数组的大小和长度
//        System.out.println("len="+len);
//        double totalWeight = 0;
//        for(int i = 0;i<len;i++){ //可以通过hens[下标]来访问数组的元素，下标从0开始
//            totalWeight +=hens[i];
//        }
//        System.out.println("totalWeight="+totalWeight+"\t"+"平均值"+(totalWeight/len));

        /*
        使用方式1---动态初始化
        数组定义：
        数据类型 数组名[] = new 数据类型[大小]
        int a[] = new int[5];创建了一个数组，名字a,存放5个int
         */
        //题目：循环输入5个成绩保存在double数组中，再循环输出
//        Scanner myScanner = new Scanner(System.in);
//        double scores[] = new double[5];
//        for(int i = 0;i<scores.length;i++){
//            System.out.println("请输入第"+(i+1)+"个成绩:");
//            scores[i] = myScanner.nextDouble();
//        }
//        //循环遍历输出
//        for(int i = 0;i<scores.length;i++){
//            System.out.println(scores[i]);
//        }

        /*
        使用方式2---动态初始化
        先声明数组 语法：数据类型 数据名[]  也可以是 数据类型[] 数组名    例如int a[]和int[] a
        再创建数组 语法：数组名=new 数据类型[大小]  例如 a=new int[10]
        */

        /*
        使用方式3---静态初始化
        语法：数据类型 数组名[]={元素值,元素值......}
        int a[] = {1,2,3,4,5,6}如果知道数组有多少元素具体值可用上面的用法.相当于：int a[]=new int[2]; a[0]=1;  a[1]=2
         */

        /*
        数组细节：
        int[] arr1 = {1,1.1}//错误double-->int
        数组中的元素可以是任意数据类型，包括基本类型和引用类型,但是不能混用
        数组属引用类型，数组型数据是对象（object）
        数组下标从0开始
        使用数组的步骤：1、声明数组并开辟空间2、给数组各个元素赋值3、使用数组
         */
        //数组细节：数组创建后如果没有赋值，有默认值：int 0,short 0,byte 0,long 0,float 0.0,double 0.0,
        // char \u0000,boolean false,String null
//        short[] arr1 = new short[4];
//        System.out.println("----数组arr1----");
//        for(int i = 0;i<4;i++){
//            System.out.println(arr1[i]);
//        }

        //案例1：创建一个char类型的26个元素的数组，分别放置'A'-'Z'.使用for循环访问所有元素并打印出来。
//        char arr2[] = new char[26];
//        for(int i = 0;i<arr2.length;i++){
//            arr2[i] = (char) ('A'+i);
//            System.out.print(arr2[i]+"\t");
//        }

        //案例2：请求出一个数组int[]的最大值{4，-1，9，10，23}并得到对应的下标
//        int[] arr3 ={4,-1,9,10,23};
//        int max = arr3[0];//假定最大值是数组中第一个
//        int maxIndex = 0;
//        for(int i = 0;i<arr3.length;i++){
//            if(max<arr3[i]){
//                max = arr3[i];
//                maxIndex = i;
//            }
//        }
//        System.out.println("max="+max+"maxIndex="+maxIndex);

        //数组赋值机制  基本数据类型是值拷贝  数组在默认情况下是引用传递，赋的值是地址，赋值方式为引用赋值
//        int arr4[] = {1, 2, 3};
//        int arr5[] = arr4;
//        arr4[0] = 0;
//        System.out.println(arr5[0]);//输出0

        //数组拷贝  开辟新的空间
//        int[] arr6 = {1,2,3};
//        int[] arr7 = new int[arr6.length];
//        for(int i = 0;i<arr6.length;i++){
//            arr7[i]=arr6[i];
//        }
//        arr6[0] = 10;
//        for(int i = 0;i<arr6.length;i++){
//            System.out.println(arr6[i]);//10,2,3
//        }
//        System.out.println("--------------");
//        for(int i = 0;i<arr7.length;i++){
//            System.out.println(arr7[i]);//1,2,3
//        }

        //数组翻转1  {11,22,33,44,55,66}--->{66,55,44,33,22,11}
//        int arr8[] = {11,22,33,44,55,66};
//        int temp = 0;
//        for(int i = 0;i<arr8.length/2;i++){   //反转3次
//            temp = arr8[arr8.length-1-i];
//            arr8[arr8.length-1-i] = arr8[i];
//            arr8[i] = temp;
//        }
//        for(int i =0;i<arr8.length;i++){
//            System.out.println(arr8[i]);
//        }

        //数组翻转2
//        int arr8[] = {11,22,33,44,55,66};
//        int arr9[] = new int[arr8.length];
//        for(int i = 0;i<arr8.length;i++){//逆序遍历赋值
//            arr9[i] = arr8[arr8.length-1-i];
//        }
//        arr8 = arr9;//让arr8指向arr9数据空间，此时arr8原来的数据空间没有变量引用，会被当作垃圾销毁
//        //再循环输出
//        for(int i = 0;i<arr8.length;i++){
//            System.out.println(arr8[i]);
//        }

        //数组扩容
        /*
        实现动态的给数组添加元素效果，实现对数组扩容
        原始数组使用静态分配 int[] arr = {1,2,3}
        增加的元素，直接放在数组的最后 arr = {1,2,3,4}   arrNew = {1,2,3,4}
        用户可以通过如下方法来决定是否继续添加 是否继续？y/n---do while循环
         */
//        int[] arr = {1,2,3};
//        do{
//            int[] arrNew = new int[arr.length+1];
//            Scanner myScanner = new Scanner(System.in);
//            System.out.println("请输入值：");
//            int t = myScanner.nextInt();
//            for(int i = 0;i<arr.length;i++){
//                arrNew[i] = arr[i];
//            }
//            arrNew[arrNew.length-1] = t;
//            arr = arrNew;
//            System.out.println("arr扩容后的输出情况：");
//            for(int i = 0;i<arr.length;i++){
//                System.out.println(arr[i]+"\t");
//            }
//            System.out.println("是否继续? y/n");
//            char m = myScanner.next().charAt(0);
//            if(m =='n'){
//                break;
//            }
//        }while(true);

        //数组缩减
        /*
        一个数组{1，2，3，4，5}可以将该数组进行缩减，提示用户是否继续缩减，每次缩减最后那个元素，
        当只剩下最后一个元素，提示不能再缩减
         */
            int[] arr8 = {1,2,3,4,5};
            do{
                int[] arrNew8 = new int[arr8.length-1];
                int index = 0;
                for(int i = 0;i<arr8.length-1;i++){
                    arrNew8[i] = arr8[i];
                }
                arr8 = arrNew8;
                System.out.println("缩减后的数组：");
                for(int i = 0;i< arr8.length;i++){
                    System.out.println(arr8[i]+"\t");
                }
                int m = arr8.length;//每次缩减后数组长度赋值给m，当长度是1后，则为最后一个值，不能再缩减，break
                System.out.println("m值="+m);
                if(m == 1){
                    break;
                }
            }while(true);
            System.out.println("不能在缩减了！！！");





    }
}
