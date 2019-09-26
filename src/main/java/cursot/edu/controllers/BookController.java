package cursot.edu.controllers;

import cursot.edu.models.Book;
import cursot.edu.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("book")
public class BookController {
    private final BookService bookService;

    @PostMapping
    public void addNewBook(@RequestBody Book book){
        bookService.addNewBook(book);
    }
    @DeleteMapping("{idDeletedBook}")
    public void deleteBook(@PathVariable int idDeletedBook){
        bookService.deleteBook(idDeletedBook);
    }
    @GetMapping("books")
    public List<Book> getAllBooks() {
       return bookService.getAllBooks();
    }
    @PatchMapping("{idBookForUpdate}")
    public void updateBook(@PathVariable int idBookForUpdate, Book book) {
        bookService.updateBook(idBookForUpdate, book);
    }
    @GetMapping("sortByGenre/{genre}")
    public List<Book> sortedByGenre(@PathVariable String genre) {
        return bookService.sortedByGenre(genre);
    }
}
