import java.util.*;


public class ContactInfo {
    private String age;
    private Name fullName;
    private Address address;
    private Phone phone;

    public ContactInfo(String age, Name fullName, Address address,Phone phone) {
        this.age = age;
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
    }

    public ContactInfo() {
        this.age = "";
        this.fullName = new Name();
        this.address = new Address();
        this.phone = new Phone();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Name getFullName() {
        return fullName;
    }

    public void setFullName(Name fullName) {
        this.fullName = fullName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }



    @Override
    public String toString() {
        return "Full name: " + this.fullName + "\n" + "Age: " + this.age + "\n" + "Address: " + this.address;
    }


}
