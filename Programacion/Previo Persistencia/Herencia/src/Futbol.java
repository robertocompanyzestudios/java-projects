public class Futbol extends  Deporte implements Entrenamiento, Equipamiento{


    public Futbol(){
        super("Futbol");
    }

    @Override
    public void jugar() {
        System.out.println("Vamos a jugar al futbol");
    }

    @Override
    public void entrenar(){
        System.out.println("Vamos a entrenar al futbol");
    }


    @Override
    public void necesitarEquipamiento() {
        System.out.println("Necesitas un balón, ropa y botas de futbol");
    }

    @Override
    public void prepararEquipamiento() {
        System.out.println("Estamos recogiendo el balón y limpiando las botas");

    }

    @Override
    public void comer(){
        System.out.println("comida");
    }
}
