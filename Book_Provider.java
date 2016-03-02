package entities;

import java.io.Serializable;

/**
 * Created by hannah on 22/11/2015.
 */
public class Book_Provider implements Serializable {
    private int price;
    private int id_Book;
    private int id_Provider;
    private int amount_In_Stock;

    public Book_Provider(int price, int id_Book, int id_Provider, int amount_In_Stock) {
        this.price = price;
        this.id_Book = id_Book;
        this.id_Provider = id_Provider;
        this.amount_In_Stock = amount_In_Stock;
    }

    public Book_Provider() {
        this.price = 0;
        this.id_Book = 0;
        this.id_Provider = 0;
        this.amount_In_Stock = 0;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId_Book() {
        return id_Book;
    }

    public void setId_Book(int id_Book) {
        this.id_Book = id_Book;
    }

    public int getId_Provider() {
        return id_Provider;
    }

    public void setId_Provider(int id_Provider) {
        this.id_Provider = id_Provider;
    }

    public int getAmount_In_Stock() {
        return amount_In_Stock;
    }

    public void setAmount_In_Stock(int amount_In_Stock) {
        this.amount_In_Stock = amount_In_Stock;
    }

    public boolean equals(Object obj)  {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Book_Provider book_provider = (Book_Provider) obj;
        return (id_Provider == book_provider.getId_Provider() && id_Book == book_provider.getId_Book() );
    }
}
