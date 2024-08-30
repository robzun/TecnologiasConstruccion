public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("El Alquimista", "Paulo Coelho");
        LibraryMember member1 = new LibraryMember("Rafael Juan Merlín Prieto", "1");

        member1.borrowBook(book1);
        book1.showBookStatus();
        member1.returnBook(book1);
        book1.showBookStatus();
    }
}