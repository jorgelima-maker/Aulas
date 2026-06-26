import java.util.Scanner;
import java.util.InputMismatchException;

public class Excecoes1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. there);
        double numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Digite um número: ");
                // Lendo a entrada como String e convertendo ou usando nextDouble
                numero = Double.parseDouble(scanner.nextLine().replace(",", "."));
                entradaValida = true; // Se chegar aqui, o número é válido
            } catch (NumberFormatException e) {
                System.out.println("Opa... Acho que você se enganou! Digite novamente...");
                System.out.println("Erro técnico: " + e.getMessage());
            }
        }

        double quadrado = numero * numero;
        System.out.println("O quadrado de " + numero + " é: " + quadrado);
        
        scanner.close();
    }
}
