package Today;


interface Food{
    void dineIn();
    //Deliver
    default void deliver(){
        System.out.println("Delivering Food");
    }

    static void eat()
    {
        System.out.println("Eat Food");
    }

}
//If u add a new method in interface.
//all implemented class will stop working./


class Dhosa implements Food{

    @Override
    public void dineIn() {
        System.out.println("Serving Dhosa...");
    }
}

class Idlii implements Food{

    @Override
    public void dineIn() {
        System.out.println("Serving Idlli...");
    }
}






public class _6DefaultMethod {
    public static void main(String[] args) {
        Food dosa = new Dhosa();
        dosa.dineIn();
        dosa.deliver();

        Idlii idlii = new Idlii();
        idlii.deliver();

        Food.eat();
    }
}



