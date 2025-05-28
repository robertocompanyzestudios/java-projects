import java.io.File;
import java.util.Scanner;

public class Main {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        Ahorcado miAhorcado;
        boolean continuar = true;

        while (continuar){
            System.out.println("1 - Nuevo Juego");
            System.out.println("2 - Ver Ranking");
            System.out.println("0 - Finalizar");
            System.out.println("Seleccione una opcion: ");
            String eleccion = teclado.nextLine();

            switch (eleccion){
                case "1":
                    //Nueva partida
                    System.out.println("Introduzca su nombre: ");
                    eleccion=teclado.nextLine();
                    miAhorcado = new Ahorcado(eleccion);

                    System.out.println("Seleccione la dificultadd");
                    System.out.println("1 - Facil");
                    System.out.println("2 - Normal");
                    System.out.println("3 - Dificil");
                    eleccion = teclado.nextLine();

                    switch (eleccion){
                        case "1":
                            System.out.println(miAhorcado.nuevoJuego("facil"));
                            break;
                        case "2":
                            miAhorcado.nuevoJuego("normal");
                            break;
                        case "3":
                            miAhorcado.nuevoJuego("dificil");
                            break;
                        default:
                            System.out.println("Eleccion fuera de rango");
                    }



                    break;
                case "2":
                    //Mostrar ranking

                    break;
                case "0":
                    //Finalizar
                    continuar = false;
                    break;

                default:
                    System.out.println("Eleccion fuera de rango");

            }
        }




    }





}
