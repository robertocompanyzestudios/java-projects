import java.util.Scanner;

public class Numerar {

    public static int[][] secuenciaNaturalIntA(int size){
        int[][] matriz = new int[size][size];

        int contador = 1;
        for(int i = 0; i < matriz.length;i++ ){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[j][j] = contador;
                contador++;
              }
        }



        return matriz;
    }

    public static int[][] secuenciaNaturalIntB(int size){
        int[][] matriz = new int[size][size];



        return matriz;
    }

    public static int[][] secuenciaNaturalIntC(int size){
        int[][] matriz = new int[size][size];

        int posicion = 1;
        for(int vuelta = 1; vuelta < matriz.length + 1; vuelta++){
            for (int i = matriz.length-vuelta, j = 0;i <4; i++, j++){
                matriz[i][j] = posicion;
                posicion++;
            }
        }


        return matriz;
    }


    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("De que tamaño desea la matriz: ");
        int[][] matriz = secuenciaNaturalIntC(teclado.nextInt());
        mostrarMatriz(matriz);



    }
}
