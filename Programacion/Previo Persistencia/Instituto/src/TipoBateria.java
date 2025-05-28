public enum TipoBateria {
    IONLI("IonLi"),
    NIMH("NiMH"),
    NICD("NiCd");

    private final String valor;

    TipoBateria(String valor){
        this.valor = valor;
    }

    public String getValor(){
        return valor;
    }
}
