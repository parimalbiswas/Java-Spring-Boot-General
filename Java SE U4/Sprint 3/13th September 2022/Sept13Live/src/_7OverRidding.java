class Father
{
    void earn()
    {
        System.out.println("Earn running By Bussness");
    }
}

class You extends Father
{
    //Overridding Rules
//    1. There should be a IS A RelationShip
//    2. Method name and type should be same
//    3.args list of both the methods should be the same

    @Override
    void earn()
    {
        System.out.println("Earn running By Bussness");
        System.out.println("Earn by software Engineer");
    }
}
public class _7OverRidding {
    public static void main(String[] args) {
        Father father = new Father();
//        father.earn();

        You you = new You();
        you.earn();
    }
}
