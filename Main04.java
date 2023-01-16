        /*
            Obiekty - pojemniki do przechowywania zmiennych i funkcji tematycznie ze sobą
            powiązanych do dalszego, łatwiejszego ponownego użycia.
            Klasy - foremki do tworzenia egzemplarzy obiektów.
         */
public class Main04 {
    public static void main(String[] args) {
      Point p = new Point(1,2);
      Point p2 = new Point(4,21);
        
        System.out.println("p.x " + p.x);
        System.out.println("p.y " + p.y);

        System.out.println("p2.y " + p2.y);
        System.out.println("p2.y " + p2.y);
    }
}

class Point
{
    Point()
    {
        System.out.println("Wywołano konstruktor domyślny.");
    }
    Point(int x, int y)
    {
        System.out.println("Wywołano konstruktor z dwoma parametrami.");
        this.x = x;
        this.y = y;
    }
    int x;
    int y;
}