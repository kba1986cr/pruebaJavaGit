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
    static boolean bandera, banderaDos = false;
    static Scanner teclado = new Scanner(System.in);
    static int fila, asiento;
    static String respuesta, verAsientosD;

    // Método para llenar asientos
    public static void llenarAsientosL() {
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                asientos[f][c] = 'L';
            }
        }
    }

    // Método para ver asientos
    public static void verAsientos(char asientos[][]) {
        System.out.println("Asientos");
        System.out.print("  ");
        for (int c = 0; c < 10; c++) {
            System.out.print(" " + c + " ");
        }
        System.out.println();
        for (int f = 0; f < 10; f++) {
            System.out.print(f + " ");
            for (int c = 0; c < 10; c++) {
                System.out.print("[" + asientos[f][c] + "]");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        llenarAsientosL();

        System.out.println("Bienvenido al Sistema de Reservas");

        while (!bandera) {
            System.out.println("¿Desea ver los asientos disponibles? S:(para Sí) N:(cualquier tecla NO)");
            verAsientosD = teclado.next();
            if (verAsientosD.equalsIgnoreCase("S")) {
                verAsientos(asientos);
            }
            System.out.println("");

            banderaDos = false;
            while (!banderaDos) {
                System.out.println("Ingrese Fila y Asiento a reservar");
                System.out.print("Ingrese fila (0 a 9): ");
                fila = teclado.nextInt();
                System.out.print("Ingrese asiento (0 a 9): ");
                asiento = teclado.nextInt();

                if (fila >= 0 && fila <= 9 && asiento >= 0 && asiento <= 9) {
                    banderaDos = true;
                } else {
                    System.out.println("Fila o asiento inválido. Intente de nuevo.\n");
                }
            }

            if (asientos[fila][asiento] == 'L') {
                asientos[fila][asiento] = 'X';
                System.out.println("Asiento reservado correctamente.");
            } else {
                System.out.println("El asiento ya está ocupado. Por favor elija otro.");
            }

            System.out.println("¿Desea finalizar la reserva? S:(para Sí) N:(cualquier tecla NO)");
            respuesta = teclado.next();

            if (respuesta.equalsIgnoreCase("S")) {
                bandera = true;
            }
        }

        System.out.println("Gracias por usar el sistema de reservas.");
    }

}
