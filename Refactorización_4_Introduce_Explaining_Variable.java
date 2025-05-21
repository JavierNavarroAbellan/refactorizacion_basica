/*public class Refactorización_4_Introduce_Explaining_Variable {

    public void Monedas() {
        int oro = 10;
        int plata = 3;
        int bronce = 7;

        double total = (oro * 100.0) + (plata * 50.0) + (bronce * 10.0);
        double descuento = 0.1;
        double totalConDescuento = total * (1 - descuento);

        System.out.println("Total sin descuento: " + total);
        System.out.println("Total con descuento: " + totalConDescuento);
    }
}*/

public class Refactorización_4_Introduce_Explaining_Variable {

    public void Monedas() {
        int cantidadOro = 10;
        int cantidadPlata = 3;
        int cantidadBronce = 7;

        double valorOro = cantidadOro * 100.0;
        double valorPlata = cantidadPlata * 50.0;
        double valorBronce = cantidadBronce * 10.0;

        double valorTotal = valorOro + valorPlata + valorBronce;

        double descuento = 0.1;
        double valorTotalConDescuento = valorTotal * (1 - descuento);

        System.out.println("Total sin descuento: " + valorTotal);
        System.out.println("Total con descuento: " + valorTotalConDescuento);
    }
}