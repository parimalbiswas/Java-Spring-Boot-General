class  Simple{
    int Factorial(int num)
    {
        int fact;
        if(num ==1 || num==2)
        {
            return  num;
        }
        return num*Factorial(num-1);
    }



    int sum(int x,int y)
    {
        printSum(x+y);
        return x+y;
    }

    static void ststicMethod()
    {
        System.out.println("static");
    }

    void printSum(int a)
    {
        System.out.println(a);
    }
}

public class P4 {
    public static void main(String[] args) {
        Simple s1= new Simple();
        System.out.println(s1.Factorial(5));

        Simple s2= new Simple();
        System.out.println(s2.sum(2,5));

        Simple.ststicMethod();

    }
}
