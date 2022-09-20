public class P11_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1= new StringBuilder("Java");
        sb1.append("Kotlin");
        System.out.println(sb1);
        //conversion from stringbuilder to String
        sb1.toString();




        String sb2= "imutable";
        sb2.concat("appended");
        System.out.println(sb2);

        //conversion from String to stringbuilder
        StringBuilder stringBuilder =  new StringBuilder(sb2);


        System.out.println("-----------------------------------------");
        System.out.println("abc".compareTo("abc"));
        System.out.println("a".compareTo("a"));
        System.out.println("a".compareTo("b"));
        System.out.println("b".compareTo("a"));




    }
}
