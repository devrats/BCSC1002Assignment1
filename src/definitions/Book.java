/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String nameOfBook;
    private String authorOfTheBook;
    private String bookISBNCode;

    /**
     * Set the name of the book and name of the author of the book.
     *
     * @param nameOfBook      Name of the Book.
     * @param authorOfTheBook Name of the author of the respective book.
     */
    public Book(String nameOfBook, String authorOfTheBook) {
        this.nameOfBook = nameOfBook;
        this.authorOfTheBook = authorOfTheBook;
    }

    /**
     * Set the ISBN code of the book.
     *
     * @param bookISBNCode ISBN code of the book.
     */
    public Book(String bookISBNCode) {
        if (bookISBNCode.length() == 13) {
            this.bookISBNCode = bookISBNCode;
        } else {
            System.out.println("Please enter correct ISBN code");
        }
    }

    /**
     * Initialise all fields with default value.
     */
    public Book() {
        this.nameOfBook = "NOT AVAILABLE";
        this.authorOfTheBook = "NOT AVAILABLE";
        this.bookISBNCode = "NOT AVAILABLE";
    }
}
