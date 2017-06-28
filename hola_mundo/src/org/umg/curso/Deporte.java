package org.umg.curso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alumno on 27/06/2017.
 */
public class Deporte {

        public static void main(String[] args) throws IOException {

            String[] deportes = {"Futbol","Basquetbol","Karate","Natacion", "Ciclismo", "Triatrol", "Baseball"};

            // Print all the array elements
            for (int i = 0; i < deportes.length; i++) {
                System.out.println(deportes[i] + " ");
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < deportes.length; i++) {
                System.out.println("El deporte: " + deportes[i] + "utiliza balon?");

            }

            // Summing all elements
            double total = 0;
            for (int i = 0; i < deportes.length; i++) {
                total += deportes[i];
            }
            System.out.println("Total is " + total);

            // Finding the largest element
            double max = deportes[0];
            for (int i = 1; i < deportes.length; i++) {
                if (deportes[i] > max) max = deportes[i];
            }
            System.out.println("Max is " + max);


        }
    }




}
