package Task4;

public class Reader {
    private String fullName;
    private int cardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phone;

    public Reader(String fullName, int cardNumber, String faculty, String dateOfBirth, String phone) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public void takeBook(int takenBooks){
        System.out.println(fullName + " took " + takenBooks + " books");
    }

    public void takeBook(String... titles){
        String bookTitles = parseTitles(titles);
        System.out.println(fullName + " took books: " + bookTitles);
    }

    public void takeBook(Book... books){
        String bookTitles = parseBooks(books);
        System.out.println(fullName + " took books: " + bookTitles);
    }

    private String parseTitles(String[] titles){
        String result = "";
        for (int i = 0; i < titles.length; i++) {
            result += titles[i];
            if(i != titles.length - 1){
                result += ", ";
            }
        }

        return result;
    }

    private String parseBooks(Book[] books){
        String result = "";
        for (int i = 0; i < books.length; i++) {
            result += books[i].getTitle();
            if(i != books.length - 1){
                result += ", ";
            }
        }

        return result;
    }

    public void returnBook(int returnedBooks){
        System.out.println(fullName + " returned " + returnedBooks + " books");
    }

    public void returnBook(String... titles){
        String bookTitles = parseTitles(titles);
        System.out.println(fullName + " returned the books: " + bookTitles);
    }

    public void returnBook(Book... books){
        String bookTitles = parseBooks(books);
        System.out.println(fullName + " returned the books: " + bookTitles);
    }
}
