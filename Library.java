import java.util.ArrayList;

public class Library {
private ArrayList<Book> books;

public Library(){
    Book book = new Book("title" , 203);
}

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) throws InvalidBookException {
    if (book == null){
        throw new InvalidBookException("Book should not be null");
    }
    books.add(book);
    }

    private Book findBook(String title){
            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    return book;
                }
            }
            return null;
    }

    public void borrowBook(String title) throws BookNotFoundException, EmptyLibraryException {
        if (books.isEmpty()) {
            throw new EmptyLibraryException("Library is empty, no books to borrow");
        }
        Book foundBook = findBook(title);
        if (foundBook == null) {
            throw new BookNotFoundException("Book with title" + title + "not found.");
        }

        System.out.println("Successfully borrowed: " + foundBook.getTitle() + foundBook.getPageCount());
    }

    public void returnBook(String title){
        Book foundBook = findBook(title);
        if (foundBook == null) {
            throw new BookNotFoundException("Book with title" + title + "not found. Cannot return");
        }

        System.out.println("Successfully returned: " + foundBook.getTitle() + foundBook.getPageCount());
    }

    public void listBooks() throws EmptyLibraryException{
        if (books.isEmpty()) {
            throw new EmptyLibraryException("Library is empty");
        }
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}
