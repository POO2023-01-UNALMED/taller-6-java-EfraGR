package vehiculos;
import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private int numeroVendidos;
    

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        numeroVendidos++;
    }

    // metodos

    public static Fabricante fabricaMayorVentas(){
        ArrayList<Fabricante> fabricantes = Vehiculo.getFabricantes(); 
        int mayorVendedor=0;
        Fabricante fabricaMayor = null;
        for (int i = 0;i<fabricantes.size();i++){
            Fabricante p_fabricante = fabricantes.get(i);
            if (p_fabricante.getNumeroVendidos()>mayorVendedor){
                mayorVendedor = p_fabricante.getNumeroVendidos();
                fabricaMayor = p_fabricante;
            }
        }

        return fabricaMayor;
    }


    // setters - getters

    public String getNombre() {
        return nombre;
    }
    public Pais getPais() {
        return pais;
    }

    public int getNumeroVendidos() {
        return numeroVendidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }

}
