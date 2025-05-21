/*public class Refactorización_5_Inline_Variable {

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

public class Refactorización_5_Inline_Variable {

    public void Monedas() {
        int oro = 10;
        int plata = 3;
        int bronce = 7;

        double descuento = 0.1;

        System.out.println("Total sin descuento: " + ((oro * 100.0) + (plata * 50.0) + (bronce * 10.0)));
        System.out.println("Total con descuento: " + (((oro * 100.0) + (plata * 50.0) + (bronce * 10.0)) * (1 - descuento)));
    }
}

