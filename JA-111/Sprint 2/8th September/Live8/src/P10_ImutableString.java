


public class P10_ImutableString {
    //String are imutable(constant/unchange)
    public static void main(String[] args) {

        String s1= "Hi";  // ["Hi"]<-- s1 pointing this
        String temp = s1; //  Temp--> "Hi"   <-- s1
        s1=s1+s1;  // HiHi <--- pointing by s1.|| Hi is ready for garbage collector
        System.out.println(s1);
        System.out.println(temp);



        String password =  "xyz";
        password="newPassword";
        System.out.println(password);

            //   Drawback of Imutability
        String longitude="34.2677565";
        String latitude = "25.568598";



    }
}
