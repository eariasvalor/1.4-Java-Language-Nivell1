package n1exercici1;

public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }
    public void setTitle(){
        this.title = title;
    }

    public String toString(){
        return "Title: " + this.title;
    }
}
