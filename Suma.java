import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== PROGRAMA SUMA DE DOS NÚMEROS ===");
        
        //  primer número
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();
        
        //  segundo número
        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();
        
        // Calcular suma
        double resultado = numero1 + numero2;
        
        // Mostrar resultado
        System.out.println("\n--- RESULTADO ---");
        System.out.println(numero1 + " + " + numero2 + " = " + resultado);
        
        scanner.close();
    }
}