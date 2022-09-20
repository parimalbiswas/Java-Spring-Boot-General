package Today;
interface Animal{
    // By default its abstract if we not menntion also
    //Abstract and final dont go together. method cant be final
     void move();

}

abstract class Fish implements Animal{
   // void move();
}

class Dolphin extends Fish{

    @Override
    public void move() {
        System.out.println("Dolphine swim and Jump");
    }
}
public class _2MethodsAnInterface {
    public static void main(String[] args) {
        new Dolphin().move();

        Dolphin dolphin = new Dolphin();
        System.out.println(dolphin instanceof Fish);
        System.out.println(dolphin instanceof Animal);
    }
}
