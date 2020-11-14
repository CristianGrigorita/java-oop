package Library;

//Create a small application that mimics a library catalog.
// It needs to be able to add books, delete books and list books. Books are of two kinds: novels and art albums.
// They both have names and number of pages. Novels have type (like mystery, sf, etc.) while albums have paper quality.


import java.util.ArrayList;
import java.util.List;

public class Book extends Library{
    private String name;
    private int pages;

    public Book(String name, int pages){
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public int getPages(){
        return pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name: " + name + '\'' +
                "pages: " + pages + '\'' +
                "}";
    }

}
