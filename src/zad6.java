import java.util.Scanner;
public class zad6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj czas w sekundach: ");
        long second = keyboard.nextLong();
        long minutes, hours, days;
        if (second >= 60 && second < 3600) {
            minutes = second / 60;
            System.out.println("Czas wynosi: " +minutes+ " minuta/minuty/minut. ");
        }
        else if(second >= 3600 && second < 86400) {
            hours = second / 3600;
            System.out.println("Czas wynosi: " +hours+ " godzina/godziny/godzin. ");
        }
        else if(second >= 86400) {
            days = second / 86400;
            System.out.println("Czas wynosi: " +days+ " dzień/dni. ");
        }
    }
}
