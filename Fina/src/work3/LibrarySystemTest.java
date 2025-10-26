package work3;

public class LibrarySystemTest {
    public static void main(String[] args) {
        Book book1 = new Book("Java核心技术", "Cay S", "2020");
        Library.addBook(book1);
        Library.displayBooks();
        System.out.println("图书总数：" + Library.getTotalBooks());
    }
}