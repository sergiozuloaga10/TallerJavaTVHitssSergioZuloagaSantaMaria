package models;

public class Cliente {
    private int id;
    private String nombreStrin;
    private String email;

    public Cliente(int id, String nombreStrin, String email) {
        this.id = id;
        this.nombreStrin = nombreStrin;
        this.email = email;
    }

    public int getId(){
        return id;
    }

    public String getNombreStrin() {
        return nombreStrin;
    }
    public void setNombreStrin(String nombreStrin) {
        this.nombreStrin = nombreStrin;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Cliente [nombreStrin=" + nombreStrin + ", email=" + email + "]";
    }

    
}
