import java.util.Scanner;

/**
 * easy calculator
 */
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char znak;

        System.out.println("wprowadź pierwszą liczbę:");
        int a = input.nextInt();
        System.out.println("wprowadź drugą liczbę:");
        int b = input.nextInt();
        System.out.println("Jeśli chcesz dodać liczby wciśnij '+'.");
        System.out.println("Jeśli chcesz odjąć liczby wciśnij '-'.");
        System.out.println("Jeśli chcesz pomnożyć liczby wciśnij '*'.");
        System.out.println("Jeśli chcesz podzielić liczby wciśnij '/'.");

        znak = input.next().charAt(0);
        switch(znak)
        {
            case '+':
            {
                System.out.println(a + b);
                break;
            }
            case '-':
            {
                System.out.println(a - b);
                break;
            }
            case '*':
            {
                System.out.println(a * b);
                break;
            }
            case '/':
            {
                if(b == 0)
                {
                    System.out.println("Nie dzielimy przez zero!!");
                    break;
                } else 
                {
                    System.out.println(a / b);
                    break;
                }
            }
        }
        input.close();
    }
    
}
