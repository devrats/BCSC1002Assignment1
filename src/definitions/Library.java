/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Library {
    private final int CAPACITY_OF_LIBRARY = 100;

    private Book[] booksCurrentlyAvailableInLibrary;
    private static int numberOfBookPresentInLibrary = 0;

    /**
     * Sets the details of books currently available in library.
     *
     * @param booksCurrentlyAvailableInLibrary Details of books currently available in library.
     */
    public Library(Book[] booksCurrentlyAvailableInLibrary) {
        this.booksCurrentlyAvailableInLibrary = booksCurrentlyAvailableInLibrary;
    }

    /**
     * Initialise details of books with default values.
     */
    public Library() {
        booksCurrentlyAvailableInLibrary = new Book[CAPACITY_OF_LIBRARY];
        for (int index = 0; index < booksCurrentlyAvailableInLibrary.length; index++) {
            booksCurrentlyAvailableInLibrary[index] = new Book();
        }
    }

    /**
     * Return details of books currently available in library.
     *
     * @return Details of books currently available in library.
     */
    public Book[] getBooksCurrentlyAvailableInLibrary() {
        return booksCurrentlyAvailableInLibrary;
    }

    /**
     * Sets the details of books currently available in library.
     *
     * @param booksCurrentlyAvailableInLibrary Details of books currently available in library.
     */
    public void setBooksCurrentlyAvailableInLibrary(Book[] booksCurrentlyAvailableInLibrary) {
        this.booksCurrentlyAvailableInLibrary = booksCurrentlyAvailableInLibrary;
    }

    /**
     * Return total number of books library can accumulate.
     *
     * @return Capacity of library
     */
    public int getCapacityOfLibrary() {
        return CAPACITY_OF_LIBRARY;
    }

    /**
     * Return details of fields of Student.java class in formatted way.
     *
     * @return Formatted String
     */
    public String toString() {
        return String.format(
                "Details of all books currently present in library: %s",
                Arrays.toString(booksCurrentlyAvailableInLibrary)
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
        Library library = (Library) object;
        return Arrays.equals(this.getBooksCurrentlyAvailableInLibrary(), library.getBooksCurrentlyAvailableInLibrary());
    }

    /**
     * Return hash code of all fields.
     *
     * @return Hash code of all fields.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getBooksCurrentlyAvailableInLibrary(), getCapacityOfLibrary());
    }

    /**
     * Add a book to the library.
     *
     * @param nameOfBook   Name of the Book.
     * @param authorOfBook Name of the author of the respective book.
     */
    public void addBookToLibrary(String nameOfBook, String authorOfBook) {
        booksCurrentlyAvailableInLibrary[numberOfBookPresentInLibrary].addBooktoLibrary(nameOfBook, authorOfBook);
        numberOfBookPresentInLibrary++;
        System.out.println("Thank you for adding, " + nameOfBook + ".");
    }

    /**
     * Remove a book from the library.
     *
     * @param nameOfBook   Name of the Book.
     * @param authorOfBook Name of the author of the respective book.
     */
    public void removeBookFromLibrary(String nameOfBook, String authorOfBook) {
        int numberOfBook = 0;
        for (Book book : booksCurrentlyAvailableInLibrary) {
            numberOfBook++;
            if (book.getNameOfBook().equalsIgnoreCase(nameOfBook) && book.getAuthorOfBook().equalsIgnoreCase(authorOfBook)) {
                book.removeBookFromLibrary();
                System.out.println("Thank you for removing, " + nameOfBook + ".");
                break;
            }
        }
        if (numberOfBook == booksCurrentlyAvailableInLibrary.length) {
            System.out.println("SORRY NO SUCH BOOK AVAILABLE");
        }
    }

    /**
     * This method shows a list of all the books in our library.
     */
    public void listLibrary() {
        for (Book book : booksCurrentlyAvailableInLibrary) {
            System.out.println(book);
        }
    }
}
