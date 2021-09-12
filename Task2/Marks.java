package com.company.groupProject.Task2;

public abstract class Marks {
    int sub1;
    int sub2;
    int sub3;
    int sub4;
    abstract void getPercentage();
}
class StudentA extends Marks {
    StudentA(int sub1, int sub2, int sub3) {
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
    }
    @Override
    void getPercentage() {
        double aver = (sub1+sub2+sub3)/3;
        System.out.println("The average score of studentA is "+aver);
    }
}
class StudentB extends Marks {
    StudentB(int sub1, int sub2, int sub3, int sub4) {

        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
    }
    @Override
    void getPercentage() {
        double aver = (sub1+sub2+sub3+sub4)/4;
        System.out.println("The average score of studentB is "+aver);
    }
}
