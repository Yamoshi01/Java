public class Quest6 {
    public static void main (String [] args){
        double a = 1, b = 12, c = -13;
        double triangulodelta = b * b - 4 * a * c;
        System.out.println("Delta é igual a: " + triangulodelta);

        if (triangulodelta < 0) {
            System.out.println("A equação não possui raízes reais.");

        } else {
            double raiz1 = (-b + Math.sqrt(triangulodelta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(triangulodelta)) / (2 * a);
            System.out.println("Raiz x1 é: " + raiz1);
            System.out.println("Raiz x2 é: " + raiz2);
        }
    }
}
