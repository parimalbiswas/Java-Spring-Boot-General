
public class Program5 {
    int nonStaticInt = 90;
    static int staticInt=100;

    public static void main(String[] args) {
        System.out.println(staticInt);
        //System.out.println(nonStaticInt); // Error


       // how to load nonstaticInt into Memory
        // Create an object
        Program5 p5= new Program5();
        System.out.println(p5.nonStaticInt);
    }
}
