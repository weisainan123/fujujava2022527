package Test;

public class HomeWork03 {
    public static void main(String[] args){
//        Book book = new Book();
//        int res = book.updatePrice(151);
//        System.out.println(res);

        //构造器+this
        Book book = new Book(200);
        book.updatePrice();

    }
}
class Book{
//    public int updatePrice(int p1){
//        if(p1>150){
//            return 150;
//        }else (p1>100){
//            return 100;
//        }
//    }
    //强制性使用无参方法---构造器+this
    int price;
    public Book(int price){
        this.price=price;
    }
    public void updatePrice(){
        if(price>150){//方法中没有局部变量，this.price 等价于price
            price = 150;
        }else if(price>100){
            price = 100;
        }
        System.out.println(price);
    }

}
