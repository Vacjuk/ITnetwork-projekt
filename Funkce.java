import java.util.ArrayList;
import java.util.Scanner;

/**
 * třída pro správu funkcí aplikace
 * @author Martin
 */
public class Funkce {

    private SeznamPojistenych seznamPojistenych;

    private ArrayList<Pojistenec> pojistenci;
    private Scanner scanner = new Scanner(System.in, "Windows-1250");

    public Funkce() {
        seznamPojistenych = new SeznamPojistenych();
        pojistenci = new ArrayList<>();
    }

    // metoda pro vytvoření nového pojištěného a přidání ho do seznamu
    public void vytvorPojisteneho() {
        System.out.println("Vložte jméno nového pojištěnce: ");
        String jmeno = scanner.nextLine();
        try {
            if (jmeno.trim().isEmpty()) {
                throw new IllegalArgumentException("Jméno nesmí být prázdné.");
            }
        } catch (IllegalArgumentException ex) {
            System.out.println("Chyba: " + ex.getMessage());
            return;
        }
        System.out.println("Vložte příjmení nového pojištěnce: ");
        String prijmeni = scanner.nextLine();
        try {
            if (prijmeni.trim().isEmpty()) {
                throw new IllegalArgumentException("Příjmení nesmí být prázdné.");
            }
        } catch (IllegalArgumentException ex) {
            System.out.println("Chyba: " + ex.getMessage());
            return;
        }
        int vek = 0;
        try {
            System.out.println("Vložte věk pojištěnce: ");
            vek = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Neplatný věk. Zadejte platné číslo.");
            return;
        }
        System.out.println("Vložte telefonní číslo: ");
        String telefon = scanner.nextLine();

        seznamPojistenych.vytvorPojisteneho(jmeno, prijmeni, vek, telefon);
    }

    // metoda pro zobrazení seznamu všech pojištěných
    public void vypisSeznam() {
        ArrayList<Pojistenec> seznam = seznamPojistenych.getPojistenci();
        if (seznam.isEmpty()) {
            System.out.println("V evidenci nejsou žádní pojištění.");
        } else {
            System.out.println("V evidenci jsou tito pojištěnci: ");
            for (Pojistenec pojistenec : seznam) {
                System.out.print(pojistenec);
            }
        }
    }

    // metoda pro vyhledání pojištěného podle jména a příjmení
    public void hledejPojisteneho() {
        System.out.println("Zadejte jméno pojištěného: ");
        String jmeno = scanner.nextLine();
        System.out.println("Zadejte příjméní pojištěného: ");
        String prijmeni = scanner.nextLine();

        ArrayList<Pojistenec> nalezen = seznamPojistenych.najdiPojisteneho(jmeno, prijmeni, true, true);
        if (nalezen.isEmpty()) {
            System.out.println("Pojištěný nebyl nalezen.");
        } else {
            for (Pojistenec pojistenec : nalezen) {
                System.out.println(pojistenec);
            }
        }
    }

    // metoda pro výpis úvodní obrazovky
    public void vypisUvodniObrazovku () {
        System.out.println("||||||||||||||||||||");
        System.out.println("Evidence pojištěných");
        System.out.println("||||||||||||||||||||");
        System.out.println();
        System.out.println("Vyber akci: ");
    }
}

