import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Билет 11, задача:
        // Дан массив пар названий книг и авторов,
        // необходимо привести каждую пару в строку вида:
        // «Название книги» Имя Отчество Фамилия автора.

        // Решение 1 через двумерный массив
        String[][] array = {
                {"Стив Джобс", "У. Айзексон"},
                {"Война и мир", "c"},
                {"11 минут", "П. Коэльо"}
        };

        for (String[] strings : array) {
            String title = strings[0];
            String authorName = strings[1];
            System.out.println("\"" + title + "\"" + " " + authorName);
        }

        // разделитель
        System.out.println();

        // Решение 2 через динамический массив
        List<Book> bookList = new ArrayList<>(List.of(
                new Book("Стив Джобс", "У. Айзексон"),
                new Book("Война и мир", "Ф.М. Достоевский"),
                new Book("11 минут", "П. Коэльо")
        ));

        for (Book book : bookList) {
            System.out.println(book);
        }

    }

}
