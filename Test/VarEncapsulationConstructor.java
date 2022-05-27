package Test;

//封装与构造器
public class VarEncapsulationConstructor {
    public static void main(String[] args) {
        Person7 person7 = new Person7("张三大大大大大大大大", 99, 100000.33);
        System.out.println("=========张三大大大大======");
        System.out.println(person7.info());
    }
}

class Person7 {
    public String name;//名字公开
    private int age;//年龄私有化
    private double salary;//工资私有化

    //构造器
    public Person7() {

    }

    //有三个属性的构造器
    public Person7(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;//在这里  构造器访问可以绕过姓名校验
        //解决上面问题 可以将set写在构造器中
        setAge(age);
        setName(name);
        setSalary(salary);
    }


    //直接写setXxx  和getXxx方法 较慢 使用快捷键
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字长度不对");
            this.name = "张三";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //判断
        if (age >= 1 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("年龄不对");
            this.age = 18;//给默认年龄
        }

    }

    public double getSalary() {
        //可以增加对当前对象的权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return name + age + salary;
    }


}

//idea快捷键
/*
导入该行需要的类 先配置auto import,然后使用alt+enter即可
快速格式化代码 ctrl+alt+l
快速运行自己的程序 自己定义alt+r
查看一个类的层级关系 ctrl+H
将光标防砸一个方法上，输入ctrl+B 可以定位到方法
自动分配变量名，通过在后面加  .var
 */


