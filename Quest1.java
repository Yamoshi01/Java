import java.util.Scanner;
public class Quest1 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperatura em Fahrenheit: ");
        double fahr = scanner.nextDouble();
        double celcioportiolli = (fahr - 32);
        System.out.print("Temperatura em celsius: " + celcioportiolli);
    }
}
