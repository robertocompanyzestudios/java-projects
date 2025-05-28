public class Main {
    public static void main(String[] args) {
        Sensor misensor = new Sensor(0.8);
        Timbre miTimbre = new Timbre();
        Bombilla mibombilla = new Bombilla();



        Alarma mialarma = new Alarma(0.5, misensor, miTimbre);

        System.out.println(mialarma.sensor);
        System.out.println(mialarma.timbre);

        mialarma.comprobar();

        System.out.println(mialarma.sensor);
        System.out.println(mialarma.timbre);



        AlarmaLuminosa miAlarmaLuminosa = new AlarmaLuminosa(0.5, misensor, miTimbre, mibombilla);
        System.out.println(mialarma.sensor);
        System.out.println(mialarma.timbre);
        System.out.println(miAlarmaLuminosa.getBombilla());

        miAlarmaLuminosa.comprobar();


    }
}
