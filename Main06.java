import java.util.Scanner;
public class Main06 {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Proszę podać swoje imię:");
        String name = input.next();
        System.out.println("Witaj " + name + "!\n");

        System.out.println("Podaj swój wiek:");
        int age = input.nextInt();
        System.out.println("");
        System.out.println("Podaj swoją pensję miesięczną (brutto):");
        double salary = input.nextDouble();
        System.out.println("");
        System.out.println("Imię: " + name);
        System.out.println("Wiek: " + age);
        double salaryBrutto = (salary * 12);
        double salaryNetto = (salary * 12) / 1.23;
        String salaryNet = String.format("%.2f", salaryNetto);
        System.out.println("Pensja roczna (netto): " + salaryNet + " zł.");
        System.out.println("Pensja roczna (brutto): " + salaryBrutto + " zł.");
        double salaryDiff = (salaryBrutto - salaryNetto);
        String salaryDif = String.format("%.2f", salaryDiff);
        System.out.println("Państwo okradło Cię na: " + salaryDif + " zł w skali roku.");
        input.close();
    }
}