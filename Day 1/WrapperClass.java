public class WrapperClass {
    public static void main(String[] args)
    {
//        System.out.println("hsdgs");
        int i=5;
        Integer ii = new Integer(i); //Boxing
        int jj  = i;                 //AutoBoxing

        System.out.println(ii);
        System.out.println(jj);


        // int j = jj.intValue();  //Unboxing
        // int k = jj;             //AutoUnboxing

    }
}
