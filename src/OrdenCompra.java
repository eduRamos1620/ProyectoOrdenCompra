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

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void addProducto(Producto producto){

    }
}
