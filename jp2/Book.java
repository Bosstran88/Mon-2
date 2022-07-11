package jp2;

public class Book {
    private int BookID;
    private String BookName;
    private String Author;
    private double Price;

    public Book(){}

    public Book(int bookID, String bookName, String author, double price) {
        BookID = bookID;
        BookName = bookName;
        Author = author;
        Price = price;
    }

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int bookID) {
        BookID = bookID;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookID=" + BookID +
                ", BookName='" + BookName + '\'' +
                ", Author='" + Author + '\'' +
                ", Price=" + Price +
                '}';
    }
}
