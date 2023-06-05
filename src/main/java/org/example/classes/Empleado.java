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

    public Integer getSalario() {
       return  salario;
    }

    public void setSalario(Integer salario) {
        if (salario < 0){
            System.out.println("El salario debe ser mayor a o");
        } else{
            this.salario = salario;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //métodos ordinarios
    /*Los métodos ordinarios serán funciones que el desarrolador programa para ejecutar la lógica de negocio*/

    //calcular el salario mensual de un empleado
    public Double calcularSalario(Integer salarioBase, Integer deducciones){
        final Double   descuentoSalud = 0.04;
        final Double descuentoPension = 0.04;

        Double descuentoSeguridadSocial = (salarioBase * descuentoSalud * descuentoPension);
        Double salario =  salarioBase - deducciones - descuentoSeguridadSocial;

        return salario;
    }
}

//consultar la diferencia entre casteo y parseo