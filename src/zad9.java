import java.util.Scanner;
public class zad9 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj wage przesylki w kilogramach ");
        double waga = keyboard.nextDouble();
        System.out.println("Podaj odleglosc paczki:");
        int distance = keyboard.nextInt();
        int distancev2;
        double suma;
        if (waga <= 1) {
            distancev2 = distance/500;
            suma = distancev2*1.10;
            System.out.println("Koszt przesylki wynosi:" +suma);
        }
        else if (waga > 1 && waga <= 3) {
            distancev2 = distance/500;
            suma = distancev2*2.20;
            System.out.println("Koszt przesylki wynosi: " +suma);

        }
        else if (waga > 3 && waga <= 5 ) {
            distancev2 = distance/500;
            suma = distancev2*3.70;
            System.out.println("Koszt przesylki wynosi: " +suma);
        }
        else if (waga > 5) {
            distancev2 = distance/500;
            suma = distancev2*3.80;
            System.out.println("Koszt przesylki wynosi: " +suma);
        }
    }
}
