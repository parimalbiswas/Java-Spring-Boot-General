public class Demo {
    public static void main(String[] args) {

        Vehicle vehicleBike = new Bike();

        Travel travel = new Travel();
        travel.setVehicle(vehicleBike);
        travel.journey();
    }
}
