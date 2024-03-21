public class Book {
    private String bookName;
    private Author author;
    private int bookYear;

    public Book(String name, Author author, int year) {
        this.bookName = name;
        this.author = author;
        this.bookYear = year;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getBookYear() {
        return this.bookYear;
    }

    public void setBookYear(int year) {
        this.bookYear = year;
    }


    public String toString() {
        return "Название книги: " + this.bookName + System.lineSeparator() +
                this.author.toString() + System.lineSeparator() +
                "Год издания: " + this.bookYear;

    }
}

