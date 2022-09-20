package Today;
interface AnimalInterface{
    void eat();
}
//interface Bird extends AnimalInterface{
//    void fly();
//}


//concreate  class and interface is always IS-A relationShip
interface BirdInterface{
    void fly();
}

class Eagle implements BirdInterface,AnimalInterface{

    @Override
    public void eat() {
        System.out.println("Egal eats");
    }

    @Override
    public void fly() {
        System.out.println("Fly high");
    }
}


public class _4RelationshipBtwnClassAndInterfaces {

}

//    class vs interface
//    interface entends another interfaces
//    class A extends class B, Class C // not support multiple iheritance
