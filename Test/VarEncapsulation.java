package Test;

//封装
public class VarEncapsulation {
    public static void main(String[] args) {
        //如果要使用快捷键alt+r,需要先配置主类
        //第一次，我们是用鼠标点击形式运算程序，后面就可以使用快捷键了
        Person6 person6 = new Person6();
        person6.setName("milan米拉秘密拉姆");
        person6.setAge(15);
        person6.setSalary(100000);
        System.out.println(person6.info());

    }
}
/*封装实现步骤
1）将属性进行私有化 private（让外部不能直接修改属性）
2）提供一个公共的set方法，用于对属性判断并赋值
    public void setXxx(类型 参数名){//Xxx表示某个属性
        //加入数据验证的业务逻辑
        属性 = 参数名;
    }
3)提供一个公共的get方法，用于获取属性的值
    public 数据类型 getXxx(){//权限判断
        return xx;
    }
 */


//案例：不能随便查看人的年龄、工资等隐私，并对设置的年龄进行合理的验证，否则就给默认，
// 年龄须在1--100之间，name长度在2-6之间，工资不能直接查看
class Person6 {
    public String name;
    private int age;
    private double salary;
    private String job;

    //直接写setXxx  和getXxx方法 较慢 使用快捷键
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字不对");
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
