public class Main05 {
    public static void main(String[] args) {
        
        Test a = new Test();
        a.wypisz("Dawid");

        int wynik = a.dodaj(10, 20);
        System.out.println(wynik);
    }
}

class Test
{
    void wypisz(String imie)
    {
        System.out.println(imie);
    }

    int dodaj(int a, int b)
    {
        return 2 * (a + b);
    }
}