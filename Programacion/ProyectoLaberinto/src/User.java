import java.util.Date;

public class User {
    private String username;
    private String name;
    private String email;
    private Date birthdate;
    private String NIF;
    private String address;
    private String role;


    //Constructors
    public User(String username, String name, String email){
        super();
        this.username = username;
        this.name = name;
        this.email = email;
    }
    public User(String username, String name, String NIF, String email, String address, Date birthdate, String role) {
        super();
        this.username = username;
        this.name = name;
        this.NIF = NIF;
        this.email = email;
        this.address = address;
        this.birthdate = birthdate;
        this.role = role;
    }

    //Getters and Setters
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNIF() {
        return NIF;
    }
    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    //ERROR?
    public String toString(){
        return (this.username + "#" + this.name + "#" + this.NIF + "#" + this.email + "#" + this.birthdate + "#" + this.role);
    }
}
