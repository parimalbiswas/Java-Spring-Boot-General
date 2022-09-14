class Bike{
    void run()
    {
        System.out.println("Bike Run");
    }
}

class Splender extends Bike{
    void run()
    {
        System.out.println("Splender Run");
    }
}
public class _7UpcastingMethodCall {
    public static void main(String[] args) {
        Bike bike = new Splender();
        bike.run();

        //InStance of
        Integer i=10;
        System.out.println(i instanceof Integer);
        //System.out.println(i instanceof String);
        System.out.println(i instanceof Object);


        System.out.println(bike instanceof Bike);
        System.out.println(bike instanceof Object);
        //System.out.println(bike instanceof Splender);
    }
}
