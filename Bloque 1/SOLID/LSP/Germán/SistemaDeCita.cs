public class SistemaDeCita{
    private List<Cita> _cita = new List<Cita>();

    public void AgregarCita(Cita cita){
        _cita.Add(cita);
    }

    public void ProcesarCita(){
        foreach(var cita in _cita){
            if(cita is IVerificable verificable){
                verificable.VerificarDisponibilidad();
            }
            cita.ConfirmarCita();
        }
    }
}