public class Main{
    public static void main(String[] args) {
        Cola colaCarretera = new Cola();

        System.out.println("Entra 1");
        colaCarretera.offer(new Cola.Coche("Ford mustang"));
        System.out.println(colaCarretera.toString());

        System.out.println("Entra 2");
        colaCarretera.offer(new Cola.Coche("Ferrari Roma"));
        System.out.println(colaCarretera.toString());

        System.out.println("Entra 3");
        colaCarretera.offer(new Cola.Coche("Ford Fiesta"));
        System.out.println(colaCarretera.toString());

        System.out.println("Entra 4");
        colaCarretera.offer(new Cola.Coche("Honda Civic"));
        System.out.println(colaCarretera.toString());

        System.out.println(colaCarretera.toString());

        System.out.println("Primero en la cola");
        colaCarretera.peek();
        System.out.println(colaCarretera.toString());

        System.out.println("Sale 1");
        System.out.println("Primero en la cola");
        colaCarretera.poll();
        colaCarretera.peek();
        System.out.println(colaCarretera.toString());

        System.out.println(colaCarretera.toString());
    }
}