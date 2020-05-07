public class Check {
    public static void main(String[] args) {
        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();
        bookBorrower1.borrowBook();
        System.out.println("=====");
        System.out.println(bookBorrower1.getAuthorAndTitle());
        System.out.println("=====");
        bookBorrower2.borrowBook();
        System.out.println(bookBorrower2.getAuthorAndTitle());
    }
}
