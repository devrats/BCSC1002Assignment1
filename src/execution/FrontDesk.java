/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {

    private static final int SHOW_ALL_BOOK = 3;
    private static final int ISSUE_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int EXIT = 0;
    private static final int ADD_BOOK = 1;
    private static final int REMOVE_BOOK = 2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int clientInput;
        Library library = new Library();
        System.out.println("You are a librarian or a student: ");
        if (input.nextLine().equalsIgnoreCase("librarian")) {
            do {
                System.out.println("-=-=-=-=Welcome To Front End Desk=-=-=-=-");
                System.out.println("How may I help today?");
                System.out.println("1. Add a book: ");
                System.out.println("2. Remove a book: ");
                System.out.println("3. Show me all books: ");
                System.out.println("0. Exit: ");
                System.out.println("Enter your choice (0..3): ");
                clientInput = input.nextInt();
                switch (clientInput) {
                    case ADD_BOOK -> {
                        System.out.println("Enter the name of the Book you want to add: ");
                        input.nextLine();
                        String bookName = input.nextLine();
                        System.out.println("Enter the author of the " + bookName);
                        String authorName = input.nextLine();
                        library.addBookToLibrary(bookName, authorName);
                    }
                    case REMOVE_BOOK -> {
                        System.out.println("Enter the name of the Book you want to remove: ");
                        input.nextLine();
                        String bookName = input.nextLine();
                        System.out.println("Enter the author of the " + bookName);
                        String authorName = input.nextLine();
                        library.removeBookFromLibrary(bookName, authorName);
                    }
                    case SHOW_ALL_BOOK -> library.listLibrary();
                    default -> System.out.println("WRONG CHOICE");
                }
            } while (clientInput != EXIT);
        } else if (input.nextLine().equalsIgnoreCase("student")) {
            Student student = new Student();
            do {
                System.out.println("-=-=-=-=Welcome To Front End Desk=-=-=-=-");
                System.out.println("How may I help today?");
                System.out.println("1. Issue a new book for me: ");
                System.out.println("2. Return a previously issued book for me: ");
                System.out.println("3. Show me all my issued books: ");
                System.out.println("0. Exit: ");
                System.out.println("Enter your choice (0..3): ");
                clientInput = input.nextInt();
                switch (clientInput) {
                    case ISSUE_BOOK -> {
                        System.out.println("Enter the name of the Book you want to issue: ");
                        input.nextLine();
                        String bookName = input.nextLine();
                        System.out.println("Enter the author of the " + bookName);
                        String authorName = input.nextLine();
                        student.doIssue(bookName, authorName, library);
                    }
                    case RETURN_BOOK -> {
                        System.out.println("Enter the name of the Book you want to return: ");
                        input.nextLine();
                        String bookName = input.nextLine();
                        System.out.println("Enter the author of the " + bookName);
                        String authorName = input.nextLine();
                        student.doReturn(bookName, authorName, library);
                    }
                    case SHOW_ALL_BOOK -> student.listBooksIssuedToStudent();
                    default -> System.out.println("WRONG CHOICE");
                }
            } while (clientInput != EXIT);
        } else {
            System.out.println("WRONG INPUT");
        }
    }

}
