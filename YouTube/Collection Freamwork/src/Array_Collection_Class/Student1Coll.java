package Array_Collection_Class;

import java.util.Objects;

public class Student1Coll implements Comparable<Student1Coll>{
    String name;
    int rollNo;

    public Student1Coll(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1Coll that = (Student1Coll) o;
        return rollNo == that.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }


    @Override
    public String toString() {
        return "Student1Coll{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public int compareTo(Student1Coll that) {
        return this.rollNo - that.rollNo;
    }
}

