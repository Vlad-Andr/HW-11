package cursot.edu.controllers;

import cursot.edu.models.Book;
import cursot.edu.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("library")
public class BookController {
    private final BookService bookService;

    @PostMapping("book/add")
    public void addNewBook(@RequestBody Book book){
        bookService.addNewBook(book);
    }
    @DeleteMapping("book/delete/{idDeletedBook}")
    public void deleteBook(@PathVariable int idDeletedBook){
        bookService.deleteBook(idDeletedBook);
    }
    @GetMapping("books")
    public List<Book> getAllBooks() {
       return bookService.getAllBooks();
    }
    @PatchMapping("book/update/{idBookForUpdate}")
    public void updateBook(@PathVariable int idBookForUpdate, Book book) {
        bookService.updateBook(idBookForUpdate, book);
    }
    @GetMapping("book/sortbygenre/{genre}")
    public List<Book> sortedByGenre(@PathVariable String genre) {
        return bookService.sortedByGenre(genre);
    }
}
