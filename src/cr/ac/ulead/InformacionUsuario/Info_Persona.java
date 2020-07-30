package cr.ac.ulead.InformacionUsuario;

import java.time.LocalDate;

public class Info_Persona {
    private String nombre;
    private String apellido;
    private LocalDate fecha_nacimiento;
    private String cedula;

    public Info_Persona(String nombre, String apellido, LocalDate fecha_nacimiento, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public String getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return "Informacion Personal: " +
                "Nombre: " + getNombre() + '\'' +
                ", Apellido: " + getApellido() + '\'' +
                ", Cedula: " + getCedula() + '\'';
    }
}
