package Today;

interface Shape{

}
//Concreate class (0% Abstraction)
//Abastract class (50% 50% partiacial Abstraction may be)
//Interface class (100% Abstraction before java 8)

interface MasaiStudentsContract{
    // By default variable public static final
    //Static mean is common for everyone
    public static final double fees =0.0;
}

class StudentOfMasai implements MasaiStudentsContract{

}


public class _1InterFaceDemo {
    public static void main(String[] args) {
        StudentOfMasai student =  new StudentOfMasai();
        System.out.println(MasaiStudentsContract.fees);
    }
}
