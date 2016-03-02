package entities;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by hannah on 22/11/2015.
 */
public class Order implements Serializable {
    private int id_Order;
    private int id_Book;
    private int id_Client;
    private int id_Provider;
    private Date date;
    private float price;
    private int quantity;
    private boolean picked_Up;

    public Order() {
        this.id_Order = 0;
        this.id_Book = 0;
        this.id_Client = 0;
        this.id_Provider = 0;
        this.date = null;
        this.price = 0;
        this.quantity = 1;
        setPicked_Up(false);
    }


    public Order(int id_Order, int id_Book, int id_Client, int id_Provider, Date date, float price,int quantity) {
        this.id_Order = id_Order;
        this.id_Book = id_Book;
        this.id_Client = id_Client;
        this.id_Provider = id_Provider;
        this.date = date;
        this.price = price;
        this.quantity = quantity;
    }


    public int getId_Order() {

        return id_Order;

    }

    public void setId_Order(int id_Order) {

        this.id_Order = id_Order;

    }

    public int getId_Book() {

        return id_Book;

    }

    public void setId_Book(int id_Book) {

        this.id_Book = id_Book;

    }

    public int getId_Client() {

        return id_Client;

    }

    public void setId_Client(int id_Client) {

        this.id_Client = id_Client;

    }

    public int getId_Provider() {
        return id_Provider;
    }

    public void setId_Provider(int id_Provider) {
        this.id_Provider = id_Provider;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean equals(Object obj)  {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Order order = (Order) obj;
        return (id_Order == order.getId_Order());
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isPicked_Up() {
        return picked_Up;
    }

    public void setPicked_Up(boolean picked_Up) {
        this.picked_Up = picked_Up;
    }
}
