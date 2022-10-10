package FunctionalProgramming.parmtrStudent;

public class IntrXXXImpl implements IntrXXX{
    @Override
    public void sayHellow(StudentXXX studentXXX)
    {
        System.out.println("Roll No is-> "+studentXXX.getRoll());
        System.out.println("Name is-> "+studentXXX.getName());
        System.out.println("Marks  is-> "+studentXXX.getMarks());
    }
}
