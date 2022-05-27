package Test;

//二维数组
public class TwoDimensionalArray {

    public static void main(String[] args){
        /*
        二维数组
        1、定义形式上看 int[][]
        2、可以这样理解，原来的一维数组的每个元素都是一维数组，就构成二维数组
         */
        int[][] arr={
                {1,2,3,4,5},
                {1,2,3,4,6},
                {1,2,3,4,7}};
        System.out.println("二维数组的元素个数="+arr.length);
        //arr[i][j];  访问的是第（i+1）个数组的第（j+1）个值
        for(int i = 0;i<arr.length;i++){//遍历二维数组的每个元素
            for(int j = 0;j<arr[i].length;j++){

            }
        }
    }
}
