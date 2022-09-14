import java.util.Scanner;
public class zad8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbe sztuk:");
        int szt = keyboard.nextInt();
        double sumaporabacie, rabat;
        if (szt >= 100) {
            sumaporabacie = 99*0.5;
            System.out.println("Przyznano rabat 50%. Cena po rabacie wynosi: " +sumaporabacie+ " złotych. ");

        }
        else if (szt < 100 && szt > 49) {
            rabat = 99*0.4;
            sumaporabacie = 99 - rabat;
            System.out.println("Przyznano rabat 40%. Cena po rabacie wynosi " +sumaporabacie+ " złotych. ");

        }
        else if (szt < 50 && szt > 19) {
            rabat = 99*0.3;
            sumaporabacie = 99 - rabat;
            System.out.println("Przyznano rabat 30%. Cena po rabacie wynosi " +sumaporabacie+ " złotych. ");

        }
        else if (szt < 20 && szt > 9) {
            rabat = 99*0.2;
            sumaporabacie = 99 - rabat;
            System.out.println("Przyznano rabat 20%. Cena po rabacie wynosi " +sumaporabacie+ " złotych. ");
        }
    }
}