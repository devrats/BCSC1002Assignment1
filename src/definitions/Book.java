/*  Created by IntelliJ IDEA.
 *  User: Devvrat Sharma
 *  Date: 23/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private final boolean defaultBookAvailability = true;

    private String nameOfBook;
    private String authorOfBook;
    private String bookISBNCode;
    private boolean isBookAvailable;

    public Book(String nameOfBook, String authorOfBook) {
        this.nameOfBook = nameOfBook;
        this.authorOfBook = authorOfBook;
    }

    public Book(String bookISBNCode) {
        if (bookISBNCode.length() == 13) {
            this.bookISBNCode = bookISBNCode;
        } else {
            System.out.println("Please enter correct ISBN code");
        }
    }

    public Book() {
        this.nameOfBook = "NOT AVAILABLE";
        this.authorOfBook = "NOT AVAILABLE";
        this.bookISBNCode = "NOT AVAILABLE";
        this.isBookAvailable = defaultBookAvailability;
    }

    public String getAuthorOfBook() {
        return authorOfBook;
    }

    public void setAuthorOfBook(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    public String getBookISBNCode() {
        return bookISBNCode;
    }

    public void setBookISBNCode(String bookISBNCode) {
        if (bookISBNCode.length() == 13) {
            this.bookISBNCode = bookISBNCode;
        } else {
            System.out.println("Please enter correct ISBN code");
        }
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public boolean isBookAvailable() {
        return isBookAvailable;
    }

    public void setBookAvailable(boolean bookAvailable) {
        isBookAvailable = bookAvailable;
    }

    public boolean isDefaultBookAvailability() {
        return defaultBookAvailability;
    }

    public String toString() {
        return String.format(
                "Book Name: %s, Book author name: %s, ISBN code of the book: %s, Book availability: %b",
                getNameOfBook(), getAuthorOfBook(), getBookISBNCode(), isBookAvailable()
        );
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Book book = (Book) object;
        return Objects.equals(this.getNameOfBook(), book.getNameOfBook()) &&
                Objects.equals(this.getNameOfBook(), book.getNameOfBook()) &&
                Objects.equals(this.getAuthorOfBook(), book.getAuthorOfBook()) &&
                this.isBookAvailable() == book.isBookAvailable();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfBook(), getAuthorOfBook(), getBookISBNCode(), isBookAvailable(), isDefaultBookAvailability());
    }

    /**
     * Set name of the book and name of the author of the book.
     *
     * @param nameOfBook   Name of the Book.
     * @param authorOfBook Name of the author of the respective book.
     */
    public void addBookToLibrary(String nameOfBook, String authorOfBook) {
        setNameOfBook(nameOfBook);
        setAuthorOfBook(authorOfBook);
    }

    /**
     * Set all fields to default values.
     */
    public void removeBookFromLibrary() {
        this.nameOfBook = "NOT AVAILABLE";
        this.authorOfBook = "NOT AVAILABLE";
        this.bookISBNCode = "NOT AVAILABLE";
        this.isBookAvailable = defaultBookAvailability;
    }

    /**
     * Issue the Book.
     */
    public void doIssue() {
        if (isBookAvailable) {
            setBookAvailable(false);
        }
    }

    /**
     * Return the Book.
     */
    public void doReturn() {
        if (!isBookAvailable) {
            setBookAvailable(true);
        }
    }
}
