package Test;

//封装练习题
public class VarEncapsulationExercise {
    private String name;
    private double salary;
    private String pwd;


    //无参构造器
    public VarEncapsulationExercise() {
    }

    public VarEncapsulationExercise(String name, double salary, String pwd) {
        //法1
//        this.name = name;
//        this.salary = salary;
//        this.pwd = pwd;
//        setName(name);
//        setSalary(salary);
//        setPwd(pwd);

        //法2
        this.setPwd(pwd);
        this.setSalary(salary);
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 2 || name.length() == 3 || name.length() == 4) {
            this.name = name;
        } else {
            this.name = "张大大";
            System.out.println("名字长度不满足要求，默认名字给=" + this.name);

        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 20) {
            this.salary = salary;
        } else {
            this.salary = 20;
            System.out.println("余额必须大于20，给默认金额=" + this.salary);

        }

    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            this.pwd = "123456";
            System.out.println("密码长度不符合要求，给默认密码=" + this.pwd);

        }

    }

    //输出信息
    public void showInfo() {
        System.out.println("name=" + name + "\t" + "salary=" + salary + "\t" + "pwd=" + pwd);
    }
}




