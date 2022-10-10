package FunctionalProgramming.parmtr1;

public class Demo_FP1 {
    public static void main(String[] args) {

        //Using External Class
        Inter2 i1 = new _1Inter2_Impl();
        i1.sayHello("Ram");


        //Using Annonimous InnerClass
        Inter2 i2 = new Inter2(){

            @Override
            public void sayHello(String name) {
                System.out.println("Welcome using annoniomous innerClasss "+name);
            }
        };
        i2.sayHello("Madhu");


        //Using Lamda Expration
        Inter2 i3 = name -> System.out.println("Welcome using LE: "+name);
        i3.sayHello("Jadu");


    }

}
