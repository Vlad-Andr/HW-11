package cursot.edu.service;

import cursot.edu.models.Book;
import cursot.edu.repository.BookRep;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRep bookRep;

    public void addNewBook(Book book){
        bookRep.addBook(book);
    }
    public void deleteBook(int idDeletedBook){
        bookRep.deleteBook(idDeletedBook);
    }
    public List<Book> getAllBooks(){
        return bookRep.getBooks();
    }
    public void updateBook(int idBookForUpdate, Book book) {
        bookRep.updateBook(idBookForUpdate,book);
    }
    public List<Book> sortedByGenre(String genre) {
        return bookRep.sortedByGenre(genre);
    }
}
