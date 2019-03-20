package sample.list;

import javafx.scene.Parent;

public class Book {
    private Integer ID;
    private String name;
    private String price;
public Book(){

    }

    public Book(Integer ID, String name, String price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return ID + name +  price+
                '}';
    }
}
