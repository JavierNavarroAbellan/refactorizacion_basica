/*public class Refactorización_3_Replace_Magic_Number_with_Symbolic_Constant {

private void totalMonedas() {
    int oro = 10;
    int plata = 3;
    int bronce = 7;
    int total = oro + plata + bronce;

    if (total > 120){
        
        System.out.println("Peso máximo");
    }

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

public class Refactorización_3_Replace_Magic_Number_with_Symbolic_Constant {

private void totalMonedas() {
    int oro = 10;
    int plata = 3;
    int bronce = 7;
    int total = oro + plata + bronce;
    int pesoMaximo = 120;
    
    if (total > pesoMaximo){
        
        System.out.println("Peso máximo");
    }

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