package com.Q5;
class Email{
    void send(String sender, String rec,String sub,String body)
    {

    }
}

// Hide details because
abstract class MathShape{
    final double PI =22/7;
    abstract double calculateArea();

    void whatsthis()
    {
        System.out.println("REdme this is what is this check");
    }
}

class Circle extends MathShape{
    int r;
    @Override
    double calculateArea() {
        return PI*r*r;
    }
}

class Square extends MathShape{
    int r;
    @Override
    double calculateArea() {
        return r*r;
    }
}

class Cylender extends MathShape{
    int r;
    int h;
    @Override
    double calculateArea() {
        return PI*r*r*h;
    }
}

public class _5Abstraction {
    //inheritance
    //Plymorphisma(Static, Dynamic)
    //Encapsulation - JavaBeen Pojo
    //abstract -> summary -> Hide the details

    public static void main(String[] args) {
        new Email().send(null,null,null,null);
        MathShape shape = new Circle();
        shape.calculateArea();

        new Cylender().calculateArea();
    }
}


// Abstraction class can Provide abstraction from 0 (All concrete) to 100%

