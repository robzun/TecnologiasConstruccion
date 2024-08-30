public class Book {
    
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        isAvailable = true;
    }

    public String getTittle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void showBookStatus(){
        String status;
        if(isAvailable)
            status = "disponible.";
        else
            status = "indisponible.";

        System.out.println("El libro " + title + " está " + status);
    }
}