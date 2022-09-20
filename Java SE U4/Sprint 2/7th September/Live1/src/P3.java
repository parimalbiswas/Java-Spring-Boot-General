class A
{
    int x=10;
    void funA()
    {
        System.out.println("In Fun A");
    }
}
public class P3 {
    static int j=200;
    A a1= new A();

    public static void main(String[] args) {
        P3 obj = new P3();
        System.out.println(obj.j);
        System.out.println(obj.a1);
        System.out.println();
        obj.a1.funA();

    }
}
