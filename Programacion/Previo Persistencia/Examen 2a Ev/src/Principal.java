import java.io.File;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //1
        Cliente[] clientes = importarClientes();
        //2
        mostrarClientes(clientes);
        //3
        System.out.println("Clientes vacíos: " + contarClientesVacios(clientes));

        //4

        for (int i = 0; i<2; i++){
            Cliente micliente = pedirCliente();
            clientes = agregarCliente(clientes, micliente);
        }


        //5
        mostrarClientes(clientes);

        //6
        System.out.println("Total descuentos: " + sumatotalDescuentos(clientes, "normal"));
        System.out.println("Media descuentos: " + mediaTotalDescuentos(clientes, "normal"));

        //7
        clientes = eliminarCliente(clientes,  3);

        //8
        mostrarClientes(clientes);

        //9
        System.out.println("Total ingresos cuotas: " + calcularTotalCuotas(clientes));

        //10
        System.out.println("Fin del programa");
        System.exit(0);


    }

    /**
     * Accede a la base de datos(fichero), carga los usuarios y los almacena en un array de tipo Cliente
     * @return Un array de tipo Cliente con usuarios
     */
    public static Cliente[] importarClientes() {
        try {
            File bd = new File("./files/clientes.txt");
            Scanner lector = new Scanner(bd);

            //separamos Cada usuario
            String[] clientesinfo = lector.nextLine().split(";");
            //Preparamos el array que almacenará los usuarios
            Cliente[] clientes = new Cliente[clientesinfo.length+2];

            //Aislamos los datos de cada usuario e inicializamos cada uno en el array
            for (int i = 0; i < clientesinfo.length; i++) {
                if(clientesinfo[i] == null) {
                    continue;
                }
                String[] datosSeparados = clientesinfo[i].split("#");
                String nombre = datosSeparados[0];
                String apellidos = datosSeparados[1];
                String nif = datosSeparados[2];
                String direccion = datosSeparados[3];
                String email = datosSeparados[4];
                String telefono = datosSeparados[5];
                String fecha_alta = datosSeparados[6];
                String tipo = datosSeparados[7];
                String descuento = datosSeparados[8];
                String matricula = datosSeparados[9];
                clientes[i] = new Cliente(nombre, apellidos, nif, direccion, email, telefono, fecha_alta, tipo, descuento, matricula);
            }

            return clientes;

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    /**
     * Imprime los Clientes de un Array de tipo Cliente
     * @param clientes
     */
    public static void mostrarClientes(Cliente[] clientes) {
        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i] != null) {
                System.out.print("\nCliente " + i);
                System.out.println(clientes[i]);
            } else {
                continue;
            }

        }
    }

    /**
     * Añade un cliente a la primera posición que encuentre libre en un Array de tipo Cliente,
     * si no encuentra ninguna posición libre no hace nada
     * @param clientes Array de tipo Cliente
     * @param cliente Objeto de tipo Cliente
     * @return El array con el cliente añadido
     */
    public static Cliente[] agregarCliente(Cliente[] clientes, Cliente cliente) {
        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i] == null) {
                clientes[i] = cliente;
                return clientes;
            }
        }
        return clientes;
    }

    /**
     * Pide los datos necesarios para crear un Objeto Cliente y lo instancia
     * @return Un objeto Cliente
     */
    public static Cliente pedirCliente(){
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String nombre = lector.nextLine();
        System.out.print("Ingrese los apellidos: ");
        String apellidos = lector.nextLine();
        System.out.print("Ingrese el nif: ");
        String nif = lector.nextLine();
        System.out.print("Ingrese la direccion: ");
        String direccion = lector.nextLine();
        System.out.print("Ingrese el email: ");
        String email = lector.nextLine();
        System.out.print("Ingrese el telefono: ");
        String telefono = lector.nextLine();
        System.out.print("Ingrese la fecha de alta: ");
        String fecha_alta = lector.nextLine();
        System.out.print("Ingrese el tipo de cliente: ");
        String tipo = lector.nextLine();
        System.out.print("Ingrese el descuento: ");
        String descuento = lector.nextLine();
        System.out.print("Ingrese la matricula: ");
        String matricula = lector.nextLine();

        Cliente cliente1 = new Cliente(nombre, apellidos, nif, direccion, email, telefono, fecha_alta, tipo, descuento, matricula);
        return cliente1;

    }

    /**
     * Cuenta las celdas vacías de un array de tipo Cliente
     * @param clientes
     * @return
     */
    public static int contarClientesVacios(Cliente[] clientes) {
        int contador = 0;
        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i] == null) {
                contador++;
                continue;
            }
        }
        return contador;
    }

    /**
     * Suma los descuentos de los Clientes del tipo que recibe
     * @return
     */
    public static Double sumatotalDescuentos(Cliente[] clientes, String tipo){
        Double total = 0.0;
        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i] == null) {
                continue;
            }
            if (clientes[i].getTipo().equals(tipo)) {
                total += Double.parseDouble(clientes[i].getDescuento());
            }
        }
        return total;
    }

    public static Double mediaTotalDescuentos(Cliente[] clientes, String tipo){
        Double total = 0.0;
        int n = 0;
        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i] == null) {
                continue;
            }
            if (clientes[i].getTipo().equals(tipo)) {
                total += Double.parseDouble(clientes[i].getDescuento());
                n++;
            }
        }
        double mediaDescuentos = total / n;
        return mediaDescuentos;
    }

    /**
     * Elimina el cliente en la posicion del indice que recibe
     * @param clientes
     * @param index
     * @return Un array de tipo Cliente sin el Cliente
     */
    public static Cliente[] eliminarCliente(Cliente[] clientes , int index) {
        clientes[index] = null;
        return clientes;
    }

    /**
     * Calcula el total de ingresos recibido de las cuotas de los clientes
     * @param clientes
     * @return el total de cuotas - el total de descuentos
     */
    public static Double calcularTotalCuotas(Cliente[] clientes) {
        Double total = 0.0;
        Double cuota = 500.0;

        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i] == null) {
                continue;
            }
            Double descuento = Double.parseDouble(clientes[i].getDescuento());
            Double resto = cuota -descuento;
            total += resto;

        }

        return total;
    }
}