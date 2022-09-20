//Static Keyword

class Student{
    int age;
    String name;
    static String batchName = "JA111";

    void play()
    {
        System.out.println(name+" is playing");
    }
}


public class Program6 {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.age=24;
        s1.name="Parimal";
        s1.play();
        System.out.println(s1.age+" "+s1.name);
        System.out.println(Student.batchName);


        Student s2;
        s2=s1;
        System.out.println(s2);  // Error

//        Student nullObj = null;
//        System.out.println(nullObj.name); || NullPointer Exception


    }
}
