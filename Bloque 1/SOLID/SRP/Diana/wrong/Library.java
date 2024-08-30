public class Library {

    private String tittle;
    private String author;
    public boolean isAvailable;
    public String memberName;
    public String memberID;


    public Library(String tittle, String author, boolean isAvailable, String memberName, String memberID) {
        this.tittle = tittle;
        this.author = author;
        this.isAvailable = isAvailable;
        this.memberName = memberName;
        this.memberID = memberID;
    }


    public String getTittle() {
        return tittle;
    }


    public String getAuthor() {
        return author;
    }


    public boolean isAvailable() {
        return isAvailable;
    }


    public String getMemberName() {
        return memberName;
    }


    public String getMemberID() {
        return memberID;
    }


    public void setTittle(String tittle) {
        this.tittle = tittle;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }


    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void lendBook(){
        if(isAvailable){
            this.isAvailable = false;
            System.out.println("El libro " + tittle + " esta disponible");
        } else {
            System.out.println("El libro " + tittle + " no esta disponible");
        }
    }

    public void returnBook(){
            this.isAvailable = true;
            System.out.println("El libro " + tittle + " ha sido devuelto");
    }

    public void borrowBook(){
        System.out.println(memberName + " ha solicitado el prestamo del libro");

    }
}