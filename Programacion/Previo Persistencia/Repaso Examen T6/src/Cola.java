import java.util.LinkedList;

public class Cola {
    private LinkedList<Coche> colaCoches;

    public Cola(){
        this.colaCoches = new LinkedList<>();
    }

    @Override
    public String toString(){
        int n = 0;
        String coches = "";
        for (Coche i : colaCoches){
            n++;
            coches = coches + n + "-" + i.toString();
        }
        return coches;
    }

    public static class Coche{
        private String nombre;

        public Coche(String nombre){
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return "Coche:" +
                    " nombre=" + nombre + "\n";
        }
    }

    public boolean isEmpty(){
        return colaCoches.isEmpty();

    }

    public void offer(Coche coche){
        colaCoches.add(coche);
    }

    public Coche poll(){
        if (!isEmpty()){
            return (colaCoches.poll());
        } else{
            return null;
        }
    }

    public Coche peek(){
        if (!isEmpty()){
            return (colaCoches.peek());
        } else {
            return null;
        }
    }

    public int size(){
        return colaCoches.size();
    }

}
