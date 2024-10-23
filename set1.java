package Ejercicios;

import java.util.Scanner;

/**
 * Set de ejercicios orientados a la programación básica
 */
public class Set1 {


    public static void main(String[] args) {

        number_game_v3();

    }

    /**
     * Haz un programa que imprima "Hello World" por la consola
     */
    public static void Hello_World() {
        String texto = "Hello, world";
        System.out.println(texto);
    }

    /**
     * Haz una función para preguntarle al usuario su nombre
     * e imprimir "Hello, ${username}"
     */
    static public void Hello_User() {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime tu nombre");
        String Nombre = sc.nextLine();
        System.out.println(Nombre);
    }

    /**
     * Haz una función cuyo único propósito es devolver el
     * nombre del usuario
     */
    static public String getUsername() {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime tu nombre");
        String Nombre = sc.nextLine();
        return Nombre;
    }

    /**
     * Haz lo mismo de antes pero implementando la función
     * getUsername() en tu código
     */
    static public void Hello_User_v2() {
        String Nombre1 = getUsername();
        System.out.println(Nombre1);
    }

    /**
     * Haz un programa que pide un número al usuario y si el
     * número es igual a un numero aleatorio, el usuario gana
     */
    static public void number_game() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero del 1 al 10");
        int numero = sc.nextInt();

        int rndm = (int) (Math.random() * 10) + 1;

        if (numero == rndm) {
            System.out.println("Ganado");
        } else {
            System.out.println("Perdido");
        }

    }

    /**
     * Escribe un programa que tome dos numeros enteros como
     * parametro y devuelva si son iguales o no
     */
    static public boolean areEqual(int numeroUsuario, int random) {
        if(numeroUsuario==random) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Haz lo mismo que antes pero implementando el metódo
     * areEquals()
     */
    static public void number_game_v2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero del 1 al 10");
        int numero = sc.nextInt();

        int rndm = (int) (Math.random() * 10) + 1;

        if (areEqual(numero, rndm)) {
            System.out.println("Ganado");
        } else {
            System.out.println("Perdido");
        }
    }

    /**
     * Implementa un minijuego donde el usuario escribe un
     * número en la consola hasta que ese número sea igual
     * que un número aleatorio, indicandole cada vez si el
     * número introducido es menor o mayor que el número
     * generado aleatoriamente
     */
    static public void number_game_v3() {

        Scanner sc = new Scanner(System.in);
        int rndmnum = (int) (Math.random() * 10) + 1;

        // Ejecutar mientras usuario NO adivine
        int numeroconsola = -1;
        while (numeroconsola != rndmnum) {
            System.out.println("Dame un numero");
            numeroconsola = sc.nextInt();

            if (numeroconsola==rndmnum) {
                System.out.println("Son iguales");
            } else if (numeroconsola>rndmnum) {
                System.out.println("Es Mayor");
            } else {
                System.out.println("Es Menor");
            }
        }
    }




}
