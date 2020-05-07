public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoanedOut;
    private BookSingleton(){
        author = "Tuấn Lê";
        title  = "Design Patterns";
        book = null;
        isLoanedOut = false;
    }
    public static BookSingleton borrowBook() {
        if (!isLoanedOut) {
            if (book == null) {
                book = new BookSingleton();
            }
            isLoanedOut = true;
            return book;
        }
        return null;
    }
    public void returnBook(BookSingleton bookReturned){
        isLoanedOut = false;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthorAndTitle(){
        return getTitle() + " by " + getAuthor();
    }
}
