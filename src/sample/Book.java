package sample;

public class Book extends Item {
    public Book(String id, String title, String author, String location, int quantity){
        super(id,title,author,location,"book",quantity);
    }

}
