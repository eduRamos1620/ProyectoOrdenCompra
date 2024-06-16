import java.util.Date;

public class OrdenCompra {
    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    private static int ultimoId;

    public OrdenCompra(){
        this.id = ++ultimoId;
        this.productos = new Producto[4];
    }
}
