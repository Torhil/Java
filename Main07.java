public class Main07 {
    public static void main(String[] args) {

        /* double wynik = Math.dodaj(3, 4);
        System.out.println(wynik);
        System.out.println(Math.PI); */
        
        Klient a = new Klient("Dawid");
        Klient b = new Klient("Krzysztof");
        Klient c = new Klient("Piotr");

        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);
        System.out.println(Klient.nastepnyId);
    }
}

class Math
{
    static final double PI = 3.14;
    static double dodaj(double a, double b)
    {
        return a + b;
    }
}

class Klient
{
    Klient(String imie)
    {
        this.imie = imie;
        id = nastepnyId;
        nastepnyId++;
    }
    String imie;
    int id = 0;
    static int nastepnyId = 1;
}