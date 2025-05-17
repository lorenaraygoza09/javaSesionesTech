import java.util.Optional;

public class Contacto {
//cuando usamos Optional debemos de especificar el tipo de dato que vamos
    //a utilizar <String>
    private Optional <String> telefono;

    public Contacto(String telefono) {
        this.telefono = Optional.ofNullable(telefono);
    }

    public Optional<String> getTelefono() {
        return telefono;
    }
}