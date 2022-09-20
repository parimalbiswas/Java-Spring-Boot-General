// Fish -> Parent , Super Class, Base Class
class Fish
{
    void swim()
    {
        System.out.println("Fish Swimming");
    }
}

// Fish -> Child , Derived Class, Sub Class
class Dolphin extends Fish
{
    void jump()
    {
        System.out.println("Dolphin Can JUMP");
    }
}

public class _6Inheritance {

    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin();
        dolphin.swim();
        dolphin.jump();

        Fish fish = new Fish();
        fish.swim();
//        fish.jum(); //Error
    }


}
