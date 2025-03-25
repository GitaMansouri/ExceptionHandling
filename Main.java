public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.listBooks();

        Book book1 = null;
        Book book2 = null;
        Book book3 = null;
        Book book4 = null;

        book1 = new Book("Java Programming", 300);
        book2 = new Book("Design Patterns", -3);
        book3 = new Book(null, 100);
        book4 = new Book("", 400);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.listBooks();

        library.borrowBook("Java Programming");
        library.returnBook("Clean Code");
        library.returnBook("Java Programming");
    }
}