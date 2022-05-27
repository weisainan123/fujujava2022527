package com.ts;

import com.xiaoqiang.Dog;
import java.util.Arrays;
//java常用的包  java.lang.* 基本包默认引入不需要在引入
//             java.util.* 工具包
//             java.net.*  网络开发常用的包
//             java.awt.*  前端网页常用的包
//包&访问修饰符
public class Test1 {
    public static void main(String[] args) {
      Dog dog = new Dog();
      System.out.println(dog);//com.xiaoqiang.Dog@1b6d3586

     com.xiaoming.Dog dog1 = new com.xiaoming.Dog();
     System.out.println(dog1);

     //使用系统系统提供的Arrays 完成数组排序
        //传统方法是冒泡
        //新方法
        int[] arr = {1,-1,2,4,-9};
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
/*包
命名规则：
只能包含数字，字母，下划线，小圆点.  但是不能用数字开头，不能是关键字或保留字
  举例  demo.12a//不能用数字开头
        demo.class.exer1//不能是关键字
命名规范：
一般是小写字母+小圆点    com.公司名.项目名.业务模块名
   举例 com.sina.crm.user//用户模块
        com.sina.crm.order//订单模块
        com.sina.crm.utils//工具类
 */

/*访问修饰符
            同类   同包   子类  不同包
public       1      1       1       1
propect      1      1       1       0
默认         1      1       0       0
private      1      0       0       0
注意事项：
修饰符可以用来修饰类中的属性、成员方法和类
只有public和默认 能够修饰类，并且遵循上述的规则
 */
