import com.sun.security.jgss.GSSUtil;

import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra compra1 = new OrdenCompra("Compras de bebé");
        OrdenCompra compra2 = new OrdenCompra("Compras de papá");
        OrdenCompra compra3 = new OrdenCompra("Compras de mamá");

        compra1.setFecha(new Date());
        compra1.setCliente(new Cliente("Charles", "Ramos"));
        compra1.addProducto(new Producto("Sabritas", "Papas", 15));
        compra1.addProducto(new Producto("Nestle", "Nan", 647));
        compra1.addProducto(new Producto("BBTips", "Pañakes", 450));
        compra1.addProducto(new Producto("Gerber", "Agua 4L", 130));

        compra2.setFecha(new Date());
        compra2.setCliente(new Cliente("Eduardo", "Ramos"));
        compra2.addProducto(new Producto("Coca cola", "Refresco", 35));
        compra2.addProducto(new Producto("Capcom", "Resident evil4", 1299));
        compra2.addProducto(new Producto("Kaspersky", "Antivirus", 749));
        compra2.addProducto(new Producto("Charles Ans", "Concierto", 1349));

        compra3.setFecha(new Date());
        compra3.setCliente(new Cliente("Naomi", "Gonzalez"));
        compra3.addProducto(new Producto("Turin", "Conejos turin", 247));
        compra3.addProducto(new Producto("Magdonas", "Hamburguesa", 99));
        compra3.addProducto(new Producto("Burget King", "Papas", 60));
        compra3.addProducto(new Producto("Sams", "Hot Dog", 49));

        OrdenCompra[] compras = {compra1, compra2, compra3};

        for (OrdenCompra orden: compras){
            System.out.println("Folio: " + orden.getId());
            System.out.println("Cliente: " + orden.getCliente());
            System.out.println("Descripcion: " + orden.getDescripcion());
            System.out.println("Fecha de compra: " + orden.getFecha());
            System.out.println("Total: " + orden.getSumaTotal());
        }
    }
}
