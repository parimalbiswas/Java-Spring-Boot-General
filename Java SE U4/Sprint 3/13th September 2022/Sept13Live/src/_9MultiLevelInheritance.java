class GrandParent{
    void facialFeatchers()
    {
        System.out.println("Facial features");
    }
}
class  Parent extends GrandParent{

}

class Child extends Parent{

}

public class _9MultiLevelInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.facialFeatchers();

    }
}
