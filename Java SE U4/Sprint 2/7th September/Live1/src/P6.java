class  Sum{
    //Polymorphism
    //Static Binding // Compile time polymorphism // Method overloading
    int add(int x,int y)
    {
        return  x+y;
    }

    int add(int x,int y ,int z)
    {
        return  x+y+z;
    }

    String add(int x,int y ,int z,int k)
    {
        return  "x+y+z+k";
    }

    int square(int x)
    {
        System.out.println("Int");
        return  x*x;
    }

    int square(byte b)
    {
        System.out.println("Byte");
        return  b*b;
    }
}

public class P6 {
    public static void main(String[] args) {
        Sum s1 = new Sum();
        System.out.println(s1.add(2,3,4));
        System.out.println(s1.add(2,5,6,9));
        System.out.println(s1.square(5));
        System.out.println(s1.square((byte)5.9));
    }
}
