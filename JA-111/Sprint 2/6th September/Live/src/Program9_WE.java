



public class Program9_WE {
    String name; // Coustomar name
    double balance;
    static String bankName;


    public static void main(String[] args) {
        Program9_WE.bankName = "HDFC";

        Program9_WE yourAcc = new Program9_WE();
        yourAcc.balance=545544.f;
        yourAcc.name="Paimal";

        Program9_WE yourAcc2 = new Program9_WE();
        yourAcc2.balance=20000;
        yourAcc2.name="Arjun";


        System.out.println(yourAcc.balance+" "+ yourAcc.name);
        System.out.println(Program9_WE.bankName);






    }


}
