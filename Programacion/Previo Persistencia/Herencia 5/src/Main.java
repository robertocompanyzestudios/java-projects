import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo;
        ArrayList<Triangulo> triangulos = new ArrayList<>();

        triangulo  = new Triangulo(3.0, 5.0);
        triangulos.add(triangulo);
        triangulo  = new Triangulo(5.0, 5.0);
        triangulos.add(triangulo);
        triangulo  = new Triangulo(3.0, 3.0);
        triangulos.add(triangulo);
        triangulo  = new Triangulo(3.0, 7.0);
        triangulos.add(triangulo);
        triangulo  = new Triangulo(1.0, 5.0);
        triangulos.add(triangulo);
        triangulo  = new Triangulo(6.0, 5.0);
        triangulos.add(triangulo);
        triangulo  = new Triangulo(3.0, 5.0);
        triangulos.add(triangulo);
        triangulo  = new Triangulo(9.0, 5.0);
        triangulos.add(triangulo);
        triangulo  = new Triangulo(1.0, 9.0);
        triangulos.add(triangulo);
        triangulo  = new Triangulo(3.0, 6.0);
        triangulos.add(triangulo);

        int n = 0;
        Double total = 0.0;
        for(Triangulo i : triangulos){
            total = total + i.calcularArea();
            n++;
        }

        Double media = total / n;
        System.out.println("Media: " + media);



    }
}
