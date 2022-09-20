package com.Q2;
// Final Variable, Class, Method
class A{
    void nonFinal()
    {

    }
    final void finalMethod() // Cant be override
    {

    }
}

class B extends A{
    @Override
    void nonFinal()
    {

    }

//    @Override // Cant be override final methods
//    void finalMethod(){
//
//    }

    // Can be Over Loading final methods
    void finalMethod(String s){

    }

}

//
////Final Class Cant be extended
//final class Shape{
//
//}
//class Circle extends Shape{
//
//}

public class _2FinalKeyword {
    public static void main(String[] args) {

        final int i=20;

        final int j;
        j=10;
        //j++;// Cant be changed


    }
}
