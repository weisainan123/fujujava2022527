package Test;

//递归--汉诺塔
public class RecursiveHanoi {
    public static void main(String[] args){
        Han h =new Han();
        h.move(2,'A','B','C');
    }
}

class Han{
    //num 表示要移动的个数，a,b,c 分别表示A塔 B塔  C塔
    public void move(int num,char a,char b,char c){
        if(num ==1){//只有一个盘 num = 1
            System.out.println(a+"-->"+c);
        }else{
            //如果有多个盘，可以看成两个盘，最下面和最上面的所有盘（num-1）
            //(1)先移动上面所有的盘到 b ,借助c
            move(num - 1,a,c,b);
            //（2）把最下面的这个盘，移到c
            System.out.println(a+"-->"+c);
            //(3)再把b塔的所有盘，移动到c 借助a
            move(num - 1,b,a,c);
        }

    }
}
