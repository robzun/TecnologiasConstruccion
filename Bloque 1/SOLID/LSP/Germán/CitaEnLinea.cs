public class CitaEnLinea : Cita{
    public override void ConfirmarCita()
    {
        Console.WriteLine($"Cita en línea confirmada por el cliente: {Cliente} para el servicio {Servicio} en la fecha {FechaHora}");
    }
}