/*  Created by IntelliJ IDEA.
 *  User: Devvrat Sharma
 *  Date: 23/08/20
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
    private static final int SET_ISBN = 4;
    private static final boolean IS_LIBRARY_CONTINUES_WORK = true;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int clientInput;
        Library library = new Library();
        label:
        while (IS_LIBRARY_CONTINUES_WORK) {
            System.out.println("You are a librarian or a student: ");
            if (input.nextLine().equalsIgnoreCase("librarian")) {
                System.out.println("-=-=-=-=Welcome To Front End Desk=-=-=-=-");
                System.out.println("How may I help today?");
                System.out.println("1. Add a book: ");
                System.out.println("2. Remove a book: ");
                System.out.println("3. Show me all books: ");
                System.out.println("4. Set ISBN code of a book: ");
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
                    case SET_ISBN -> {
                        System.out.println("Enter the name of the Book you want to set ISBN: ");
                        input.nextLine();
                        String bookName = input.nextLine();
                        System.out.println("Enter the author of the " + bookName);
                        String authorName = input.nextLine();
                        input.nextLine();
                        String bookISBNCode = input.nextLine();
                        library.setBookISBNCode(bookName, authorName, bookISBNCode);
                    }
                    case SHOW_ALL_BOOK -> library.listLibrary();
                    case EXIT -> {
                        System.out.println("Successfully Exit");
                        break label;
                    }
                    default -> System.out.println("WRONG CHOICE");
                }
            } else if (input.nextLine().equalsIgnoreCase("student")) {
                Student student = new Student();
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
                    case EXIT -> {
                        System.out.println("Successfully Exit");
                        break label;
                    }
                    default -> System.out.println("WRONG CHOICE");
                }
            } else {
                System.out.println("WRONG INPUT");
            }
        }
    }

}
