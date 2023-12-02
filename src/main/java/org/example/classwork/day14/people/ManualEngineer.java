package org.example.classwork.day14.people;

public class ManualEngineer extends Engineer {

    public ManualEngineer(int age, int experience) {
        super(age, experience*2, experience);
    }
    //скилл в суперконструктор передается в виде experience * 2

}
