public class CitaEnSpa : Cita, IVerificable{
    public override void ConfirmarCita()
    {
        Console.WriteLine($"Cita confirmada para {Cliente} en el servicio {Servicio} en la fecha {FechaHora}");
    }

    public void VerificarDisponibilidad(){
        Console.WriteLine($"Verificando la disponibillidad del {Servicio} en el spa {FechaHora}");
    }
}