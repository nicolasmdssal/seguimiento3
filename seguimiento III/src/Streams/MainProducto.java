package Streams;
import java.util.*;
import java.util.stream.Collectors;

public class MainProducto {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
                new Producto("Laptop", 1200),
                new Producto("Mouse", 20),
                new Producto("Teclado", 45),
                new Producto("Monitor", 150),
                new Producto("USB", 15)
        );

        List<String> nombresProductosCaros = productos.stream()
                .filter(producto -> producto.getPrecio() > 50)
                .map(Producto::getNombre)
                .collect(Collectors.toList());

        System.out.println("Productos caros: " + nombresProductosCaros);
    }
}
