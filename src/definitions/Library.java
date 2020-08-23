/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private final int CAPACITY_OF_LIBRARY = 100;

    private Book[] booksCurrentlyAvailableInLibrary;

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


}
