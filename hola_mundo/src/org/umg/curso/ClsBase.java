package org.umg.curso;

/**
 * Created by alumno on 27/06/2017.
 */
public class ClsBase {
    /**
     * Created by alumno on 26/06/2017.
     */
        private String especialista;
        private String respuesta;

        public ClsBase() {
        }

        public ClsBase(String especialista, String respuesta) {
            this.especialista = especialista;
            this.respuesta = respuesta;
            }

        public String getNombre() {
            return especialista;
        }

        public void setNombre(String nombre) {
            this.especialista = nombre;
        }

        public String getRespuesta() {
            return respuesta;
        }

        public void setRespuesta(String respuesta) {
            this.respuesta = respuesta;
        }
}
