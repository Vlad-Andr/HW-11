package cursot.edu.controllers;

import cursot.edu.models.Author;
import cursot.edu.models.Book;
import cursot.edu.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("author")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    public void addNewAuthor(@RequestBody Author author){
        authorService.addNewAuthor(author);
    }
    @DeleteMapping("idAuthorToBeDeleted}")
    public void deleteAuthor(@PathVariable int idAuthorToBeDeleted){
        authorService.deleteAuthor(idAuthorToBeDeleted);
    }
    @PostMapping("bookToAuthor/{idAuthor}")
    public void addNewBookToAuthor(@PathVariable int idAuthor,@RequestBody Book book){
        authorService.addNewBookToAuthor(idAuthor, book);
    }
    @GetMapping("authors")
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }
    @PutMapping("{idAuthorForUpd")
    public void updateAuthor(@PathVariable int idAuthorForUpd, Author author) {
        authorService.updateAuthor(idAuthorForUpd, author);
    }
}