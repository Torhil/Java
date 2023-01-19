import java.util.Scanner;

public class calculator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char znak;

        System.out.println("wprowadź pierwszą liczbę:");
        int a = input.nextInt();
        System.out.println("jakie działanie chcesz wykonać (+,-,*,/)");
        znak = input.next().charAt(0);
        System.out.println("wprowadź drugą liczbę:");
        int b = input.nextInt();
            if(znak == '+')
            {
                System.out.println(a + b);
            } else if(znak == '-')
            {
                System.out.println(a - b);
            } else if(znak == '*')
            {
                System.out.println(a * b);
            } else if (znak == '/')
            {
                if(b == 0)
                {
                    System.out.println("Nie dziel przez zero!");
                }
                System.out.println(a / b);
            }

    }
}