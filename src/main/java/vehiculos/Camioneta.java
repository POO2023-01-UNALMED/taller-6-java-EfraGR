package vehiculos;

public class Camioneta extends Vehiculo{
    private boolean volco;
    private static int cantidadCamionetas;
    // private double velocidadMaxima = 90;
    // private String traccion = "4X4";

    public Camioneta(String placa, int puertas,String nombre,
    double precio, double peso, Fabricante fabricante,boolean volco) {
        super(placa,puertas,90, nombre,precio, peso,"4X4", fabricante);
        this.volco = volco;
        cantidadCamionetas++;
    }

    // getters

    // public String getTraccion() {
    //     return traccion;
    // }
    // public double getVelocidadMaxima() {
    //     return velocidadMaxima;
    // }

    public boolean isVolco(){
        return volco;
    }

    public static int getCantidadCamionetas() {
        return cantidadCamionetas;
    }
    
    // setter

    // public void setTraccion(String traccion) {
    //     this.traccion = traccion;
    // }
    // public void setVelocidadMaxima(double velocidadMaxima) {
    //     this.velocidadMaxima = velocidadMaxima;
    // }
    public void setVolco(boolean volco) {
        this.volco = volco;
    }

}
