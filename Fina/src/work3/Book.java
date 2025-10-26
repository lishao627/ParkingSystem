package work3;

public class Book {
    private String title;
    private String author;
    private String year;

    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "书名：" + title + "，作者：" + author + "，年份：" + year;
    }
}