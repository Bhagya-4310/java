package resturant;

public class Test {
    public static void main(String[] args) {

       /* Address address=new Address();
        address.flatNo="4310";
        address.area="kphb";
        address.houseNo="1234";
        address.pincode="4321";
        address.street="xyz";
        Address address1=new Address();

        User user=new User();
        user.email="bhagi";
        user.mobileNumber="1234";
        user.address= address;

        Resturant resturant=new Resturant();
        resturant.name="teatime";
        resturant.address1=address1;
    } */

    Address address=new Address();
    address.flatNo="4310";
    address.area="kphb";
    address.houseNo="1234";
    address.pincode="4321";
    address.street="xyz";



    User user=new User();
    user.address=address;
    user.email="bhagi";
    user.mobileNumber="1234";

        Address address1=new Address();
        address1.flatNo="1-12";
        address1.area="kphb";
        address1.houseNo="7890";
        address1.pincode="1234";
        address1.street="abc";


    Resturant resturant=new Resturant();
    resturant.name="teatime";
    resturant.address1=address1;

        System.out.println(user);
        System.out.println(resturant);
}


    }
