public class Ejercicio2 {
    public static void main(String[] args){
        System.out.print("Por favor,");
        System.out.print("introduzca la cantidad de euros");
        System.out.printf(" que quiere convertir: ");
        double euros = Double.parseDouble(System.console().readLine());

        int pesetas = (int) (euros * 166.386);

        System.out.printf("%.2f euros son %d pesetas.%n", euros, pesetas);
    }
}
