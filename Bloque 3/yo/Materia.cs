public class Materia{
    private string nombre {get; set;}
    private double calificacion {get; set;}

    public Materia(string nombre){
        this.nombre = nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion){
        this.calificacion = calificacion;
    }
}