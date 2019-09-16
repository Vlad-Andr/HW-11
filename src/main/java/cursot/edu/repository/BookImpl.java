package cursot.edu.repository;

import cursot.edu.models.Book;

import java.util.List;

public interface BookImpl {
    List<Book> getBooks();
    void deleteBook(int idDeletedBook);
    void addBook(Book book);
    void updateBook(int idBookForUpdate, Book book);
    List<Book> sortedByGenre(String genre);
}
