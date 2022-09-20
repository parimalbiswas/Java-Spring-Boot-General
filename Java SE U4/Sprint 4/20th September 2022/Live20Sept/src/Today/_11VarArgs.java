//    IF we dont know the how many input we need to take
package Today;

public class _11VarArgs {
    void print(int i)
    {
        System.out.println(i);
    }

    void print(int i,int j)
    {
        System.out.println(i+j);
    }

    // As many as num you can pass. It will treated as a Array
    static void print(Integer... integers)
    {
        for (Integer elem : integers) {
            System.out.println(elem+"");
        }
    }

    public static void main(String[] args) {
        print(1,2,3,4,5,6,7,8);
    }

}
