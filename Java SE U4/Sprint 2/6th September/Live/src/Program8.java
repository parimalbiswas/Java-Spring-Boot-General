

public class Program8 {

    static int x;
    int y;

    public static void main(String[] args) {
        Program8 p81 =  new Program8();
        p81.x=10;
        p81.y=20;

        Program8 p82 =  new Program8();
        p82.x=50;
        p82.y=20;

        System.out.println(p81.x);  //50  Output. It will replace 10

    }
}
