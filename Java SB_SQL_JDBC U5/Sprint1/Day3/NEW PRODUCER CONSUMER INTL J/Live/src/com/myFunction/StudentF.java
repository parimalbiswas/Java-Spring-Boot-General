package com.myFunction;

public class StudentF {
    int roll;
    String name;
    int mark;

    public StudentF(int roll, String marks, int mark) {
        this.roll = roll;
        this.name = marks;
        this.mark = mark;
    }

    public StudentF() {
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
