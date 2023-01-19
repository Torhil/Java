import java.util.Scanner;
import java.lang.Math;

public class delta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Obliczamy delte!\n");
        System.out.println("Podaj wartość A:");
        int a = input.nextInt();
        System.out.println("Podaj wartość B:");
        int b = input.nextInt();
        System.out.println("Podaj wartość C:");
        int c = input.nextInt();

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
