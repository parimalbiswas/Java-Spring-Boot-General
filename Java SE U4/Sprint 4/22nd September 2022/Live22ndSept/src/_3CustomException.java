import java.util.Scanner;

class DeplicateException extends Exception{
    public DeplicateException(String message) {
        super(message);
    }

    public DeplicateException()
    {

    }
}

public class _3CustomException {
    static void validate_email() throws DeplicateException
    {
        Scanner scanner = new Scanner(System.in);
        String emails[] = {"abc@gmail.com", "AKJK@gmail.com"};
        System.out.println("Enter an email");
        String emailUser =  scanner.next();

        for (String el : emails) {
            if (emails.equals(el))
            {
                throw  new DeplicateException("Email Exists");
            }
        }
    }
    public static void main(String[] args) {
       try
       {
           validate_email();
       }
       catch (Exception e)
       {
           System.out.println(e.getMessage());
       }
    }
}

///CHECK AGAIN THIS