package work3;

class Library {
    private static Book[] books = new Book[100];
    private static int count = 0;

    public static void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("图书存储已满，无法添加");
        }
    }

    public static void displayBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i].toString());
        }
    }

    public static int getTotalBooks() {
        return count;
    }

    static {
        Book defaultBook = new Book("默认图书", "佚名", "2000");
        addBook(defaultBook);
    }
}
