/**
 * Calcula el total a pagar por una factura, aplicando primero un descuento
 * al precio base recibido como parámetro y luego sumando un impuesto fijo.
 * Imprime un resumen con los valores aplicados y el total.
 */

public class CalculadoraFactura {

    public static void calcular(double precioBase, double descuento) {
        double porcentajeImpuestoFijo = 21.0; // porcentaje de impuesto fijo

        double p = precioBase - (precioBase * descuento / 100);
        double total = p + (p * porcentajeImpuestoFijo / 100);

        System.out.println("El precio base es: " + precioBase);
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Impuesto aplicado: " + porcentajeImpuestoFijo + "%");
        System.out.println("El total a pagar es: " + total);
    }
}
