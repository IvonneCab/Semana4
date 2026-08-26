import com.uped.proyecto.modelo.*;
import java.time.LocalDate;
public class Main {
    static void main(String[] args) {

        System.out.println("--- 5.1 Bloque Instancia ---");
        Pedido pedido = new Pedido(101);

        System.out.println("\n--- 5.2 & 5.3 Cascadas y Fábrica ---");
        Suscripcion s1 = new Suscripcion("ana");
        System.out.println(s1);
        Suscripcion s2 = Suscripcion.premium("carlos");
        System.out.println(s2);

        System.out.println("\n--- 5.4 Builder ---");
        ConfiguracionReporte config = new ConfiguracionReporte.Builder()
                .incluirGraficos(true)
                .build();
        System.out.println(config);

        System.out.println("\n--- 6.1 Copia Defensiva ---");
        Carrito carrito = new Carrito();
        carrito.agregar("Café");
        carrito.agregar("Azúcar");
        carrito.getItems().clear(); // Solo limpia la copia
        System.out.println("Items en el carrito: " + carrito.getItems().size());

        System.out.println("\n--- 6.2 Inmutabilidad ---");
        Empleado empleado = new Empleado("04512378-9", "Analista");
        System.out.println(empleado);
        empleado.ascender("Analista Senior");
        System.out.println(empleado);

        Punto original = new Punto(2, 3);
        Punto movido = original.mover(1, 1);
        System.out.println("Original: " + original);
        System.out.println("Movido: " + movido);

        System.out.println("\n--- 7. Integrador LibroBiblioteca ---");
        var l1 = new LibroBiblioteca("Clean Code", "R. Martin", 3);
        var l2 = LibroBiblioteca.unico("Effective Java", "J. Bloch");
        l1.prestar();
        l2.prestar();
        l2.prestar();

        System.out.println("\n--- 8.2 Vehiculo Completo ---");
        Vehiculo v1 = Vehiculo.nuevo("P123-789", "Kia");
        System.out.println(v1);
        v1.recorrer(150);
        System.out.println(v1);
        v1.recorrer(-20);
    }

}
