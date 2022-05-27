package Test;//包的本质 实际上就是创建不同的文件夹/目录来保存类文件

//this
public class ThisExercise01 {
    public static void main(String[] args){
        Person5 p1 = new Person5("marry",18);
        Person5 p2 = new Person5("marry",18);
        System.out.println(p1.compareTo(p2));

    }
}

class Person5{
    String name;
    int age;
    public Person5(String name,int age){
        this.name = name;
        this.age = age;
    }
    public boolean compareTo(Person5 p){
//        if(this.name.equals(p.name) && this.age == p.age){
//            return true;
//        }else{
//            return false;
//        }
        return this.name.equals(p.name) && this.age == p.age;
    }
}
