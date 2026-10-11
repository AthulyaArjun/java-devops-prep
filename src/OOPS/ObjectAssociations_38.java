/**
 * Object Associations, Responsibility Assignment & Single Responsibility Principle (SRP)
 * These concepts help us decide how classes should be connected and which class should perform
 * which task.
 *
 * 1. Object Association
 * Definition: An association is a relationship between two classes where objects of one
 * class are connected to objects of another class.
 * For example:
 * - A Library contains a collection of Book objects.
 * - A Library uses an EmailService to send notifications.
 * An association is generally represented by a solid line in UML.
 *
 * 2. Responsibility Assignment
 * Definition: Responsibility assignment means deciding which class should contain a
 * particular attribute or method.
 * A useful guideline is the Information Expert Principle:
 * Assign a responsibility to the class that has the information required to perform it.
 *
 * 3. Single Responsibility Principle (SRP)
 * Definition: A class should have one primary responsibility, or more precisely, one reason to change.
 * For example:
 * - Book changes when book-related information or behaviour changes.
 * - Library changes when book collection management rules change.
 * - EmailService changes when email-sending behaviour changes.
 * This improves maintainability, testing, and separation of concerns.
 */


package OOPS;

import java.util.ArrayList;
import java.util.List;

// Responsibility: Represent a single book
class BookRecord {

    private String title;
    private String author;

    public BookRecord(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

// Responsibility: Send email notifications
class EmailService {

    public void sendEmail(String email, String message) {
        System.out.println("Sending email to: " + email);
        System.out.println("Message: " + message);
    }
}

// Responsibility: Manage the book collection
class BookCatalog {

    private List<BookRecord> books;
    private EmailService emailService;

    public BookCatalog(EmailService emailService) {
        books = new ArrayList<>();
        this.emailService = emailService;
    }

    public void addBook(BookRecord book) {
        books.add(book);
    }

    public int getTotalBooks() {
        return books.size();
    }

    public void displayBooks() {
        for (BookRecord book : books) {
            System.out.println(
                    book.getTitle() + " by " + book.getAuthor()
            );
        }
    }

    public void borrowBook(String title, String email) {

        for (BookRecord book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {

                emailService.sendEmail(
                        email,
                        "You borrowed: " + book.getTitle()
                );

                return;
            }
        }

        System.out.println("Book not found!");
    }
}

// Main class
public class ObjectAssociations_38 {

    public static void main(String[] args) {

        EmailService emailService = new EmailService();

        BookCatalog catalog = new BookCatalog(emailService);

        BookRecord book1 =
                new BookRecord("Effective Java", "Joshua Bloch");

        BookRecord book2 =
                new BookRecord("Clean Code", "Robert C. Martin");

        catalog.addBook(book1);
        catalog.addBook(book2);

        System.out.println("Total books: "
                + catalog.getTotalBooks());

        catalog.displayBooks();

        catalog.borrowBook(
                "Effective Java",
                "student@example.com"
        );
    }
}
