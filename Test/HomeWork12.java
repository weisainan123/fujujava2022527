package Test;

public class HomeWork12 {
    public static void main(String[] args){
        Employee employee = new Employee("张三",'女',17);
        System.out.println(employee.name+employee.sex+employee.age);
    }
}
class Employee{
    String name;
    char sex;
    int age;
    String position;
    double salary;
    public Employee(String position,double salary){
            this.position = position;
            this.salary = salary;
    }
    public Employee(String name,char sex,int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
    }
    public Employee(String name,char sex,int age,String position,double salary){
            this(name,sex,age);//使用前面的构造器，调用构造器
            this.position = position;
            this.salary = salary;
    }

}
