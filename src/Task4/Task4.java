package Task4;

public class Task4 {
    public static void main(String[] args) {
        Reader reader = new Reader("Roman Vasilyev", 230442,
                "SE", "10.09.2004", "87085455470");

        Book book1 = new Book("Adventure", "Vasilyev");
        Book book2 = new Book("Fantasy", "Kurmetov");
        Book book3 = new Book("Encyclopedia", "Pushkin");

        reader.takeBook(1);
        reader.takeBook("Dictionary, Adventure");
        reader.takeBook(book1, book2, book3);

        reader.returnBook(2);
        reader.returnBook("Adventure, Dictionary");
        reader.returnBook(book3, book2, book1);
    }
}
