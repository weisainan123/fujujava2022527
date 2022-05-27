package Test;

//可变参数练习题
//返回姓名和两门课程成绩和，返回姓名和三门课程成绩和，返回姓名和五门课程成绩和  类Method  方法名showScore
public class VarParameterExercise {
    public static void main(String[] args){
        Method method=new Method();
        System.out.println(method.showScore("福橘",99,98));
        System.out.println(method.showScore("福橘",99,98,100));
        System.out.println(method.showScore("福橘",99,98,100,99,99));
    }
}

class Method{
    //返回类型string 把姓名和成绩封装到一个字符串中
    public String showScore(String name,int... score){
        int res = 0;
        for(int i = 0;i<score.length;i++){
            res +=score[i];
        }
        return name +"有"+ score.length +"门课程，总成绩="+ res;
    }
}
