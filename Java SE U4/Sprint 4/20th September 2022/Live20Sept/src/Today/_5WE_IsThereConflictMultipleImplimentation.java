package Today;

interface Shape1{
    String s="Shape";
    void draw();
}

interface Rectangle1 extends Shape1{
    String s="Rectangle";
    void draw();
}
// The

class Square1 implements Shape1,Rectangle1{

    @Override
    public void draw(){
        System.out.println("In square1 draw");
    }
    void getS()
    {
        System.out.println(Rectangle1.s);
        System.out.println(Shape1.s);
    }
}


public class _5WE_IsThereConflictMultipleImplimentation {
    public static void main(String[] args) {
        Square1 square1 = new Square1();
        square1.draw();
        square1.getS();
    }
}


//Priority How to low -->
//Public   1.
//Protected  2.
//default   3.
//Private   4.