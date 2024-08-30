public class LibraryMember {
    
    private String name;
    private String memberId;

    public LibraryMember(String name, String memberID) {
        this.name = name;
        this.memberId = memberID;
    }

    public String getName() {
        return name;
    }
    public String getMemberId() {
        return memberId;
    }

    public void borrowBook(Book book) {
        System.out.println(name + " ha tomado el libro " + book.getTittle());
        book.setAvailable(false);
    }

    public void returnBook(Book book) {
        System.out.println(name + " ha regresado el libro " + book.getTittle());
        book.setAvailable(true);
    }
}