package entities;

import java.io.Serializable;

/**
 * Created by hannah on 22/11/2015.
 */
public class Provider extends Member implements Serializable {

    private String lastName;
    private String firstName;
    private int id_Provider;
    private String phone_Number;
    private String email;
    private String password;
    //store address
    private String street;
    private String city;
    private String zipCode;
    private String nameShop;

    /*public Provider(Client client)
    {
        this.setCity(client.getCity());
        this.setZipCode(client.getZipCode());
        this.setStreet(client.getStreet());
        this.setPassword(client.getPassword());
        this.setEmail(client.getMail_Client());
        this.setPhone_Number(client.getPhone_Client());
        this.setFirstName(client.getFirstName());
        this.setLastName(client.getLastName());
    }
    */

    public Provider() {
        this.setCity(null);
        this.setZipCode(null);
        this.setStreet(null);
        this.setPassword(null);
        this.setEmail(null);
        this.setPhone_Number(null);
        this.setId_Provider(0);
        this.setFirstName(null);
        this.setLastName(null);
        this.setNameShop(null);
    }
    public Provider(String city, String zipCode, String street, String password, String email, String phone_Number, int id_Provider, String firstName, String lastName,String nameShop) {
        this.setCity(city);
        this.setZipCode(zipCode);
        this.setStreet(street);
        this.setPassword(password);
        this.setEmail(email);
        this.setPhone_Number(phone_Number);
        this.setId_Provider(id_Provider);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setNameShop(nameShop);

    }

    public Provider(Provider p) {
        this.setCity(p.getCity());
        this.setZipCode(p.getZipCode());
        this.setStreet(p.getStreet());
        this.setPassword(p.getPassword());
        this.setEmail(p.getEmail());
        this.setPhone_Number(p.getPhone_Number());
        this.setId_Provider(p.getId_Provider());
        this.setFirstName(p.getFirstName());
        this.setLastName(p.getLastName());
        this.setNameShop(p.getNameShop());
    }




    public boolean equals(Object obj)  {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Provider provider = (Provider) obj;
        if (getId_Provider() == provider.getId_Provider())
            return true;
        return  ((firstName.equals(provider.getFirstName())) && (lastName.equals(provider.getLastName())) &&
                (getPhone_Number().equals(provider.getPhone_Number())) && (getEmail().equals(provider.getEmail())) &&
                getCity().equals(provider.getCity()) && getStreet().equals(provider.getStreet()) && getZipCode().equals(provider.getZipCode()));
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

    public int getId_Provider() {
        return id_Provider;
    }

    public void setId_Provider(int id_Provider) {
        this.id_Provider = id_Provider;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
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

    public String getNameShop() {
        return nameShop;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }
}