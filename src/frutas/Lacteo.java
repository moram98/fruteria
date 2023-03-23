package frutas;

public class Lacteo  extends Producto {
    private  int cantidad;
    private int proteinas;

    public Lacteo(String nombre, Double precio, int catidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = catidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCatidad(int catidad) {
        this.cantidad = catidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    @Override
    public String toString(){
        return "cantidad: " + cantidad + ", proteinas: " + proteinas + super.toString();
    }
}
