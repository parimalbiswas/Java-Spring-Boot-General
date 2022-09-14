

public class _5Byinding {
    // Two type of Polymorphism
    //OverLoading -->Dynamic Binding(Compiler Know RunTime)
    //OverLoading -->Static Binding(Compiler Know CompileTime)

    void one(String s)
    {

    }
    void one(Integer i)
    {

    }
    public static void main(String[] args) {
        _5Byinding r1= new _5Byinding();
        r1.one(5);
    }
}
