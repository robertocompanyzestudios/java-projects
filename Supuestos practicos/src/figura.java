/*
* Un programa que pida el número de línea de altura de una figura, la cual es rectángular, y
* mandará ese número como parámetro a un método llamado "figura",
* el cual devolverá un String con la figura rectángular.
*
* Roberto Company Zomeno
*/

import java.util.Scanner;


public class figura {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la altura deseada para su rectangulo: ");
        int altura = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Introduzca el caracter deseado para construir el rectangulo");
        String caracter = teclado.nextLine();

        System.out.println();
        System.out.println(figura(altura, caracter));

        teclado.close();

    }

    public static String figura(int altura, String caracter){
        String rectangulo = "";
        boolean enRango = true;
        int espacios = 0;
        int anchura = 0;

        if(altura >= 3 && altura <= 6){
            espacios = 5;

        }else if(altura >= 7 && altura <= 12){
            espacios = 7;
        }else if(altura >= 13 && altura <= 15){
            espacios = 9;
        }else{
            System.out.println("------ERROR-------");
            System.out.println("Altura fuera de rango");
            enRango = false;

        }

        if(altura >= 3 && altura <= 5){
            anchura = 5;

        }else if(altura >= 6 && altura <= 8){
            anchura = 5;
        }else if(altura >= 9 && altura <= 12){
            anchura = 7;
        }else if(altura >= 13 && altura <= 15){
            anchura = 9;
        }

        if (enRango){
            for(int i = 0; i < altura; i++) {
                //Espacios antes de cada linea
                for (int k = 0; k < espacios; k++) {
                    rectangulo = rectangulo + " ";
                }

                //primera y ultima fila
                if (i == 0 || i == altura - 1) {
                    for (int k = 0; k < anchura; k++) {
                        rectangulo = rectangulo + caracter;
                    }
                    //demás lineas
                } else {
                    for (int k = 0; k < anchura; k++) {
                        if (k == 0 || k == anchura - 1) {
                            rectangulo = rectangulo + caracter;
                        } else {
                            rectangulo = rectangulo + " ";
                        }

                    }
                }
                rectangulo = rectangulo + "\n";

            }
        }


        return rectangulo;
    }
}
