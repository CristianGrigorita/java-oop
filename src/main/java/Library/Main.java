package Library;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addNovel("Game Of Thrones", 500, "Fantasy");
        library.addAlbum("Nice pictures", 120, "Glossy");
        library.addNovel("Head First Java", 723, "Fantasy");
        library.addAlbum("Jean Michel Basquiat drawings", 104, "Normal");
        library.addNovel("Fundation", 255, "SF");
        library.addNovel("Ender's Game", 324, "SF");
        library.addAlbum("Medieval paintings", 80, "Glossy");

        library.removeBookById(1);
        library.removeBook("Fundation");
        library.removeBook("Medieval paintings");

        List<Book> bookList = library.listBooks();
        System.out.println(bookList);
    }
}
