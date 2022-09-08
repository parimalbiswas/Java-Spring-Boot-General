class A{
    //static is related to class mot any object
    int x=10;
    void fun1()
    {
        int x=100;
        System.out.println(this);  // this mean Current Object of a class
        System.out.println(this.x);  // access of instance variable of the current object
        System.out.println(x);  // Local variable
    }
}

public class P1 {
    int x=100;

    public static void main(String[] args) {
        A a1 = new A();
        a1.fun1();

//        System.out.println(a1.x);
//        System.out.println(a1.x);

        // You cannot refer this keyword from static area;
    }
}
