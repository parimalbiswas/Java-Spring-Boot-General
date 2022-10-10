package FunctionalProgramming.parmtrStudent;

public class DemoXXX {
    public static void main(String[] args)
    {
        //Option One
        IntrXXX intrXXX = new IntrXXXImpl();
        intrXXX.sayHellow(new StudentXXX(10,"hbg",289));


        System.out.println("----------------------------");



        //Option One -- Using Lamda
        IntrXXX intrXXX1 =  s->{
            System.out.println("Roll is-> "+s.getRoll());
            System.out.println("Name is-> "+s.getName());
            System.out.println("Marks is -> "+s.getMarks());
        };
        intrXXX1.sayHellow(new StudentXXX(25,"haha",255));
    }
}
