package entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by hannah on 22/11/2015.
 */
public class Client extends Member implements Serializable {

    private String lastName;
    private String firstName;
    private int id_Client;
    private String phone_Client;
    private String mail_Client;
    private String password;
    //Personnal address
    private String street;
    private String city;
    private String zipCode;

    public Client(String lastName , String firstName, int id_Client, String phone_Client,
                  String mail_Client ,
                  String password, String street, String city, String zipCode) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id_Client = id_Client;
        this.phone_Client = phone_Client;
        this.mail_Client = mail_Client;
        this.password = password;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }
    public Client() {
        this.lastName = null;
        this.firstName = null;
        this.id_Client = 0;
        this.phone_Client = null;
        this.mail_Client = null;
        this.password = null;
        this.street = null;
        this.city = null;
        this.zipCode = null;
    }

    public Client(Client c) {
        this.lastName = c.getLastName();
        this.firstName = c.getFirstName();
        this.id_Client = c.getId_Client();
        this.phone_Client = c.getPhone_Client();
        this.mail_Client = c.getMail_Client();
        this.password = c.getPassword();
        this.street = c.getStreet();
        this.city = c.getCity();
        this.zipCode = c.getZipCode();
    }

    public String getName() {
        return lastName;
    }

    public void setName(String lastName) {
        this.lastName = lastName;
    }

    public int getId_Client() {
        return id_Client;
    }

    public void setId_Client(int id_Client) {
        this.id_Client = id_Client;
    }

    public String getPhone_Client() {
        return phone_Client;
    }

    public void setPhone_Client(String phone_Client) {
        this.phone_Client = phone_Client;
    }

    public String getMail_Client() {
        return mail_Client;
    }

    public void setMail_Client(String mail_Client) {
        this.mail_Client = mail_Client;
    }


    public boolean equals(Object obj)  {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Client client = (Client) obj;
        return (id_Client == client.getId_Client());
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
