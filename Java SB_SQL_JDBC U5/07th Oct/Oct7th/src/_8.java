@FunctionalInterface
interface  Intr_8{
    void sayHellow(String name);
}

class IntrImpl implements Intr_8{

    @Override
    public void sayHellow(String name) {
        System.out.println("Welcome  : "+name);
    }
}

public class _8 {
    public static void main(String[] args) {
        //Normal using External Class
        Intr_8 i1 = new IntrImpl();
        i1.sayHellow("Ram");

        // annonimous
        Intr_8 i2 = new Intr_8(){

            @Override
            public void sayHellow(String name) {
                System.out.println("using annonimous inner Class Welcome : "+name);
            }
        };
        i2.sayHellow("JOdu");

        //Lamda Expression
        Intr_8 i3 = name -> System.out.println("Lamda Exp Welcome : "+name);
        i3.sayHellow("Modhu");






    }
}
