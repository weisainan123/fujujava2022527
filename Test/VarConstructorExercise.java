package Test;

//构造器练习
public class VarConstructorExercise {
    public static void main(String[] args){
      Person4 p1= new Person4();
      System.out.println("age="+p1.age+"name="+p1.name);

      Person4 p2= new Person4("zhangsan",19);
      System.out.println("age="+p2.age+"name="+p2.name);
    }
}

class Person4{
    String name;//默认null
    int age;//默认0
    public Person4(){
        int pAge = 18;
    }
    public Person4(String pName,int pAge){
        name = pName ;
        age = pAge ;
    }
}
