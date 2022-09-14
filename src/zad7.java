import java.util.Scanner;
public class zad7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj pierwsze imie: ");
        String imie1 = keyboard.next();
        System.out.println("Podaj drugie imie: ");
        String imie2 = keyboard.next();
        System.out.println("Podaj trzecie imie: ");
        String imie3 = keyboard.next();
        if (imie1.compareTo(imie2) < 0 && imie1.compareTo(imie3) < 0) {
            if (imie2.compareTo(imie3) < 0)  {
                System.out.println(imie1+ "Jest pierwsze alfabetycznie");
            }
            else if (imie2.compareTo(imie3) < 0 && imie2.compareTo(imie1) > 0) {
                if (imie1.compareTo(imie2) > 0)
                    System.out.println(imie2+"Jest pierwsze alfabetycznie");
            }
            else {
                System.out.println(imie3+"Jest pierwsze alfabetycznie");
            }
        }
    }
}
