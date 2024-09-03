package Refactor;

public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Alexis", 10);
        Maestro maestro = new Maestro("Magdielito.com", "Mates discretas");

        maestro.mostrarInfo();
        alumno.mostrarInfo();

        alumno.realizarExamen();
    }
}
