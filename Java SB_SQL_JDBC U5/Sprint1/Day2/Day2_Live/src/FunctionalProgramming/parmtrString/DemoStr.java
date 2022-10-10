package FunctionalProgramming.parmtrString;

public class DemoStr {
    public static void main(String[] args) {
        IntrStr i1 = new IntrStrIMPLMT();
        String result = i1.sayHellow("Rahul");

        System.out.println(result);


        IntrStr i2 = (String name)->{
            String res = "Welcome Str : "+name.toUpperCase();
            return res;
        };
        System.out.println(i2.sayHellow("Parimal"));



        IntrStr i3 = (name)-> "Welcome Str : "+name.toUpperCase();

        System.out.println(i3.sayHellow("Biswas"));




    }
}
