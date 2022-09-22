import java.io.IOException;

public class _2WE {

    public static void m() throws ArithmeticException
    {
        throw new  ArithmeticException("m method");
    }

    public static void n() throws IOException
    {
        m();
        throw new IOException("m method");
    }

    public static void p()
    {
        try {
            n();
        }
        catch (Exception e)
        {
            System.out.println("Handeled By p"+e.getMessage());
        }
    }


    public static void main(String[] args) {
        p();
    }
}
