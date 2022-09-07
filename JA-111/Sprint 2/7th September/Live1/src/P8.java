class MyClass{
    int variable;
    MyClass()  // Default Constractor
    {
        System.out.println("hdgvhdg");
    }

    MyClass(int var)  // Parametarized Constractor
    {
        variable=var;
    }
}

public class P8 {
    public static void main(String[] args) {
        MyClass mc1 =  new MyClass();

        MyClass mc2 =  new MyClass(2);
        System.out.println(mc2.variable);

    }
}
