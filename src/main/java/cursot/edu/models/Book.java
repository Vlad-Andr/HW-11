package cursot.edu.models;

import lombok.Data;

@Data
public class Book {
    private int idBook;
    private String title;
    private String bookGenre;
    private String description;
    private double rate;
}
