public class _5CommendLineArgs {
    public static void main(String[] args) {
        //Go to right click-> Modify run configaration
        // one two
//        String args={"one","two"};
//        || Backend ocouring
        System.out.println(args.length);

        for (String elem : args) {
            System.out.println(elem);
        }
    }
}
