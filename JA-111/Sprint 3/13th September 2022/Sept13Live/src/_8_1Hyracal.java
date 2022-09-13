class Pet{
    void speak(){
        System.out.println("pet speaking");
    }
}


class Dog1 extends Pet
{
    @Override
    void speak()
    {
        System.out.println("breaking");
    }
}

class  Cat1 extends Pet
{
    @Override
    void speak()
    {
        System.out.println("Muuu");
    }
}

//class MultipleInheritance extends Cat,Dog
//{
//
//}



public class _8_1Hyracal {
    public static void main(String[] args) {

    }
}
