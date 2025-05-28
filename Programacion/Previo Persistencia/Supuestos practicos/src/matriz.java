/*
Un programa que pida las dimensiones de una matriz de enteros,
-para mandar dichas dimensiones a un método que genere una matriz de esas dimensiones recibidas por parámetros
-y la rellene con números aleatorios entre 0 y 9, para después devolver dicha matriz.

//mostrarMatriz()
Debe haber un método que se encargue de recibir cualquier matriz de enteros y mostrar sus valores en pantalla.

//transponerMatriz()
Recibe una matriz de enteros, y genera una matriz transpuesta respecto a la recibida, la cual devolverá al finalizar.
(Intercambia filas por columnas)


El flujo de funcionamiento del programa debe ser el siguiente:

- Pedir los valores de las dimensiones de la matriz.
    Se debe insistir en caso de que alguna de las dimensiones no sea mayor de 1 (una matriz debe ser como mínimo de 2x2)

-Llamar al método para genera la matriz con datos aleatorios y recoger la matriz en el programa principal.
-Mostrar los datos de dicha matriz.
-Llamar al método que recibe la matriz original, y genera y devuelve la matriz transpuesta al programa principal.
-Mostrar los datos de la matriz transpuesta.
 */


import java.util.Random;
import java.util.Scanner;

public class matriz{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura, anchura;

        System.out.println("Introduzca las dimensiones de la matriz deseada");

        System.out.println("Altura: ");
        altura = teclado.nextInt();

        System.out.println("Anchura: ");
        anchura = teclado.nextInt();

        int[][] matriz = generarMatriz(altura, anchura);

        mostrarMatriz(matriz);

        int [][] matrizTranspuesta = transponerMatriz(matriz);
        mostrarMatriz(matrizTranspuesta);

    }


    public static int[][] generarMatriz(int altura, int anchura){
        Random random = new Random();
        int[][] matriz = new int[altura][anchura];

        //recorre cada columna
        for(int i = 0; i< altura; i++){
            //System.out.println("Columna: " + i);
            ///recorre cada fila de la columna
            for(int k = 0; k < anchura; k++){
                //System.out.println("Fila: " + k);
                matriz[i][k] = random.nextInt(11);
            }
        }


        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz){
        String fila;

        System.out.println("Matriz: ");
        //recorre cada columna
        for(int i = 0; i < matriz.length ; i++){
            fila = "{";
            ///recorre cada fila de la columna
            for(int k = 0;k< matriz[i].length; k++){
                if (k == matriz[i].length - 1){
                    fila = fila + matriz[i][k];
                }else{
                    fila = fila + matriz[i][k] + ", ";
                }

            }
            fila = fila + "}";
            System.out.println(fila);
        }

    }


    //Recibe matriz[y][x] y devuelve matrizTranspuesta = matriz[x][y]
    public static int[][] transponerMatriz(int[][] matriz){
        int[][] matrizAuxiliar =new int[matriz[0].length][matriz.length];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0;j< matriz[0].length; j++){
                matrizAuxiliar[j][i] = matriz [i][j];
            }
        }


        return matrizAuxiliar;
    }
}
