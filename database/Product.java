package database;

public class Product {
    int id;
    String name;
    String proDesc;
    double price;
    public Product(){
    }

    public Product(int id, String name, String proDesc, double price) {
        this.id = id;
        this.name = name;
        this.proDesc = proDesc;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProDesc() {
        return proDesc;
    }

    public void setProDesc(String proDesc) {
        this.proDesc = proDesc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
