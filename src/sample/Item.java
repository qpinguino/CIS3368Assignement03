package sample;

public class Item {
    private String id,title,author,location,type;
    private int quantity;

    public Item(String id, String title, String author, String location, String type, int quantity){
        this.id = id;
        this.title = title;
        this.author = author;
        this.location = location;
        this.type = type;
        this.quantity = quantity;
    }
}
