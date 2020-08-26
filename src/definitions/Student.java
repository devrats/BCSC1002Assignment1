/*  Created by IntelliJ IDEA.
 *  User: Devvrat Sharma
 *  Date: 23/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private final int MAXIMUM_NUMBER_OF_BOOKS_CAN_BE_ISSUED = 2;

    private static int initialNumberOfBookIssued = 0;
    private String nameOfStudent;
    private long rollNumberOfStudent;
    private int numberOfBooksIssuedByStudent;
    private Book[] allBooksIssuedByStudent;

    public Student(String nameOfStudent, long rollNumberOfStudent, int numberOfBooksIssuedByStudent, Book[] allBooksIssuedByStudent) {
        this.nameOfStudent = nameOfStudent;
        this.rollNumberOfStudent = rollNumberOfStudent;
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
        this.allBooksIssuedByStudent = allBooksIssuedByStudent;
    }

    public Student() {
        this.nameOfStudent = "NOT AVAILABLE";
        allBooksIssuedByStudent = new Book[MAXIMUM_NUMBER_OF_BOOKS_CAN_BE_ISSUED];
        for (int index = 0; index < allBooksIssuedByStudent.length; index++) {
            allBooksIssuedByStudent[index] = new Book();
        }
        numberOfBooksIssuedByStudent = 0;
    }

    public Student(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
        allBooksIssuedByStudent = new Book[MAXIMUM_NUMBER_OF_BOOKS_CAN_BE_ISSUED];
        for (int index = 0; index < allBooksIssuedByStudent.length; index++) {
            allBooksIssuedByStudent[index] = new Book();
        }
    }

    public Book[] getAllBooksIssuedByStudent() {
        return allBooksIssuedByStudent.clone();
    }

    public void setAllBooksIssuedByStudent(Book[] allBooksIssuedByStudent) {
        this.allBooksIssuedByStudent = allBooksIssuedByStudent;
    }

    public int getNumberOfBooksIssuedByStudent() {
        return numberOfBooksIssuedByStudent;
    }

    public void setNumberOfBooksIssuedByStudent(int numberOfBooksIssuedByStudent) {
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
    }


    public long getRollNumberOfStudent() {
        return rollNumberOfStudent;
    }

    public void setRollNumberOfStudent(long rollNumberOfStudent) {
        this.rollNumberOfStudent = rollNumberOfStudent;
    }


    public String getNameOfStudent() {
        return nameOfStudent;
    }


    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public int getMaximumNumberOfBooksCanBeIssued() {
        return MAXIMUM_NUMBER_OF_BOOKS_CAN_BE_ISSUED;
    }


    public static int getInitialNumberOfBookIssued() {
        return initialNumberOfBookIssued;
    }

    public String toString() {
        return String.format(
                "Student Name: %s, Student Roll no: %d, Total number of issued books: %d, Details of all books: %s",
                getNameOfStudent(), getRollNumberOfStudent(), getNumberOfBooksIssuedByStudent(), Arrays.toString(allBooksIssuedByStudent)
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
        Student student = (Student) object;
        return this.getRollNumberOfStudent() == student.getRollNumberOfStudent() &&
                this.getNumberOfBooksIssuedByStudent() == student.getNumberOfBooksIssuedByStudent() &&
                Objects.equals(this.getNameOfStudent(), student.getNameOfStudent()) &&
                Arrays.equals(this.getAllBooksIssuedByStudent(), student.getAllBooksIssuedByStudent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfStudent(), getRollNumberOfStudent(), getNumberOfBooksIssuedByStudent(), getAllBooksIssuedByStudent(), getMaximumNumberOfBooksCanBeIssued());
    }

    /**
     * Issue a book from the library.
     *
     * @param nameOfBook   Name of the Book.
     * @param authorOfBook Name of the author of the respective book.
     * @param object       Object of library.
     */
    public void doIssue(String nameOfBook, String authorOfBook, Library object) {
        for (Book book : allBooksIssuedByStudent) {
            if (numberOfBooksIssuedByStudent < MAXIMUM_NUMBER_OF_BOOKS_CAN_BE_ISSUED) {
                if (book.getNameOfBook().equals("NOT AVAILABLE")) {
                    object.doIssue(nameOfBook, authorOfBook);
                    book.doIssue();
                    book.addBookToLibrary(nameOfBook, authorOfBook);
                    numberOfBooksIssuedByStudent++;
                    break;
                }
            }
        }
        if (numberOfBooksIssuedByStudent >= MAXIMUM_NUMBER_OF_BOOKS_CAN_BE_ISSUED) {
            System.out.println("you have already has 2 book issued so you can't issue more.");
        }
    }

    /**
     * Return a book from the library.
     *
     * @param nameOfBook   Name of the Book.
     * @param authorOfBook Name of the author of the respective book.
     * @param object       Object of library.
     */
    public void doReturn(String nameOfBook, String authorOfBook, Library object) {
        boolean isreturnDone = false;
        for (Book book : allBooksIssuedByStudent) {
            if (book.getNameOfBook().equalsIgnoreCase(nameOfBook) && book.getAuthorOfBook().equalsIgnoreCase(authorOfBook) && !book.isBookAvailable()) {
                book.doReturn();
                object.doReturn(nameOfBook, authorOfBook);
                book.removeBookFromLibrary();
                numberOfBooksIssuedByStudent--;
                isreturnDone = true;
                break;
            }
        }
        if (!isreturnDone) {
            System.out.println("SORRY NO SUCH BOOK AVAILABLE");
        } else if (isreturnDone) {
            System.out.println("Thank you for Returning, " + nameOfBook + ".");
        }
    }

    /**
     * This method shows a list of all the books issued to student.
     */
    public void listBooksIssuedToStudent() {
        for (Book book : allBooksIssuedByStudent) {
            System.out.println(book);
        }
    }
}
