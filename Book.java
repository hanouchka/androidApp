package entities;

import java.io.Serializable;

/**
 * Created by hannah on 22/11/2015.
 */
public class Book implements Serializable {
    private String name;
    private int id_Book;
    private String author;
    private String edition;
    private String release_Date;
    private String notice;
    private Type_Book type_Of_Book;

    public Book(String name, int id_Book, String author, String edition, String release_Date, String summary, Type_Book type_Of_Book) {
        this.name = name;
        this.id_Book = id_Book;
        this.author = author;
        this.edition = edition;
        this.release_Date = release_Date;
        this.notice = summary;
        this.type_Of_Book = type_Of_Book;
    }

    public Book() {
        this.name = null;
        this.id_Book = 0;
        this.author = null;
        this.edition = null;
        this.release_Date = null;
        this.notice = null;
        this.type_Of_Book = Type_Book.novel;
    }

    public Book(String name, String author, String edition) {

        this.name = name;
        this.author = author;
        this.edition = edition;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId_Book() {
        return id_Book;
    }

    public void setId_Book(int id_Book) {
        this.id_Book = id_Book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }


    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public Type_Book getType_Of_Book() {
        return type_Of_Book;
    }

    public void setType_Of_Book(Type_Book type_Of_Book) {
        this.type_Of_Book = type_Of_Book;
    }

    public String getRelease_Date() {
        return release_Date;
    }


    public void setRelease_Date(String release_Date) {
        this.release_Date = release_Date;
    }

    public boolean equals(Object obj)  {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Book book = (Book) obj;
        if(book.getId_Book() == id_Book)                      // for every functions besides for add
            return true;
        return ((name.equals(book.getName())) && (author.equals(book.getAuthor())) && (edition.equals(book.getEdition()))
                && (release_Date.equals(book.getRelease_Date())) && (type_Of_Book == book.getType_Of_Book()) ) ;
    }
}
