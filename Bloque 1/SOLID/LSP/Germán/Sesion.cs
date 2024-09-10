public class Sesion{
    private string _usuario;
    private string _password;

    public Sesion(string usuario, String password){
        this._usuario = usuario;
        this._password = password;
    }

    public bool IniciarSesion(){
        return _usuario == "zhrine" && _password == "contraseña";
    }
}