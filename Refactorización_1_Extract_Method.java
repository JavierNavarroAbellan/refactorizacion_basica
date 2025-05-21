
/*public class Refactorización_1_Extract_Method {

private void totalMonedas() {
    int oro = 10;
    int plata = 3;
    int bronce = 7;
    int total = oro + plata + bronce;

    if (total > 0){
    
    System.out.println("Monedas de oro: " + oro);
    
    System.out.println("Monedas de plata: " + plata);
    
    System.out.println("Monedas de bronce: " + bronce);
    
    System.out.println("Monedas totales: " + total);

    }else{
        System.out.println("No tienes dinero");
    }
}
}*/

public class Refactorización_1_Extract_Method {

public void totalMonedas() {
    mostrarDinero();
}

private void mostrarDinero() {
    int oro = 10;
    int plata = 3;
    int bronce = 7;
    int total = oro + plata + bronce;

    if (total > 0){
    
    System.out.println("Monedas de oro: " + oro);
    
    System.out.println("Monedas de plata: " + plata);
    
    System.out.println("Monedas de bronce: " + bronce);
    
    System.out.println("Monedas totales: " + total);

    }else{
        System.out.println("No tienes dinero");
    }

}
}