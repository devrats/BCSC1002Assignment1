/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private final boolean defaultBookAvailiblity = false;

    private String nameOfBook;
    private String authorOfBook;
    private String bookISBNCode;
    private boolean isBookAvailable;

    /**
     * Set the name of the book and name of the author of the book.
     *
     * @param nameOfBook      Name of the Book.
     * @param authorOfBook    Name of the author of the respective book.
     * @param isBookAvailable Availiblity of book.
     */
    public Book(String nameOfBook, String authorOfBook, boolean isBookAvailable) {
        this.nameOfBook = nameOfBook;
        this.authorOfBook = authorOfBook;
        this.isBookAvailable = isBookAvailable;
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
        this.isBookAvailable = defaultBookAvailiblity;
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

    /**
     * Return the availability of the book.
     *
     * @return Availability of book in the library.
     */
    public boolean isBookAvailable() {
        return isBookAvailable;
    }

    /**
     * Set the availability of the book.
     *
     * @param bookAvailable Availability of book in the library.
     */
    public void setBookAvailable(boolean bookAvailable) {
        isBookAvailable = bookAvailable;
    }

    /**
     * Return Default the availability of the book.
     *
     * @return Default availability of book in the library.
     */
    public boolean isDefaultBookAvailability() {
        return defaultBookAvailiblity;
    }

    /**
     * Return details of fields of Book.java class in formatted way.
     *
     * @return Formatted String
     */
    public String toString() {
        return String.format(
                "Book Name: %s, Book author name: %s, ISBN cod eof the book: %s, Book availability: %b",
                getNameOfBook(), getAuthorOfBook(), getBookISBNCode(), isBookAvailable()
        );
    }

    /**
     * Return true or false according to objects are equal or not.
     *
     * @param object Object to be matched.
     * @return True or false according to objects are equal or not.
     */
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

    /**
     * Return hash code of all fields.
     *
     * @return Hash code of all fields.
     */
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
    public void addBooktoLibrary(String nameOfBook, String authorOfBook) {
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
        this.isBookAvailable = defaultBookAvailiblity;
    }
}
