import java.util.Scanner;
public class Quest4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
        System.out.println("Ao quadrado: " + (numero * numero));
        System.out.println("Ao cubo: " + (numero * numero * numero));

    }
}
