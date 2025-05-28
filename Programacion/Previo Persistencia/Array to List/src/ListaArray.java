public class ListaArray {
    private Object[] arrayElementos;
    private int numElementos;
    private static final int TAMANYO_INICIAL = 4;


    public ListaArray() {
        arrayElementos = new Object[TAMANYO_INICIAL];
        numElementos = 0;


    }

    public int size(){
        return numElementos;
    }

}
