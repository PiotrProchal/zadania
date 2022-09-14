import java.util.Scanner;
public class zad12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wybierz spośrod opcji woda-1, powietrze-2, stal-3. ");
        String slowo = keyboard.nextLine();
        double odleglosc;
        double czas;
        switch(slowo) {
            case "woda":
                System.out.println(" Podaj odleglosc jaka fala dzwiekowa ma przebyć: ");
                odleglosc = keyboard.nextDouble();
                czas = odleglosc/1490;
                System.out.println("Czas potrzebny na pokonanie odleglosci to: " +czas);
                break;
            case "powietrze":
                System.out.println(" Podaj odleglosc jaka fala dzwiekowa ma przebyć: ");
                odleglosc = keyboard.nextDouble();
                czas = odleglosc/343;
                System.out.println("Czas potrzebny na pokonanie odleglosci to: " +czas);
                break;
            case "stal":
                System.out.println(" Podaj odleglosc jaka fala dzwiekowa ma przebyć: ");
                odleglosc = keyboard.nextDouble();
                czas = odleglosc/5100;
                System.out.println("Czas potrzebny na pokonanie odleglosci to: " +czas);
                break;
            default:
                System.out.println("Podales zla opcje. Sprobuj ponownie. ");
        }
    }
}
