import java.util.Scanner;

public class ChequeaDivisor {
    public int numero;   // número a verificar
    public int divisor;  // divisor para comprobar el múltiplo

    // Método que verifica si 'numero' es múltiplo de 'divisor'
    public boolean esMultiplo() {
        if (divisor == 0) {
            return false; // evitar división por cero
        }
        return (numero % divisor == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ChequeaDivisor checker = new ChequeaDivisor();

        System.out.print("Ingresa un número: ");
        checker.numero = scanner.nextInt();

        System.out.print("Ingresa el número para verificar si es múltiplo: ");
        checker.divisor = scanner.nextInt();

        if (checker.esMultiplo()) {
            System.out.println(checker.numero + " es múltiplo de " + checker.divisor);
        } else {
            System.out.println(checker.numero + " NO es múltiplo de " + checker.divisor);
        }

        scanner.close();
    }
}
