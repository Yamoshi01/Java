import java.util.Scanner;
public class Quest3 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu peso(kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Digite a sua altura(em metros e com vírgula): ");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("O seu IMC é: %.2f\n",imc);
    }
}
