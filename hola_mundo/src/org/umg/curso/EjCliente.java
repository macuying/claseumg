package org.umg.curso;

/**
 * Created by alumno on 26/06/2017.
 */
public class EjCliente {
    private String nombre;
    private Integer edad;
    private Integer salario;

    public EjCliente() {
    }

    public EjCliente(String nombre, Integer edad, Integer salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }
}
