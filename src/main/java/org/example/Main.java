package org.example;

import org.example.classes.Empleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //crear un objeto especial de Java para recibir datos por teclado
        Scanner entradaPorTeclado = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.print("Digite su nombre: ");
        cliente.setNombre(entradaPorTeclado.nextLine());
        System.out.println("Su nombre es: " + cliente.getNombre());






        cliente.setNombre("Juan");
        cliente.setTelefono("3114332222");
        cliente.setDireccion("cl.50");
        cliente.setEdad(22);
        cliente.setComprasAlMes(6);

        System.out.println("El nombre  es: " + cliente.getNombre());
        System.out.println("El telefono es: " + cliente.getTelefono());
        System.out.println("La direccion es: " + cliente.getDireccion());
        System.out.println("La edad es: " + cliente.getEdad());
        System.out.println("El numero de compras al mes es: " + cliente.getComprasAlMes());
    }
}