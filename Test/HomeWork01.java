package Test;

import java.util.Arrays;

public class HomeWork01 {
    public static void main(String[] args){
//        double arr[] = {1,2,3,4.2};
//        A01 a01=new A01();
//        double d = a01.max(arr);
//        System.out.println(d);
        double arr[] = {};
        A01 a01=new A01();
        Double res = a01.max(arr);
        if(res != null){
            System.out.println(res);
        }else{
            System.out.println("传入数组有误！！");
        }

    }
}

class A01{
    //基础业务实现
//    public double max(double[] arr){
//        //法一、利用Arrays类下面的方法直接对数组排序，排序后输出最后一个元素
////        Arrays.sort(arr);
////        double m = arr[arr.length-1];
////        return m;
//
//        //法二、先假定第一个数组元素值最大，然后循环遍历比较，把大于第一个元素的值赋给max
//        double m = arr[0];
//        for(int i = 0;i<arr.length;i++){
//            if(m<arr[i]){
//                m = arr[i];
//            }
//        }
//        return m;
//    }

    /*
再考虑逻辑代码健壮性
 */
    public Double max(double[] arr){
        if(arr.length>0){//考虑数组为空的情况
            double m = arr[0];
            for(int i = 0;i<arr.length;i++){
                if(m<arr[i]){
                    m = arr[i];
                }
            }
            return m;
        }else{
            return null;
        }
    }

}
