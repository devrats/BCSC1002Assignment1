/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String nameOfBook;
    private String authorOfBook;
    private String bookISBNCode;

    /**
     * Set the name of the book and name of the author of the book.
     *
     * @param nameOfBook   Name of the Book.
     * @param authorOfBook Name of the author of the respective book.
     */
    public Book(String nameOfBook, String authorOfBook) {
        this.nameOfBook = nameOfBook;
        this.authorOfBook = authorOfBook;
    }

    /**
     * Set the ISBN code of the respective book.
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
        this.authorOfBook = "NOT AVAILABLE";
        this.bookISBNCode = "NOT AVAILABLE";
    }

    /**
     * Return the name of the author of the respective book.
     *
     * @return Name of the author of the respective book.
     */
    public String getAuthorOfBook() {
        return authorOfBook;
    }

    /**
     * Set the name of the author of the book.
     *
     * @param authorOfBook Name of the author of the respective book.
     */
    public void setAuthorOfBook(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    /**
     * Return the name of the book.
     *
     * @return Name of the book.
     */
    public String getBookISBNCode() {
        return bookISBNCode;
    }

    /**
     * Set the ISBN code of the respective book.
     *
     * @param bookISBNCode ISBN code of the book.
     */
    public void setBookISBNCode(String bookISBNCode) {
        if (bookISBNCode.length() == 13) {
            this.bookISBNCode = bookISBNCode;
        } else {
            System.out.println("Please enter correct ISBN code");
        }
    }

    /**
     * Return the ISBN code of the respective book.
     *
     * @return ISBN code of the respective book.
     */
    public String getNameOfBook() {
        return nameOfBook;
    }

    /**
     * Set the name of the book.
     *
     * @param nameOfBook Name of the book.
     */
    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }
}
