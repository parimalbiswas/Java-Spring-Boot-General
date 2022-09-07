class Person
{
    String name;
    String city;
    String zip;

}
class Address{
    String city;
    String zip;
}
class Office
{
    String companyName;
    Address add;  // Composition
}

public class P2 {
    public static void main(String[] args) {
        Person p1 =  new Person();
        p1.name="xyz";
        p1.city="Howrah";
        p1.zip="444444";
        System.out.println(p1.city);


        Office office = new Office();
        office.companyName =  "Masai";
        Address ad1 = new Address();
        ad1.city="Kol";
        ad1.zip="711107";



    }
}



