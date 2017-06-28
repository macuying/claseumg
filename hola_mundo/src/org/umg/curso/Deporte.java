package org.umg.curso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alumno on 27/06/2017.
 */
public class Deporte {

    public static void main(String[] args) throws IOException {

        ClsBase e = new ClsBase();
        String[] deportes = {"Futbol", "Basquetbol", "Karate", "Natacion", "Ciclismo", "Triatrol", "Baseball"};
        String respuesta[] = new String[7];

        // Print all the array elements
        for (int i = 0; i < deportes.length; i++) {
            int a=0;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Nombre del Especialista del deporte " + deportes[i] + ":");
            e.setNombre(reader.readLine());
            System.out.println("El deporte " + deportes[i] + " utiliza balon?");
            e.setRespuesta(reader.readLine());

            if (e.getRespuesta().toString().equals("si")){
                a=a+1;
                respuesta[i] = deportes[i];
            }

            //System.out.println("Segun el especialista " + e.getNombre() + " el deporte " + deportes[i] + " " + e.getRespuesta() + " utiliza balon.");
        }

        for (int j = 0; j < respuesta.length; j++) {
            System.out.println(respuesta[j]);

        }


    }
}
