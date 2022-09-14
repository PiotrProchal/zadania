import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj dzień: ");
        int day = keyboard.nextInt();
        System.out.println("Podaj miesiąc: (w formie liczby: ");
        int month = keyboard.nextInt();
        System.out.println(" Podaj dwie ostatnie cyfry roku ");
        int year = keyboard.nextInt();
        int Magicdata = day*month;
        if (Magicdata == year) {
            System.out.println("Ta data jest magiczna.");
        }
        else {
            System.out.println(" Ta data nie jest magiczna. ");
        }
    }
}