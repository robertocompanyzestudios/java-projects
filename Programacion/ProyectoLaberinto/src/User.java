import java.util.Date;

/**
 * Esta clase aporta lo necesario para administrar un usuario
 * @author Rcompny
 * @version 0.1.0
 */
public class User {
    /**
     * Nombre de usuario en la bd
     */
    private String username;

    /**
     * Nombre del usuario
     */
    private String name;

    /**
     * Email del usuario
     */
    private String email;

    /**
     * fecha de nacimiento del usuario
     */
    private Date birthdate;

    /**
     * Numero de identificación fiscal del usuario
     */
    private String nif;

    /**
     * Direccion del usuario
     */
    private String address;

    /**
     * Rol del usuario en la aplicación
     */
    private String role;

    //Constructors

    /**
     * Instancia un usuario
     * @param username Nombre del usuario en la aplicacion
     * @param name Nombre del usuario
     * @param email Email del usuario
     */
    public User(String username, String name, String email){
        super();
        this.username = username;
        this.name = name;
        this.email = email;
    }

    /**
     * Constructor por defecto
     * @param username Nombre del usuario en la aplicacion
     * @param name Nombre del usuario
     * @param nif Numero de identificacion fiscal del Usuario
     * @param email Email del usuario
     * @param address Direccion del usuario
     * @param birthdate Fecha de nacimiento del usuario
     * @param role Rol del usuario en el programa
     */
    public User(String username, String name, String nif, String email, String address, Date birthdate, String role) {
        super();
        this.username = username;
        this.name = name;
        this.nif = nif;
        this.email = email;
        this.address = address;
        this.birthdate = birthdate;
        this.role = role;
    }

    //Getters and Setters
    /**
     * Obtiene el nombre de usuario del usuario
     * @return el nombre de usuario del usuario
     */
    public String getUsername() {
        return username;
    }

    /**
     * Cambia el nombre de usuario del usuario
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Obtiene el nombre del usuario
     * @return el nombre del usuario
     */
    public String getName() {
        return name;
    }
    /**
     * Cambia el nombre del usuario
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene el documento de identificacion fiscal del usuario
     * @return el documento de identificacion fiscal del usuario
     */
    public String getnif() {
        return nif;
    }
    /**
     * Cambia el documento de identificacion fiscal del usuario
     * @param nif
     */
    public void setnif(String nif) {
        this.nif = nif;
    }

    /**
     * Obtiene el  email del usuario
     * @return el  email del usuario
     */
    public String getEmail() {
        return email;
    }
    /**
     * Cambia el  email del usuario
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene la direccion del usuario
     * @return la direccion del usuario
     */
    public String getAddress() {
        return address;
    }
    /**
     * Cambia la direccion del usuario
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Obtiene la fecha de nacimiento del usuario
     * @return la fecha de nacimiento del usuario
     */
    public Date getBirthdate() {
        return birthdate;
    }
    /**
     * Cambia la fecha de nacimiento del usuario
     * @param birthdate
     */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * Obtiene el rol del usuario
     * @return el rol del usuario
     */
    public String getRole() {
        return role;
    }
    /**
     * Cambia el rol del usuario
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Formatea la informacion de User en un string
     * @return La informacion del usuario como Stirng
     */
    public String toString(){
        return (this.username + "#" + this.name + "#" + this.nif + "#" + this.email + "#" + this.birthdate + "#" + this.role);
    }

}
