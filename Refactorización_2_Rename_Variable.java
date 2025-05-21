/*public class Refactorización {

private void totalMonedas() {
    int o = 10;
    int p = 3;
    int b = 7;
    int t = o + p + b;

    if (t > 0){
    
    System.out.println("Monedas de oro: " + o);
    
    System.out.println("Monedas de plata: " + p);
    
    System.out.println("Monedas de bronce: " + b);
    
    System.out.println("Monedas totales: " + t);

    }else{
        System.out.println("No tienes dinero");
    }
}
}*/

public class Refactorización_2_Rename_Variable {

public void totalMonedas() {
    int monedasOro = 10;
    int monedasPlata = 3;
    int monedasBronce = 7;
    int totalMonedas = monedasOro + monedasPlata + monedasBronce;

    if (totalMonedas > 0){
    
    System.out.println("Monedas de oro: " + monedasOro);
    
    System.out.println("Monedas de plata: " + monedasPlata);
    
    System.out.println("Monedas de bronce: " + monedasBronce);
    
    System.out.println("Monedas totales: " + totalMonedas);

    }else{
        System.out.println("No tienes dinero");
    }
}
}