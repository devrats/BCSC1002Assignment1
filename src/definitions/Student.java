/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private final int MAXIMUM_NUMBER_OF_BOOKS_CAN_BE_ISSUED = 6;

    private String nameOfStudent;
    private long rollNumberOfStudent;
    private int numberOfBooksIssuedByStudent;
    private Book[] allBooksIssuedByStudent;

    /**
     * Sets all fields with given values.
     *
     * @param nameOfStudent                Name of the student.
     * @param rollNumberOfStudent          Roll number of the respective student.
     * @param numberOfBooksIssuedByStudent Total number of books issued by particular Student.
     * @param allBooksIssuedByStudent      Details of all the books issued by particular student.
     */
    public Student(String nameOfStudent, long rollNumberOfStudent, int numberOfBooksIssuedByStudent, Book[] allBooksIssuedByStudent) {
        this.nameOfStudent = nameOfStudent;
        this.rollNumberOfStudent = rollNumberOfStudent;
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
        this.allBooksIssuedByStudent = allBooksIssuedByStudent;
    }

    /**
     * Set name of the student to default and initialise array with default Book constructor.
     */
    public Student() {
        this.nameOfStudent = "NOT AVAILABLE";
        allBooksIssuedByStudent = new Book[MAXIMUM_NUMBER_OF_BOOKS_CAN_BE_ISSUED];
        for (int index = 0; index < allBooksIssuedByStudent.length; index++) {
            allBooksIssuedByStudent[index] = new Book();
        }
    }

    /**
     * Set name of the student to given value and initialise array with default Book constructor.
     *
     * @param nameOfStudent Name of the student.
     */
    public Student(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
        allBooksIssuedByStudent = new Book[MAXIMUM_NUMBER_OF_BOOKS_CAN_BE_ISSUED];
        for (int index = 0; index < allBooksIssuedByStudent.length; index++) {
            allBooksIssuedByStudent[index] = new Book();
        }
    }
}
