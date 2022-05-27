package Test;

public class HomeWork02 {
    public static void main(String[] arg){
            String[] strs = {"a","d","f"};
            A02 a02 = new A02();
            int res = a02.find("a",strs);
            System.out.println(res);
    }
}
/*
类名 A02
方法名 find
方法返回类型 int
参数：string  ，string[]
 */
class A02{
    public int find(String findStr,String[] strs){
        for(int i = 0;i < strs.length;i++){
            if(findStr.equals(strs[i])){
                return i;
            }
        }
        return -1;
    }
}
