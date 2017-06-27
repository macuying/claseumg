package org.umg.curso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alumno on 26/06/2017.
 */
public class EjBanco {
    public static void main(String[] args) throws IOException {
        EjCliente c = new EjCliente();
        c.setNombre("Barreda");
        c.setEdad(34);
        c.setSalario(2500);
        System.out.println("Estimado cliente " + c.getNombre() + " su salario sera de: " + c.getSalario());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Su Nombre; ");
        c.setNombre(reader.readLine());
        System.out.println("Su Edad; ");
        c.setEdad(Integer.parseInt(reader.readLine()));
        System.out.println("Su Salario; ");
        c.setSalario(Integer.parseInt(reader.readLine()));


        System.out.println("Estimado cliente " + c.getNombre() + " su salario sera de: " + c.getSalario());


    }
}
