package org.example.classes;

public class Administrador {

    private  String nombres;
    private  Double salario;
    private  String correo;
    private  Boolean jornada;

    public Administrador() {
    }

    public Administrador(String nombres, Double salario, String correo, Boolean jornada) {
        this.nombres = nombres;
        this.salario = salario;
        this.correo = correo;
        this.jornada = jornada;
    }


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {  //mínimo 25 letras
        this.nombres = nombres;
    }

    public Double getSalario() {
       return  salario;
    }


    public void setSalario(Double salario) {  //
        if (salario < 0) {
            System.out.println("Revise por favor");
        } else {
            this.salario = salario;
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Boolean getJornada() {
        return jornada;
    }

    public void setJornada(Boolean jornada) {
        this.jornada = jornada;
    }
}
