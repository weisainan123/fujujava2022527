package Test;

public class HomeWork04 {
    public static void main(String[] args){
        int arr[] = {1,2,3};
        A03 a03 = new A03();
        a03.copyArr(arr);
    }
}
class A03{
    public void copyArr(int arr[]){
        int arr1[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            arr1[i] = arr[i];
        }
        for(int i = 0;i<arr1.length;i++){
            System.out.print(arr1[i]+"\t");
        }
    }
}
