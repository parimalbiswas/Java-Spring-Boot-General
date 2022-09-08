//Calling constractor using this
public class P2 {
    P2()
    {
        // this() call should be the first line of Constractor.
        this(10);  // This will point current constractor
        System.out.println("Default constractor");
    }

    P2(int x)
    {
        System.out.println("Parametarized constractor");
    }

    public static void main(String[] args) {
        P2 obj =  new P2();
    }
}
