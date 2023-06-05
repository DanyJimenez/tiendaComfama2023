package org.example;

public class Cliente {

    //Atributos (variables que almacenan datos de la clase)
    private String nombre; // dato en envoltura (mayúscula)
    private int edad; //dato primitivo (minúscula)
    private String telefono;
    private String direccion;
    private Integer comprasAlMes;

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

    //métodos de encapsulado (getters y setters)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) { //validar que el nombre que recibe tenga mínimo cuatro letras
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) { //validar que el teléfono tenga expresamente 10 dígitos
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getComprasAlMes() {
        return comprasAlMes;
    }

    public void setComprasAlMes(Integer comprasAlMes) { //validar que no existan compras negativas
        if (comprasAlMes < 0){
            System.out.println("No se admiten compras negativas");
        } else {
            this.comprasAlMes = comprasAlMes;
        }

    }


    //Métodos ordinarios

}
