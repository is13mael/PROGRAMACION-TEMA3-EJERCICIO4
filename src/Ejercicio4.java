public class Ejercicio4 {
    public static void main(String[] args){
        double x;
        double y;
        String linea;

        System.out.print("Por favor, introduzca el primer número: ");
        linea = System.console().readLine();
        x = Double.parseDouble(linea);
        System.out.print("Introduce el segundo número: ");
        linea = System.console().readLine();
        y = Double.parseDouble(linea);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x * y = " + (x * y));
    }
}
