package P0054.Model;

import java.util.concurrent.atomic.AtomicInteger;

public class ContactData {

    private static final AtomicInteger AUTOINC = new AtomicInteger(0);
    private int Id;
    private String fullName;
    private String group;
    private String address;
    private String phone;
    private String lastName;
    private String firstName;

    public ContactData() {
    }

    public ContactData(String fullName, String group, String address, String phone, String lastName, String firstName) {
        this.Id = AUTOINC.incrementAndGet();
        this.fullName = fullName;
        this.group = group;
        this.address = address;
        this.phone = phone;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return Id + "\t" + fullName + "\t" + firstName + "\t\t" + lastName + "   \t" + group + "\t" + address + "\t" + phone;
    }

}
