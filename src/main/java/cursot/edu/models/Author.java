package cursot.edu.models;

import lombok.Data;

import java.util.List;
@Data
public class Author {
    private int idAuthor;
    private String fullName;
    private String lastName;
    private List<Book> getBooks;

    public void addNewBook(Book book){
    getBooks.add(book);
}
}
