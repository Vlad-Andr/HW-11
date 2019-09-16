package cursot.edu.service;

import cursot.edu.models.Author;
import cursot.edu.models.Book;
import cursot.edu.repository.AuthorRep;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorRep authorRep;

    public void addNewAuthor(Author author){
        authorRep.addNewAuthor(author);
    }
    public void deleteAuthor(int idDeletedAuthor){
        authorRep.deleteAuthor(idDeletedAuthor);
    }
    public void addNewBookToAuthor(int idAuthor, Book book){
        authorRep.addBookToAuthor(idAuthor, book);
    }
    public List<Author> getAllAuthors(){
        return authorRep.getAllAuthors();
    }
    public void updateAuthor(int idAuthorForUpd, Author author) { authorRep.updateAuthor(idAuthorForUpd, author);
    }
}
