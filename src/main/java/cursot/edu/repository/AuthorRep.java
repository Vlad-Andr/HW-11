package cursot.edu.repository;

import cursot.edu.models.Author;
import cursot.edu.models.Book;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AuthorRep implements AuthorImpl {
    List<Author> authors = new ArrayList<>();

    @Override
    public void addNewAuthor(Author author) {
        authors.add(author);
    }

    @Override
    public void deleteAuthor(int idDeletedAuthor) {
        authors.removeIf(t->t.getIdAuthor()==idDeletedAuthor);
    }

    @Override
    public void addBookToAuthor(int idAuthor, Book book) {
        authors.get(idAuthor).addNewBook(book);
    }

    @Override
    public List<Author> getAllAuthors() {
        return authors;
    }

    @Override
    public Author updateAuthor(int idAuthorForUpd, Author author) {
        Author author1 = new Author();
        for(Author a : authors){
            if (a.getIdAuthor()==idAuthorForUpd){
                author1=a;
            }
        }
        author1.setFullName(author.getFullName());
        author1.setLastName(author.getLastName());
        authors.add(idAuthorForUpd,author1);
        return author1;
    }
}