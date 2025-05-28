package documentos.RRHH;

import java.util.Scanner;

public class CrearDocumento {
    public static void main(String[] args) {
        int eleccion;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Elija que documento desea crear: " +
                "\n1. Documento" +
                "\n2. Curriculum Vitae" +
                "\n3. Contrato");
        eleccion = teclado.nextInt();

        switch (eleccion){
            case 1:
                Documento miDocumento = new Documento("Erase una vez...");
                break;
            case 2:
                CV miCurricullum = new CV("Tecnico en sistemas microinformaticos y redes", "Roberto Company Zomeño", "roberto1234@gmail.com" , 123456789, 20);
                break;
            case 3:
                Contrato miContrato = new Contrato("Contrato para explotar laboralmente a otro trabajador", "Roberto Company", "Burguer king");
                break;
        }

    }
}
