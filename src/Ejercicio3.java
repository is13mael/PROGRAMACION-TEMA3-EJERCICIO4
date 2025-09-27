public class Ejercicio3 {
    public static void main(String[] args){
        System.out.print("Introduce la cantidad de pesetas a convertir: ");
        int pesetas = Integer.parseInt(System.console().readLine());

        double euros = pesetas / 166.386 ;
        System.out.printf("%d pesetas son %.2f euros %n", pesetas, euros);
    }
}
