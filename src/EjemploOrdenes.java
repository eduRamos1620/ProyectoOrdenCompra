public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra compra1 = new OrdenCompra();
        OrdenCompra compra2 = new OrdenCompra();
        OrdenCompra compra3 = new OrdenCompra();

        compra1.setCliente(new Cliente("Charles", "Ramos"));
        compra1.addProducto(new Producto("Sabritas", "Papas", 15));

        compra2.setCliente(new Cliente("Eduardo", "Ramos"));
        compra2.addProducto(new Producto("Coca cola", "Refresco", 35));

        compra3.setCliente(new Cliente("Naomi", "Gonzalez"));
        compra3.addProducto(new Producto("Turin", "Conejos turin", 247));
    }
}
