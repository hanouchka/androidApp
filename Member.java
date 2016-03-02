package entities;

/**
 * Created by hannah on 30/11/2015.
 */
public class Member {
    private String lastName;
    private String firstName;
    private int id;
    private String phone;
    private String mail;
    //private address
    private String street;
    private String city;
    private String zipCode;

    public  Member(String lastName,String firstName,int id,String phone,String mail,String street,
                   String city,String zipcode)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
        this.phone = phone;
        this.mail = mail;
        this.street = street;
        this.city = city;
        this.zipCode = zipcode;

    }
    public Member()
    {
        this.lastName = "";
        this.firstName = "";
        this.id = 0;
        this.phone = "";
        this.street = "";
        this.city = "";
        this.zipCode = "";
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
