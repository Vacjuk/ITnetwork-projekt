import java.util.ArrayList;

/**
 *  třída pro správu seznamu pojištěnců
 * @author Martin
 */
public class SeznamPojistenych {

    private ArrayList<Pojistenec> pojistenci;

    // konstruktor pro inicializaci seznamu pojištěnců
    public SeznamPojistenych() {
        pojistenci = new ArrayList<>();
    }

    /**
     * metoda pro vytvoření nového pojištěného a přidání ho do seznamu
     *
     * @param jmeno Jméno pojištěnce.
     * @param prijmeni Příjmení pojištěnce.
     * @param vek Věk pojištěnce.
     * @param telefon Telefonní číslo pojištěnce.
     */
    public void vytvorPojisteneho(String jmeno, String prijmeni, int vek, String telefon) {
        pojistenci.add(new Pojistenec(jmeno, prijmeni, vek, telefon));
    }


    /**
     * metoda pro vyhledání pojištěného podle jména a příjmení
     *
     * @param jmeno             Jméno hledaného pojištěnce
     * @param prijmeni          Příjmení hledaného pojištěnce
     * @param podleJmena        True, pokud má být hledání podle jména
     * @param podlePrijmeni     True, pokud má být hledání podle příjmení
     * @return  Seznam nalezených pojištěnců
     */
    public ArrayList<Pojistenec> najdiPojisteneho(String jmeno, String prijmeni, boolean podleJmena, boolean podlePrijmeni) {
        ArrayList<Pojistenec> nalezen = new ArrayList<>();
        for (Pojistenec pojistenec : pojistenci) {
            if ((podleJmena && pojistenec.getJmeno().equals(jmeno)) && (podlePrijmeni && pojistenec.getPrijmeni().equals(prijmeni))) {
                nalezen.add(pojistenec);
            }
        }
        return nalezen;
    }

    /**
     * metoda pro získání seznamu pojištěnců
     * @return  Seznam všech pojištěnců
     */
    public ArrayList<Pojistenec> getPojistenci() {
        return pojistenci;
    }
}
