package Today;
class Parent{
    void hi()
    {
        System.out.println("Hi");
    }
}

class  Child extends Parent{
    @Override
    void hi() {
        System.out.println("Hisss Child");
    }
}

class EarlyBind extends Parent{
    @Override
    void hi() {
        super.hi();
    }
}
public class _7EarlyLateBinding {
    public static void main(String[] args) {
        Parent parent = new Parent();
//        parent.hi();

        Parent p;
        //p = new Parent();

        //:ate Binding
        //p.hi(); //
    }
}

//Early Binding --> Mean we know which method to call
//Late Binding -->
