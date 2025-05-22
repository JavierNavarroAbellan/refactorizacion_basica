/**
 * Calcula el total a pagar por una factura, aplicando primero un descuento
 * al precio base recibido como parámetro y luego sumando un impuesto fijo.
 * Imprime un resumen con los valores aplicados y el total.
 */

public class CalculadoraFactura {

    public static void calcular(double precioBase, double descuento) {
        double porcentajeImpuestoFijo = 21.0; // porcentaje de impuesto fijo
        double porcentaje = 100;

        double p = precioBase - (precioBase * descuento / porcentaje);
        double calculo = (p * porcentajeImpuestoFijo / porcentaje);
        double total = p + (calculo);

        System.out.println("El precio base es: " + precioBase);
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Impuesto aplicado: " + porcentajeImpuestoFijo + "%");
        System.out.println("El total a pagar es: " + total);
    }
}
