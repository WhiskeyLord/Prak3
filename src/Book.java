import java.util.Set;

public class Book {
    private String author, name, genre;
    private int date;
    private boolean hasSequel = false;
    Book(String author, String name, String genre, int date){
        this.author = author;
        this.name = name;
        this.genre= genre;
        this.date = date;
    }
    public void SetChange(){
        this.hasSequel = true;
    }
    public String GetInfo(){
        return ("\nauthor: "+ author+
                "\nname: "+ name+
                "\ngenre: "+ genre +
                "\ndate: " +date+
                "\nhas a sequel: " + hasSequel
        );
    }
}
