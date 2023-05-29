package org.example;

public class Cliente {

    //Atributos (variables que almacenan datos de la clase)
    private String nombre; // dato en envoltura (mayúscula)
    public int edad; //dato primitivo (minúscula)
    public String telefono;
    public String direccion;
    public Integer comprasAlMes;

    //Métodos especiales
    //1. Constructor vacío
    public Cliente() {
    }
    //2. Constructor lleno

    public Cliente(String nombre, int edad, String telefono, String direccion, Integer comprasAlMes) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.comprasAlMes = comprasAlMes;
    }

    //Métodos ordinarios

}
