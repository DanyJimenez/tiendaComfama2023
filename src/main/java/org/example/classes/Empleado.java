package org.example.classes;

public class Empleado {
    //atributos
    public Integer salario;
    private String nombre;

    //métodos especiales
    //1. constructor vacío


    public Empleado() {
    }

    //constructor lleno

    public Empleado(Integer salario, String nombre) {
        this.salario = salario;
        this.nombre = nombre;
    }
}
