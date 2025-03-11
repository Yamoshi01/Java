import java.util.Scanner;
public class Quest5 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da base do triângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + area);
    }
}
