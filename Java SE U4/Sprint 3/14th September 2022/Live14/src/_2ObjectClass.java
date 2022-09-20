class MyClass extends Object{
    String message = "How r u ?";
    @Override
    public String toString()
    {
        return message;
    }
}


class Student extends Object{
        @Override
        public String toString()
        {
            return "Hellow Parimal";
        }
}

public class _2ObjectClass {
    public static void main(String[] args) {
        Object obj; //All Java Class have root class is Object
        MyClass myClass = new MyClass();
        System.out.println(myClass);



        Student student = new Student();
        System.out.println(student);

        Student [] studentArr = {student,student};

        for (Student elem : studentArr) {
            System.out.println(elem);
        }
    }
}
