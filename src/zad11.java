import java.util.Scanner;
public class zad11 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj pierwsze nazwisko:");
        String nazwisko1 = keyboard.next();
        System.out.println("Podaj czas przebiegnięcia w minutach: ");
        int minutes1 = keyboard.nextInt();
        System.out.println("Podaj drugie nazwisko: ");
        String nazwisko2 = keyboard.next();
        System.out.println("Podaj czas przebiegnięcia w minutach: ");
        int minutes2 = keyboard.nextInt();
        System.out.println("Podaj trzecie nazwisko: ");
        String nazwisko3 = keyboard.next();
        System.out.println("Podaj czas przebiegnięcia w minutach: ");
        int minutes3 = keyboard.nextInt();
        if (minutes1 < minutes2 && minutes1 < minutes3) {
            if (minutes2 < minutes3) {
                System.out.println("Pierwsze miejsce zajmuje: " +nazwisko1+ " Drugie: " +nazwisko2+ " a trzecie: " +nazwisko3);
            }
            else {
                System.out.println("Pierwsze miejsce zajmuje: " +nazwisko1+ " Drugie: " +nazwisko3+ " a trzecie: " +nazwisko2);
            }
        }
        else if (minutes2 < minutes1 && minutes2 < minutes3) {
            if (minutes3 < minutes1) {
                System.out.println("Pierwsze miejsce zajmuje: " +nazwisko2+ " Drugie: "  +nazwisko3+ " a trzecie: " +nazwisko1);
            }
            else {
                System.out.println("Pierwsze miejsce zajmuje: " +nazwisko2+ " Drugie: " +nazwisko1+ " a trzecie: " +nazwisko3);
            }
        }
        else if (minutes3 < minutes1 && minutes3 < minutes2) {
            if (minutes1 < minutes2) {
                System.out.println("Pierwsze miejsce zajmuje: " +nazwisko3+ " Drugie: " +nazwisko1+ " a trzecie: " +nazwisko2);
            }
            else {
                System.out.println("Pierwsze miejsce zajmuje: " +nazwisko3+ " Drugie: " +nazwisko2+ " a trzecie: " +nazwisko1);
            }
        }

    }
}
