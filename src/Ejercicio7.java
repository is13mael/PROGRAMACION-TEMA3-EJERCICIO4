public class Ejercicio7 {
    public static void main(String[] args){
        System.out.print("Introduzca la base imponible: ");
        System.out.print(" (precio del artículo sin IVA): ");
        double baseImponible = Double.parseDouble(System.console().readLine());
        System.out.printf("%nBase imponible%8.2f €%n", baseImponible);
        System.out.printf("IVA (21%%) %12.2f €%n", baseImponible);
        System.out.printf("────────────────────────%n");
        System.out.printf("Total%17.2f%n", (baseImponible * 1.21));
    }
}
