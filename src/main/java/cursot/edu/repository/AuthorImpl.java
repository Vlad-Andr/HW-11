package cursot.edu.repository;

import cursot.edu.models.Author;
import cursot.edu.models.Book;

import java.util.List;

public interface AuthorImpl {
    void addNewAuthor(Author author);
    void deleteAuthor(int idDeletedBook);
    void addBookToAuthor(int idAuthor, Book book);
    List<Author> getAllAuthors();
    Author updateAuthor(int idAuthorForUpd,Author author);
}
