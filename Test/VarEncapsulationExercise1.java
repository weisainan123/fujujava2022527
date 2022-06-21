package Test;

//和VarEncapsulationExercise类 同一题
public class VarEncapsulationExercise1 {
    public static void main(String[] args) {
        //法1、在同一个包中，类的访问权限是public，所以可以访问VarEncapsulationExercise类
        VarEncapsulationExercise varEncapsulationExercise = new VarEncapsulationExercise();//无参构造器
        // 为什么要在调用的类中写无参构造器？直接给类实例化一个对象，通过对象调用set方法不行么？？
        varEncapsulationExercise.setName("张军迷张娜拉张东辽");
        varEncapsulationExercise.setSalary(21.0);
        varEncapsulationExercise.setPwd("12dhsjhdsjfcdb");
        varEncapsulationExercise.showInfo();

//        //法2  利用含有三个参数的构造器
//        VarEncapsulationExercise varEncapsulationExercise = new VarEncapsulationExercise("张军迷张娜拉张东辽",22.0,"12dhsjhdsjfcdb");
//        varEncapsulationExercise.showInfo();
    }
}
