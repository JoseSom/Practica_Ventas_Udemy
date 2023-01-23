package ventas;

import com.gm.ventas.Orden;
import com.gm.ventas.Producto;

public class Ventas {
    public static void main(String[] args) {
        Orden miPrimerOrden = new Orden();

        Producto cajeta = new Producto("Cajeta",4.50);

        miPrimerOrden.agregarProducto(cajeta);
        miPrimerOrden.mostrarOrden();
        System.out.println(miPrimerOrden.calcularTotal());;
    }
}
