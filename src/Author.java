public class Author {
    private String authorName;
    private String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getName() {
        return this.authorName;
    }

    public String getSurname() {
        return this.authorSurname;
    }


    public String toString() {
        return "Автор: " + this.authorName + " " + this.authorSurname;
    }
}
