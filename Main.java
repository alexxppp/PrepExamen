package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Main {


    /**
     * EJERCICIO 1
     */
    static public Punto punto_medio(Punto a, Punto b) {
//        double coordenada_x_pA = a.x;
//        double coordenada_y_pA = a.y;
//        double coordenada_x_pB = b.x;
//        double coordenada_y_pB = b.y;
//
//        double coordenada_x_pNuevo = (coordenada_x_pA + coordenada_x_pB) / 2;
//        double coordenada_y_pNuevo = (coordenada_y_pA + coordenada_y_pB) / 2;
//
//        Punto nuevo = new Punto(coordenada_x_pNuevo, coordenada_y_pNuevo);
//
//        return nuevo;

        return new Punto(((a.x + b.x) / 2), ((a.y + b.y) / 2));
    }

    /**
     * Test ejercicio 1
     */
    static public void test_punto_medio() {
        Punto a = new Punto(5, 5);
        Punto b = new Punto(10, 10);
        Punto pMedio = punto_medio(a, b);

        if(pMedio.x == 7.5 && pMedio.y == 7.5) {
            System.out.println("Es Correcto");
        }else{
            System.out.println("No es Correcto");
        }
    }


    /**
     * EJERCICIO 2
     */
     static public double longitudmascorto (List<Punto> a) {

         double solucion = Double.MAX_VALUE;
         for (int i = 0; i < a.size() - 1; i++) {
             double x1 = a.get(i).x;
             double y1 = a.get(i).y;
             double x2 = a.get(i+1).x;
             double y2 = a.get(i+1).y;
             double dif_x = x1 - x2;
             double dif_y = y1 - y2;
             double hipotenusa = Math.sqrt((dif_x * dif_x) + (dif_y * dif_y));

             if (solucion > hipotenusa) {
                 solucion = hipotenusa;
             }
         }

         return solucion;

     }

    /**
     * MAIN
     */
    public static void main(String[] args) {

        // EJERCICIO 1
        Punto a = new Punto(2, 4);
        Punto b = new Punto(10, -2);
        Punto medio = punto_medio(a, b);
        System.out.println(medio);
        
         // TEST EJERCICIO 1
        test_punto_medio();
        

         // EJERCICIO 2
        List<Punto> listaDePuntos = new ArrayList<>();
        listaDePuntos.add(new Punto(1.2, 3.4));
        listaDePuntos.add(new Punto(5.6, 7.8));
        listaDePuntos.add(new Punto(9.1, 1.1));
        listaDePuntos.add(new Punto(2.3, 4.5));
        listaDePuntos.add(new Punto(6.7, 8.9));
        listaDePuntos.add(new Punto(10.2, 11.3));
        listaDePuntos.add(new Punto(12.4, 13.5));
        listaDePuntos.add(new Punto(14.6, 15.7));
        listaDePuntos.add(new Punto(16.8, 17.9));
        listaDePuntos.add(new Punto(18.1, 19.2));

        double longitud_corta = longitudmascorto(listaDePuntos);
        System.out.println(longitud_corta);
        
    }

}
