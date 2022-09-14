import java.util.Scanner;
public class zad10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbe kalorii produktu:");
        int calories = keyboard.nextInt();
        System.out.println("Podaj liczbe gramow tluszczu produktu: ");
        int grams = keyboard.nextInt();
        double suma, kalorieztluszczu, procenty;
        kalorieztluszczu = grams*9;
        if (kalorieztluszczu < calories) {
            suma = kalorieztluszczu/calories;
          if (suma > 0.30) {
              procenty = suma*100;
              System.out.println("Kalorie z tluszczu stanowia: " +procenty+ "% wszystkich kalorii.");
          }
          else {
              procenty = suma*100;
              System.out.println("Kalorie z tluszczu stanowia: " +procenty+ "% wszystkich kalorii.");
          }
        }
        else {
            System.out.println("Wprowadziles nieprawidlowe dane. Sprobuj ponownie. ");
        }
    }
}
