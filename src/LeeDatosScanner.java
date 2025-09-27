import java.util.Scanner;

public class LeeDatosScanner {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = s.nextLine();

        System.out.print("Introduce tu edad: ");
        int edad = Integer.parseInt(s.nextLine());

        System.out.print("Tu nombre es: " + nombre);
        System.out.println(" y tienes " + edad + " años.");
    }    
}
