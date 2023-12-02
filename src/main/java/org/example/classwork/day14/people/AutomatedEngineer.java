package org.example.classwork.day14.people;

public class AutomatedEngineer extends Engineer {

    public AutomatedEngineer(int age, int experience) {
        super(age, experience*3, experience);
    }
    //скилл в суперконструктор передается в виде experience * 3

}
