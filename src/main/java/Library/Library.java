package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<Book>();

    public void addNovel(String name, int pages, String type) {
        books.add(new Novel(name, pages, type));
    }

    public void addAlbum(String name, int pages, String paper){
        books.add(new Album(name, pages, paper));
    }

    public List<Book> listBooks(){
        return books;
    }

    public void removeBookById(int index){
        books.remove(index);
    }

    public void removeBook(String name) {
        int bookIndex = 0;
        for (Book book: books) {
            if(book.getName().equals(name)) {
                break;
            }
            bookIndex++;
        }

//        indexOf(); does not work
//        int bookIndex = books.indexOf(books.get(2));

        removeBookById(bookIndex);
    }
}
