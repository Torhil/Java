import java.util.Scanner;

class Account
{
    private double balance;

    public Account()
    {
        this.balance = 0;
    }

    public void deposit(double value)
    {
       this.balance += value;
    }

    public void withdraw(double value)
    {
        if(value <= balance)
        {
            this.balance -= value;
        } else {
            System.out.println("Nie masz wystarczających środków na wypłatę.");
        }
    }

    public double getBalance()
    {
        return this.balance;
    }

}
public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account = new Account();

        System.out.println("Saldo początkowe: " + account.getBalance());
        System.out.println("Wprowadź kwotę wpłaty:");
        double depositAmount = input.nextDouble();
        account.deposit(depositAmount);
        System.out.println("Saldo po wpłacie: " + account.getBalance());
        System.out.println("Wprowadź kwotę wypłaty:");
        double withdrawAmount = input.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("Saldo po wypłacie środków: " + account.getBalance());
        input.close();
    }
}

