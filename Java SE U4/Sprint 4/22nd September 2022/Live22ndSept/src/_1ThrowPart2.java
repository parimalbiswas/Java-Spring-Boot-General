import java.io.IOException;

public class _1ThrowPart2 {
    static void validate(int age) throws IOException {
        if(age<18)
        {
            throw new IOException("Age is less than 18");
        }
        else
        {
            System.out.println("CAst");
        }
    }
    public static void main(String[] args) {
        //validate(20);
        try
        {
            validate(17);
        }
        catch (IOException e)
        {
            System.out.println("Error "+e.getMessage());
           //throw new RuntimeException(e.getMessage());
        }
    }
}
