package Test;

public class HomeWork06 {
    public static void main(String[] args){
            Cale cale=new Cale(2,0);
//            System.out.println(cale.sum());
//            System.out.println(cale.difference());
//            System.out.println(cale.multi());
//            System.out.println(cale.divi());
        System.out.println(cale.sum());
        System.out.println(cale.difference());
        System.out.println(cale.multi());
        Double diviRes = cale.divi();
        if(diviRes !=null){
            System.out.println(diviRes);
        }

    }
}

class Cale{
//    int m ;
//    int n ;
//    public Cale(int n,int m){
//        this.n = n;
//        this.m = m;
//    }
//    public int sum(){
//        return n+m;
//    }
//    public int difference(){
//        return n-m;
//    }
//    public int multi(){
//        return n*m;
//    }
//    public int divi(){
//        if(m==0){
//            System.out.println("m不能为0");
//        }
//        return n/m;
//    }

    //hsp-method
    double num1;
    double num2;
    public Cale(double num1,double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public double sum(){
        return num1+num2;
    }
    public double difference(){
        return num1-num2;
    }
    public double multi(){
        return num1*num2;
    }
    public Double divi(){//用包装类
        if(num2==0){
            System.out.println("num2不能为0");
            return null;//不能把null  赋给基本数据类型，所以改成 Double包装类
        }else {
            return num1 / num2;
        }
    }

}
