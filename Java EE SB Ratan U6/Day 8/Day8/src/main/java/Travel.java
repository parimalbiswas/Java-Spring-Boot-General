public class Travel {

    private  Vehicle vehicle;



    public Travel() {
    }

    //CONSTRUCTOR INJECTION POINT
    public Travel(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    //SETTER INJECTION POINT
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void journey(){

        vehicle.go();

        System.out.println("Journey Started...");
    }
}
