package vehiculos;

public class Automovil extends Vehiculo{
    private int puestos;
    private static int cantidadAutomoviles;
    // private int puertas = 4;
    // private double velocidadMaxima=100;
    // private String traccion="FWD";

    public Automovil(String placa, String nombre, double precio, double peso, Fabricante fabricante,int puestos) {
        super(placa,4,100,nombre,  precio,peso,"FWD", fabricante);
        this.puestos = puestos;
        cantidadAutomoviles++;
    }

    // getters

    // public int getPuertas() {
    //     return puertas;
    // }
    public int getPuestos() {
        return puestos;
    }

    public static int getCantidadAutomoviles() {
        return cantidadAutomoviles;
    }
    // public String getTraccion() {
    //     return traccion;
    // }
    // public double getVelocidadMaxima() {
    //     return velocidadMaxima;
    // }

    // setters

    // public void setPuertas(int puertas) {
    //     this.puertas = puertas;
    // }
    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
    // public void setTraccion(String traccion) {
    //     this.traccion = traccion;
    // }
    // public void setVelocidadMaxima(double velocidadMaxima) {
    //     this.velocidadMaxima = velocidadMaxima;
    // }


}