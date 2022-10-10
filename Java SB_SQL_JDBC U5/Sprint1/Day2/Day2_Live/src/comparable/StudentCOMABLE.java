package comparable;

import java.util.Objects;

public class StudentCOMABLE implements Comparable<StudentCOMABLE>
{

    private int roll;
    private String name;
    private int marks;

    public StudentCOMABLE() {
    }

    public StudentCOMABLE(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
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

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


    @Override
    public String toString() {
        return "com.oct7.Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentCOMABLE student = (StudentCOMABLE) o;
        return roll == student.roll && marks == student.marks && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name, marks);
    }


    @Override
    public int compareTo(StudentCOMABLE that) {
        if (this.getMarks() > that.getMarks())
        {
            return +1;
        }
        else
        {
            return -1;
        }
    }
}
