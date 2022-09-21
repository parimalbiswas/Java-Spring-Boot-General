package pack2;

import pack1.One;

public class Two extends One{
    public static void main(String[] args) {
        One one = new One();
        //one.hi(); //error -> default not availabe outsid package

        Two two = new Two();
        two.hello();  //proteddted

    }
}
