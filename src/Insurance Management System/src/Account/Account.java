package Account;

import java.util.ArrayList;

import User.User;

public abstract class Account {
    private User user;
    private AuthenticationStatus status;
    private static ArrayList<Individual> individualList;
    
    
    
    public Account(User user) {
        this.user = user;
    }



    public static final void showUserInfo(){
        
    }

    public abstract void addPolicy();



    public User getUser() {
        return user;
    }



    public void setUser(User user) {
        this.user = user;
    }

    
}
