public class Bike implements Vehicle{


    public void ride()
    {
        System.out.println("Bike Started...");
    }

    @Override
    public void go() {
        ride();
    }
}
