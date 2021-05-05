package models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Plantilla {

    private int hospitalcod;
    private int salacod;
    private int empleadono;
    private String apellido;
    private String funcion;
    private String turno;
    private int salario;

    public Plantilla() {
    }

    public Plantilla(int hospitalcod, int salacod, int empleadono, String apellido, String funcion, String turno, int salario) {
        this.hospitalcod = hospitalcod;
        this.salacod = salacod;
        this.empleadono = empleadono;
        this.apellido = apellido;
        this.funcion = funcion;
        this.turno = turno;
        this.salario = salario;
    }

    public Plantilla(int id, String apellido, String funcion, String turno, int salario) {
        this.empleadono = id;
        this.apellido = apellido;
        this.funcion = funcion;
        this.turno = turno;
        this.salario = salario;
    }

    public int getHospitalcod() {
        return hospitalcod;
    }

    public void setHospitalcod(int hospitalcod) {
        this.hospitalcod = hospitalcod;
    }

    public int getSalacod() {
        return salacod;
    }

    public void setSalacod(int salacod) {
        this.salacod = salacod;
    }

    public int getEmpleadono() {
        return empleadono;
    }

    public void setEmpleadono(int empleadono) {
        this.empleadono = empleadono;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
