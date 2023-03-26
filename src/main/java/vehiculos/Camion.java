package vehiculos;

public class Camion extends Vehiculo{
    private int ejes;
    private static int cantidadCamiones;
    // private int puertas =2;
    // private double velocidadMaxima = 80;
    // private String traccion = "4X2";

    public Camion(String placa, String nombre, double precio, double peso, Fabricante fabricante, int ejes) {
        super(placa,2,80,nombre, precio, peso, "4X2",fabricante);
        this.ejes = ejes;
        cantidadCamiones++;
    }
    
    // getters
    public int getEjes() {
        return ejes;
    }

    public static int getCantidadCamiones() {
        return cantidadCamiones;
    }
    // public String getTraccion() {
    //     return traccion;
    // }
    // public int getPuertas() {
    //     return puertas;
    // }
    // public double getVelocidadMaxima() {
    //     return velocidadMaxima;
    // }

    //setters
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
    // public void setPuertas(int puertas) {
    //     this.puertas = puertas;
    // }
    // public void setTraccion(String traccion) {
    //     this.traccion = traccion;
    // }
    // public void setVelocidadMaxima(double velocidadMaxima) {
    //     this.velocidadMaxima = velocidadMaxima;
    // }
}
