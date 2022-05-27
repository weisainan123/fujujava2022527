package Test;

public class HomeWork07 {
    public static void main(String[] args){
            Dog1 dog1 = new Dog1("花花","黄白斑点",2);
            dog1.show();
    }
}
class Dog1{
    String name;
    String color;
    int age;
    public Dog1(String name,String color,int age){
            this.age = age;
            this.color = color;
            this.name = name;
    }
    public void show(){
       System.out.println(name+color+age);
    }

}
