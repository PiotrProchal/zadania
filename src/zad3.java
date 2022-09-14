import java.util.Scanner;
public class zad3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj swoją wage w kilogramach: ");
        double kg = keyboard.nextDouble();
        System.out.println("Podaj swój wzrost w metrach: ");
        double m = keyboard.nextDouble();
        double BMI = kg / (m*m);

        if ( BMI >= 18.5 && BMI <= 25 ) {
            System.out.println("Wartosc optymalna");
        }
        else if (BMI < 18.5) {
            System.out.println("Niedożywiony");
        }
        else if (BMI > 25) {
            System.out.println("Nadwaga");
        }
    }
}