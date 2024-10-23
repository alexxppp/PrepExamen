package Ejercicios;

/**
 * Set de ejercicios orientados a los arrays
 */
public class Set2 {


    public static void main(String[] args) {
        rellenar_array();
    }

    /**
     * Genera un programa que rellene un array de
     * longitud diez con doubles al azar y lo
     * imprima por pantalla, y por último lo
     * devuelva (cambia "void")
     */
    static public void rellenar_array() {

        double[] azar = new double [10];

        for (int i = 0; i < 10; i++) {
            double rndm = Math.random() * 10 + 1;
            azar[i] = rndm;
            System.out.println(azar[i]);
        }

    }

    /**
     * Escribe un method que reciba un indice entero
     * del 0 al 9, y busque su valor en un array
     * generado con la funcion anterior, y lo devuelva
     * convertido a un entero
     */
    static public int convertir_indice(/* TODO*/) {
        return 1;
    }

    /**
     * Escribe una función que pida al usuario 3 veces
     * que inserte un número y pase ese número a la
     * función anterior, e imprima el resultado
     */
    static public void convertir_indice_interactivo() {

    }
    

}
