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

    /**
     * Returns details of all books issued by particular student.
     *
     * @return Details of all books issued by particular student.
     */
    public Book[] getAllBooksIssuedByStudent() {
        return allBooksIssuedByStudent;
    }

    /**
     * Sets details of all books issued by particular student.
     *
     * @param allBooksIssuedByStudent Details of books issued by particular student.
     */
    public void setAllBooksIssuedByStudent(Book[] allBooksIssuedByStudent) {
        this.allBooksIssuedByStudent = allBooksIssuedByStudent;
    }

    /**
     * Return total number of books issued currently to particular student.
     *
     * @return Total number of books issued currently to particular student.
     */
    public int getNumberOfBooksIssuedByStudent() {
        return numberOfBooksIssuedByStudent;
    }

    /**
     * Set total number of books issued currently to particular student.
     *
     * @param numberOfBooksIssuedByStudent Total number of issued books.
     */
    public void setNumberOfBooksIssuedByStudent(int numberOfBooksIssuedByStudent) {
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
    }

    /**
     * Return roll number of the particular student.
     *
     * @return Roll number of the particular student.
     */
    public long getRollNumberOfStudent() {
        return rollNumberOfStudent;
    }

    /**
     * Set roll number of the particular student.
     *
     * @param rollNumberOfStudent Roll number of particular student.
     */
    public void setRollNumberOfStudent(long rollNumberOfStudent) {
        this.rollNumberOfStudent = rollNumberOfStudent;
    }

    /**
     * Return the name of the student.
     *
     * @return Name of the student.
     */
    public String getNameOfStudent() {
        return nameOfStudent;
    }

    /**
     * Set the name of the student.
     *
     * @param nameOfStudent Name of the student.
     */
    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    /**
     * Return maximum number of books a student can issue at one time.
     *
     * @return Maximum number of books a student can issue at one time.
     */
    public int getMAXIMUM_NUMBER_OF_BOOKS_CAN_BE_ISSUED() {
        return MAXIMUM_NUMBER_OF_BOOKS_CAN_BE_ISSUED;
    }
}
