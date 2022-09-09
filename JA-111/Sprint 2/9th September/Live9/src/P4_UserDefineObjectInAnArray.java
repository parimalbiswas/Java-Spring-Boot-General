class  Student{
    String name;

    public Student(String name) {
        this.name = name;
    }
}

public class P4_UserDefineObjectInAnArray {
    public static void main(String[] args) {
        Student students [] =  new Student[2];

        Student s1= new Student("Robot");
        Student s2= new Student("Chunnu");
        students[0]=s1;
        students[1]=s2;

        for (Student selem : students) {
            System.out.println(selem.name);
        }


    }
}
