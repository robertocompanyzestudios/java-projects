import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una palabra/frase y presione la tecla enter");
        Stack<Character> pilaDatos = new Stack<Character>();

        for (char i: teclado.nextLine().toCharArray()){
            pilaDatos.push(i);
        }

        while(pilaDatos.size()>0){
            System.out.print(pilaDatos.pop());


        }



    }
}
