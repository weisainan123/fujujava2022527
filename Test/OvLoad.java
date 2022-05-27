package Test;

//方法重载  方法名相同，参数类型，参数个数，参数顺序不同
public class OvLoad {
    public static void main(String[] args){
           Methods me = new Methods();
           int res1 = me.m(2);
           int res2 = me.m(3,4);
           double res3 = me.m(1.1);
           System.out.println(res1);

           me.max(2,3);
           me.max(1.1,1.2);
           double res4 = me.max(1.1,1.2,1.3);
           System.out.println(res4);

    }
}

//编写程序
class Methods{
    //题1
    public int m(int n){
        return n*n;
    }
    public int m(int n,int m){
        return n*m;
    }
    public double m(double d){
        return d*d;
    }
    //题2
    public int max(int n,int m){
        return n>m?n:m;
    }
    public double max(double n,double m){
        return n>m?n:m;
    }
    public double max(double n,double m,double d){
        return (n>m?n:m)>d ? (n>m?n:m):d;
    }
}