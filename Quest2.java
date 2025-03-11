import java.util.Scanner;
public class Quest2 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperatura em Celsius: ");
        double celcioportiolli = scanner.nextDouble();
        double fahr = (celcioportiolli + 32);
        System.out.print("Temperatura em Fahrenheit: " + fahr);
    }
}
