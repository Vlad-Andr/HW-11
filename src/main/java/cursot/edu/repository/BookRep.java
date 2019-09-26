package cursot.edu.repository;

import cursot.edu.models.Book;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BookRep implements BookImpl {
    private List<Book> books = new ArrayList<>();

    @Override
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public void deleteBook(int  idDeletedBook) {
        books.removeIf(t->t.getIdBook()==idDeletedBook);
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void updateBook(int idBookForUpdate, Book book) {
            Book book1 = new Book();
            for(Book b : books){
                if (b.getIdBook()==(idBookForUpdate)){
                    book1=b;
                }
            }
            book1.setBookGenre(book.getBookGenre());
            book1.setDescription(book.getDescription());
            book1.setTitle(book.getTitle());
            books.add(idBookForUpdate,book1);
        }

    @Override
    public List<Book> sortedByGenre(String genre) {
        return books.stream().filter(t->t.getBookGenre().equals(genre)).collect(Collectors.toList());
    }
}

