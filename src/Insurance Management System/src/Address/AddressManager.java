package Address;
import User.User;

public class AddressManager {
    private static User user;

    public static void addUserAddress(){
        user.getAddressList().add(new Address() {
            
        });
    }

    public static void deleteUserAddress(Address address){
        user.getAddressList().remove(address);

    }
}
