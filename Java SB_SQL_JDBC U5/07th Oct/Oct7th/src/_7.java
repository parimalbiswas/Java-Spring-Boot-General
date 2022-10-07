//Marker Interface mean Blank Interface
@FunctionalInterface
interface Intr
{
    int x =100; // By default, public static final

    void fun1(); // By default, public and abstract

    default void fun2()
    {

    }
    static void fun3()
    {

    }
    // This is also functional inter face because its under Object method
    public abstract String toString();

    //

}

public class _7 {
    public static void main(String[] args) {

    }
}
