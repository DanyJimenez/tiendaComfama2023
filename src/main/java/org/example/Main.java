package org.example;

import org.example.classes.Empleado;

public class Main {
    public static void main(String[] args) {

        //creando una variable ordinaria
        int edad = 5;
        System.out.println(edad);


        //creando un objeto usando un constructor vacío
        Cliente objeto =  new Cliente();
        //Uso un objeto para acceder a los atributos y métodos de la clase por separado
        objeto.edad = 30;
        System.out.println(objeto.edad);
        objeto.nombre = "Dany";
        System.out.println(objeto.nombre);

        //creando un objeto usando un constructor lleno

        Cliente objetoDos = new Cliente("Sara",32, "4508080","cl. 50", 10);
        System.out.println(objetoDos.edad);
        System.out.println(objetoDos.nombre);


        //Creando un objeto de la clase Empleado
        Empleado objetoTres = new Empleado();
        System.out.println(objetoTres.nombre);
    }
}