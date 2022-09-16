package com.Q4;
class ClassWithPrivateVariable{
    private int i=10;
}

class Family{
    private int anProparty=10000;
    void hello()
    {
        System.out.println(anProparty);
    }
}
public class _4AcesssSpacifier {

    public static void main(String[] args) {
        ClassWithPrivateVariable obj1 = new ClassWithPrivateVariable();
        //System.out.println(obj1.i);//
        Family family = new Family();
        family.hello();
    }
}
