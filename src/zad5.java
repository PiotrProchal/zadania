import java.util.Scanner;
public class zad5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj mase obiektu w kilogramach: ");
        double kg = keyboard.nextDouble();
        double ciezar = kg * 9.8;
        if (ciezar >= 10 && ciezar <= 1000) {
         System.out.println(" Obiekt jest optymalny. ");
        }
        else if (ciezar < 10) {
            System.out.println("Obiekt jest za lekki. ");

        }
        else if (ciezar > 1000) {
                System.out.println("Obiekt jest zbyt ciężki. ");
        }

    }
}