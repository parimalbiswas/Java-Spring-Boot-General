package com.Q1;

class Animal{
    void eat()
    {
        System.out.println("com.Q1.Animal Eats");
    }
}

class Dog extends Animal{
    @Override
    void eat()
    {
        System.out.println("com.Q1.Dog Eats");
    }
    void bark()
    {
        System.out.println("com.Q1.Dog Barks");
    }
}

public class _1DownCasting {
    static void DownCasting(Animal animal)
    {
        if (animal instanceof Dog)
        {
            Dog dog = (Dog) animal;
            System.out.println("Casted");
        }
        else
        {
            System.out.println("Cant be Casted");
        }

    }

    public static void main(String[] args) {
        String s="Hwllow";

        Object obj = s; //UpCasting

        System.out.println(s instanceof String); //true

        System.out.println(s instanceof  Object); //true


        Animal parent = new Dog(); //Upcasting
        parent.eat();
        //parent.bark(); // Compile Time error
        // Parent instance of com.Q1.Dog
        Dog dog = (Dog) parent; // DownCasting
        dog.bark();

        DownCasting(parent);


        Animal purelyAnimal = new Animal();
        DownCasting(purelyAnimal);
        System.out.println("This will not print");


    }
}
