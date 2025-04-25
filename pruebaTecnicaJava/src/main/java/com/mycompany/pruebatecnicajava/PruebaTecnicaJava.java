/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pruebatecnicajava;

import java.util.Scanner;

/**
 *
 * @author harol
 */
public class PruebaTecnicaJava {

    //Variables
    static char asientos[][] = new char[10][10];
    static boolean bandera = false;
    static Scanner teclado = new Scanner(System.in);
    static int fila, asiento;
    static String respuesta;

    // Método para llenar asientos
    public static void llenarasientosL() {
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                asientos[f][c] = 'L';
            }
        }

    }

    public static void main(String[] args) {
        llenarasientosL();

        System.out.println("Bienvenido al Sistema de Recervas");

        while (bandera != true) {
            System.out.println("Ingrese Fila y Asiento a reservar");
            System.out.println("Ingrese a Fila (Entre 0 y 9)");
            fila = teclado.nextInt();
            System.out.println("Ingrese a Asiento (Entre 0 y 9)");
            asiento = teclado.nextInt();

            if (asientos[fila][asiento] == 'L') {
                asientos[fila][asiento] = 'X';
                System.out.println("El asiento fue reservado correctamente");
            } else {
                System.out.println("El asienti esta ocupado. Por favor elija otro");

            }
            System.out.println("¿Desea finalizar la reserva? S:(para Si) N:(cualquier tecla NO)");
            respuesta = teclado.next();

            if (respuesta.equalsIgnoreCase("S")) {
                bandera = true;
            }

        }

    }

}
