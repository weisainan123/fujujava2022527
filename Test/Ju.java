package Test;

public class Ju {
    public static void main(String[] args){
        //1、数据类型
        /*基本数据类型
        数值型:整数类型byte、short、int、long
               浮点类型float单精度、double双精度
        字符型：char 存放单个字符
        布尔型：Boolean 存放true ，false

        引用数据类型
        类class、接口interface、数组[]
         */
        String name = "福橘";
        int age = 17;
        char agent = '女';
        double score = 500;
        int score1 = 500;
        String school = "浙江大学";

        System.out.println("----xx学生2022届考研成绩公布----");
        System.out.println(name);
        System.out.println(age);
        System.out.println(agent);
        System.out.println(score);
        System.out.println(score1);
        System.out.println(school);


        /*2、+ 的使用
        当左右两边都是数值型，+ 做加法运算
        当左右两边有一方为字符串时，+ 做拼接运算
         */
        System.out.println(100 + 86);
        System.out.println("100" + 86);


        //3、整型
        int a = 1;
        long b = 1l;

        //4、浮点型 默认是双精度浮点类型double,如果声明float型常量，需后加f或F
        //float num1 = 1.1;//错误
        float num2 = 1.1f;
        float num3 = 1.1F;
        double num4 = 1.1;
        double num5 = 1.1f;//4个字节放入8个字节，OK的
        System.out.println("num5的值"+"="+num5);

        /*4.1
        浮点型常量有两种表现形式（十进制数形式和科学计数法形式）
        十进制数形式 如5.12  512.0f  .512(必须有小数点)
        科学计数法表现形式 如5.12e2(5.12*10的2次方)  5.12E-2（5.12/10的2次方）
         */
        double num6 = .512;//等价于0.512
        System.out.println("num6的值"+"="+num6);

        /*4.2
        通常情况下使用double型，比float型更准确
         */
        float num7 = 2.123456789f;
        double num8 = 2.123456789;
        System.out.println("num7的值为"+num7);
        System.out.println("num8的值为"+num8);

        /*4.3
        数学中运算结果相同，在计算器中不同
         */
        double num9 = 2.7;//2.7
        double num10 = 8.1/3; //接近2.7的一个小数
        System.out.println("num9的值为"+num9);
        System.out.println("num10的值为"+num10);


        /*5、字符类型char
        字符类型可以表示单个字符，char是两个字节（可以存放汉字），
        多个字符用字符串string表示
         */
        char c1 = 'a';   //字符常量是用''单引号括起来的单个字符
        char c2 = '\t';  //java中还允许使用转义字符 '\'来将其后的字符特殊字符型常量 '\t'表示制表符
        char c3 = '中';
        char c4 = 97;   //字符类型可以直接存放一个数字
                        //在Java中，char的本质是一个整数，在输出时是unicode码对应的字符。
                        //可以直接给char赋一个整数，然后输出时，会按照对应的unicode字符输出

        System.out.println(c4);//输出a
        System.out.println((int) c1);//输出a对应的数字
        System.out.println((int) c3);//输出中 对应的unicode编码
        char c5 = 38889;
        System.out.println(c5); //输出38889编码对应的韩
        System.out.println('a'+10);//char类型是可以直接进行运算的，相当于一个整数，因为有对应的unicode码.  97+10  107

        /*
        5.1课堂测试
         */
        char c6 = 'a'+1;//97+1
        System.out.println((int) c6);//输出98
        System.out.println(c6);//输出98对应的字符 b

        /*6、布尔类型boolean
        布尔类型也叫boolean类型，boolean类型数据只允许取值true 和false,无null
        boolean类型占1个字符
        boolean适用于逻辑运算，一般用于程序流程控制if/while/do-while/for循环

        不可以用0/非0来代替false和true,和C语言不同
         */
        boolean isPass = true;
        if(isPass == true){
            System.out.println("考试通过");
        }else{
            System.out.println("考试落榜");
        }

        
        /*7、
        自动类型转换：java程序在进行赋值或者运算时，精度小的类型自动转换为精度大的数据类型
        数据类型按精度（容量）大小排序：
                 char----int----long----float----double
        byte----short----int----long----float----double
         */
        int num = 'a';
        double d1 = 80;
        System.out.println(num);//97
        System.out.println(d1);//80.0

        /*7.1自动类型转换细节
        7.1有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行运算；
        7.2当我们把精度（容量）大的数据类型赋值给精度（容量）小的数据类型时，就会报错，反之，就会进行自动类型转换；
        7.3(byte、short)和char之间不会相互自动转换；
        7.4byte,short,char三者可以进行计算，计算时优先转换成int类型；
        7.5boolean不参与转换；
        7.6自动提升原则：表达式结果的类型自动提升为 操作数中最大的类型
         */
        //7.2  float f1 = 1.1;错误  1.1是double类型--->float

        byte b1 = 1;
        byte b2 = 2;
        short s1 = 3;
        //7.3  short s2 = b1 + b2;  错误 b1+b2结果是int类型，int--->short
        //7.3  byte b3 = b1 + b2;   错误 b1+b2结果是int类型，int--->byte
        int i1 = b1 + b2;//7.4 正确 b1+b2结果是int类型，int--->int
        short s2 = (short) (b1 + b2);//正确 强制类型转换

        boolean pass = true;
        //7.5 int i2 = pass; boolean不参与自动类型转换
        boolean i2 = pass;//正确

        double d2 = 1.1;
        float f1 = 1.1f;
        long l1 = 10000l;
        int i3 = 1;
        short s3 = 10;
        //7.1和7.6  int i4 = d2 + f1 + l1 + i3 + s3; 错误 表达式右边自动转换为表达式中最大的类型double类型，左边是int类型
        int i5 = (int) (d2 + f1 + l1 + i3 + s3);//正确 强制类型转换
        double i6 = d2 + f1 + l1 + i3 + s3;//正确


        /*
        8、强制类型转换
        自动类型转换的逆过程，将容量大的数据类型转换成容量小的数据类型，但可能造成精度降低或溢出,需注意
         */
        int i7 = (int)1.1;
        int i8 = 100;
        byte b4 = (byte)i8;
        System.out.println("i7的值为" + i7);
        System.out.println("b4的值为" + b4);
        //强制类型转换只针对最近的操作数有效，往往会使用小括号提升优先级
        //int i9 = (int)10*3.5+2*3.2; 错误 double--->int
        int i10 = (int)(10*3.5+2*3.2);//正确 int--->int
        //char类型可以保存int的常量值，不能保存int的变量值
        char c7 = 100;//正确 可以保存int的常量值
        int i11 = 100;
        //char c8 = i11; 错误 不能保存int的变量值
        char c8 = (char)i11;//正确
        System.out.println(c8);//输出100对应的字符
        //byte和short、char类型在进行运算时，当作int类型
        byte b5 = 1;
        short s4 = 2;
        int i12 = b5 + s4;

        /*
        9、String和基本类型转换
         */
        //基本数据类型转String 语法：将基本类型的值+""即可。
        int n1 = 1;
        float n2 = 2f;
        double n3 = 3;
        Boolean n4 = true;
        String str1 = n1 + "";
        String str2 = n2 + "";
        String str3 = n3 + "";
        String str4 = n4 + "";
        System.out.println(str1 + "" + str2 + "" + str3 + "" + str4);
        //String类型转基本数据类型 语法：通过基本类型的包装类调用parseXX即可
        String str5 = "123";
        byte bb1 = Byte.parseByte(str5);
        short ss1 = Short.parseShort(str5);
        int ii1 = Integer.parseInt(str5);
        long ll1 = Long.parseLong(str5);
        float ff1 = Float.parseFloat(str5);
        double dd1 = Double.parseDouble(str5);
        boolean bb11 = Boolean.parseBoolean("true");
        System.out.println(bb1);//123
        System.out.println(ss1);//123
        System.out.println(ii1);//123
        System.out.println(ll1);//123
        System.out.println(ff1);//123.0
        System.out.println(dd1);//123.0
        System.out.println(bb11);//true

        //把字符串转成单个字符string--->char. 是把字符串中的第一个转成字符
        System.out.println(str5.charAt(0));




    }
}
