import java.util.Objects;

public class Book {

    private final String title;
    private final String authorName;

    public Book(String title, String authorName) {
        this.title = title;
        this.authorName = authorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, authorName);
    }

    @Override
    public String toString() {
        return "\"" + title + "\"" +
                " " + authorName;
    }

}
