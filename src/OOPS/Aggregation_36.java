/**
"Has-a" with loose ownership

Aggregation is a special form of Association that represents a "whole-part" relationship —
but with weak ownership.
    The whole (container) uses the part (component)
    The part can exist independently
    The part is passed into the whole, not created inside

| Feature         | Aggregation     | Composition              |
| --------------- | --------------- | ------------------------ |
| Coupling        | Loose           | Tight                    |
| Object Lifetime | Independent     | Dependent                |
| Object Creation | Passed in       | Created inside the class |
| Example         | Library → Books | House → Rooms            |

 */

package OOPS;

import java.util.ArrayList;
import java.util.List;

class ListBook {
    private String title;

    public ListBook(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
}

class Library{
    private List<ListBook> books; //Aggregation: Library has a list of books

    public Library(List<ListBook> books){
        this.books = books;
    }

    public void showBooks(){
        System.out.println("Library has the following books");

        for (ListBook b : books){
            System.out.println(b.getTitle());

        }
    }
}
public class Aggregation_36 {
    public static void main(String[] args) {

        //Create books independently
        ListBook b1 = new ListBook("Intro to java");
        ListBook b2 = new ListBook("DSA");
        ListBook b3 = new ListBook("Spring");

        //create list of books
        List<ListBook> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);


        //pass books to library(aggregation)
        Library lib = new Library(bookList);

        lib.showBooks();
    }
}
/**
Book objects are created independently of the Library.
The Library is using the books, but not owning their lifecycle
You can reuse the same Book objects across multiple libraries (if needed).
If Library is deleted, the Book objects still exist
 */