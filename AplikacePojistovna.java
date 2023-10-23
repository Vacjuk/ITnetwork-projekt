import java.util.Scanner;


/**
 * Hlavní třída aplikace
 * @author Martin
 */
public class AplikacePojistovna {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        Funkce funkce = new Funkce();

        int volba = 0;

        // výběr možností pro uživatele
        while (volba != 4) {
            funkce.vypisUvodniObrazovku();
            System.out.println("1 - Přidat nového pojištěného:");
            System.out.println("2 - Vypsat všechny pojištěné:");
            System.out.println("3 - Vyhledat pojištěného:");
            System.out.println("4 - Ukončit aplikaci:");

            volba = scanner.nextInt();

            switch (volba) {
                case 1:
                    funkce.vytvorPojisteneho();
                    break;
                case 2:
                    funkce.vypisSeznam();
                    break;
                case 3:
                    funkce.hledejPojisteneho();
                    break;
                case 4:
                    System.out.println("Děkuji za použití aplikace.");
                    break;
                default:
                    System.out.println("Neplatná volba, zkuste zadat znovu.");
            }
        }
    }
}
