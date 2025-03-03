public class Cliente {
    private String nombre;
    private String apellidos;
    private String nif;
    private String direccion;
    private String email;
    private String telefono;
    private String fecha_alta;
    private String tipo;
    private String descuento;
    private String matricula;

    //Constructors
    //Si el formato de los campos no es correcto se le añade uno por defecto
    public Cliente(String nombre, String apellidos, String nif, String direccion, String email, String telefono, String fecha_alta, String tipo, String descuento, String matricula) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        if(Utilidades.validarNif(nif)){
            this.nif = nif;
        }else {
            this.nif = "12345678Z";
        }
        this.direccion = direccion;
        if(Utilidades.validarEmail(email)){
            this.email = email;
        }else{
            this.email = "sin email";
        }
        if(Utilidades.validarTelefono(telefono)){
            this.telefono = telefono;
        }else{
            this.telefono = "000 000 000";
        }
        this.fecha_alta = fecha_alta;
        this.tipo = tipo;
        if(Utilidades.validarDescuento(descuento)){
            this.descuento = descuento;
        }else{
            this.descuento= "1";
        }
        this.descuento = descuento;
        if(Utilidades.validarMatricula(matricula)){
            this.matricula = matricula;
        }else{
            this.matricula = "999 ZZZ";
        }
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }
    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha_alta() {
        return fecha_alta;
    }
    public void setFecha_alta(String fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescuento() {
        return descuento;
    }
    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "\nNombre:" + nombre +
                "\nApellidos:" + apellidos +
                "\nNIF:" + nif +
                "\nEmail:" + email +
                "\nTelefono:" + telefono +
                "\nFecha de alta=" + fecha_alta +
                "\nTipo cliente:" + tipo +
                "\nDescuento=" + descuento +
                "\nMatricula:" + matricula;
    }

    public String infoReducida(){
        return "Nombre:" + nombre +
                "\nNIF:" + nif +
                "\nEmail:" + email +
                "\nTelefono:" + telefono +
                "\nMatricula:" + matricula +
                "\n";
    }
}
