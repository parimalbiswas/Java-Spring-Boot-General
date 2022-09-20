/*
* User Of Super Keyword
* */
class Animal
{
    String color="White";

    void eat()
    {
        System.out.println("Animal Eats");
    }
    Animal()
    {
        System.out.println("Animal Constractor");
    }
    Animal(String color)
    {
        System.out.println("Parameterized constractor");
    }
}

class Dog extends Animal{
    String color = "Black";
    @Override
    void eat()
    {
        System.out.println("Dog Eats");
    }
    void printColor()
    {
        // Call Current Class variable
        System.out.println(color);
        // Call Parent variable
        System.out.println(super.color);
    }



    Dog()
    {
        super("dfd"); // If we remove also it call parent COnstractor --> Called COnstractor Constractor Channing
        System.out.println("Dog COnstractor");
    }


}
public class _3SuperKeyword {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printColor();

    }
}
