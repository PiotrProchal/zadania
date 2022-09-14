import java.util.Scanner;
public class zad4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj wynik pierwszego sprawdzianu");
        int  wynik1 = keyboard.nextInt();
        System.out.println("Podaj wynik drugiego sprawdzianu:");
        int wynik2 = keyboard.nextInt();
        System.out.println("Podaj wynik trzeciego sprawdzianu:");
        int wynik3 = keyboard.nextInt();
        int sumawynikow = (wynik1+wynik2+wynik3) / 3;
        if (sumawynikow > 89 && sumawynikow <= 100 ) {
            System.out.println("Średnia wyników wynosi " + sumawynikow + "% a ocena odpowiadająca jej to 5. ");
        }
        else if (sumawynikow > 79 && sumawynikow <= 89) {
            System.out.println("Średnia wyników wynosi " +sumawynikow+ "% a ocena odpowiadajaca jej to 4. ");
        }
        else if (sumawynikow > 69 && sumawynikow <= 79) {
            System.out.println("Średnia wyników wynosi " +sumawynikow+ "% a ocena odpowiadajaca jej to 3. ");

        }
        else if (sumawynikow > 59 && sumawynikow <= 69) {
            System.out.println("Średnia wyników wynosi " +sumawynikow+ "% a ocena odpowiadajaca jej to 2. ");

        }
        else if (sumawynikow < 60)
        {
            System.out.println("Średnia wyników wynosi " +sumawynikow+ "%, a ocena odpowiadajaca jej to 1. ");
        }

    }
}
