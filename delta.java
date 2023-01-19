import java.util.Scanner;
import java.lang.Math;

public class delta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Obliczamy delte!\n");
        System.out.println("Podaj wartość A:");
        double a = input.nextDouble();
        System.out.println("Podaj wartość B:");
        double b = input.nextDouble();
        System.out.println("Podaj wartość C:");
        double c = input.nextDouble();

        double delta = b * b - 4 * a * c;
            if(delta < 0) {
                System.out.println("Delta < 0.");
                System.out.println("Brak rozwiązań w zbiorze liczb rzeczywistych.");
            } else if (delta == 0) {
                double deltaZero = - b / (2 * a);
                System.out.println(deltaZero);
            } else if (delta > 0) {
                double x1 = (- b + Math.sqrt(delta)) / (2 * a);
                double x2 = (- b - Math.sqrt(delta)) / (2 * a);
                String deltaX1 = String.format("%.2f", x1);
                String deltaX2 = String.format("%.2f", x2);
                System.out.println("x1 = " + deltaX1 + " x2 = " + deltaX2);
            }
        input.close();
    }
}
