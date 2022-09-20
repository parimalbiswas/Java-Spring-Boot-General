package Today;
class Parent111{
    void hi()
    {
        System.out.println("Hi");
    }
}

class  Child111 extends Parent111{
    @Override
    void hi() {
        System.out.println("Hisss Child");
    }
}

class EarlyBind111{

    void hi() {
        System.out.println("Early bind");
    }
}
public class _7_1EarlyLateBinding {
    public static void main(String[] args) {
        EarlyBind111 earlyBind111 = new EarlyBind111();
        //Early Binding --> Early binding mean we know what will happen
        earlyBind111.hi();


        System.out.println("------------------------------------");
        //Late Binding
        Parent111 parent111;
        parent111= new Child111();
        parent111.hi();

    }
}
