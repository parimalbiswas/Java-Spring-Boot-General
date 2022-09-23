public class _2Boxing {
    public static void main(String[] args) {

        //Boxing AutoBoxing

        int x=5;
        Integer wrapperInt = Integer.valueOf(x);

        Integer autoBox = x;


        int printInt = wrapperInt.intValue();
        int primiInt2 = wrapperInt;
    }
}
