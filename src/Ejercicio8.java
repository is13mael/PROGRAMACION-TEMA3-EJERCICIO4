public class Ejercicio8 {
    public static void main(String[] args){
        System.out.print("Introduzca el número de horas");
        System.out.print(" trabajadas durante la semana: ");
        int horasTrabajadas = Integer.parseInt(System.console().readLine());
        System.out.print("Su salario anual es de ");
        System.out.println((horasTrabajadas * 12) + " euros.");
    }
}
