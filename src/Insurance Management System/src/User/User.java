package User;
import java.util.ArrayList;
import java.util.Date;

import Address.Address;

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String job;
    private int age;
    private static ArrayList<Address> addressList= new ArrayList<>();
    private Date lastAccessDate;

    
    public User(String name, String surname, String email, String password, String job, int age, Date lastAccessDate) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.lastAccessDate = lastAccessDate;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static ArrayList<Address> getAddressList() {
        return addressList;
    }
    public static void setAddressList(ArrayList<Address> addressList) {
        User.addressList = addressList;
    }
    public Date getLastAccessDate() {
        return lastAccessDate;
    }
    public void setLastAccessDate(Date lastAccessDate) {
        this.lastAccessDate = lastAccessDate;
    }
    
}
