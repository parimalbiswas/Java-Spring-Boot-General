


public class P1_ArrayDemo {
    public static void main(String[] args) {
        //  <dtattype> <arryname> []
        int ages1 [];
        System.out.println();

        // sytax for create array ---> new <DataType>[Size]
        int ages [] = new int[10];

        String names [] =  new String[10];
        System.out.println(ages);




        Integer[] integer =  new Integer[5];
        integer[0]=20;
        System.out.println(integer[0]);

        for (int i = 0; i < integer.length; i++) {
            integer[i]=i;
            System.out.println(integer[i]);
        }


        String[] stringArr =  {"one","two","three"};
//        System.out.println(stringArr[3]); //ArrayIndexOutOfBoundsException

//        for(<datatype> loopVariable : nameOfArray)
//        {
//            sout(loopVariable);
//        }
        for(String namecanbeanything: stringArr)
        {
            System.out.println(namecanbeanything);
        }





    }
}
