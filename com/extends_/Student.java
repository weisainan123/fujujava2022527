package com.extends_;

//父类，是Pupil 和 Graduate的父类
public class Student {
    //共有属性
    public String name;
    public int age;
    private double score;//成绩

    //共有的方法
    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("学生名=" + name + "\t" + "年龄=" + age + "\t" + "成绩=" + score);
    }

}
