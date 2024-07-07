
/**
 * Beschreiben Sie hier die Klasse Wuerfelbecher.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Wuerfelbecher
{
    private Wuerfel wuerfel1;
    private Wuerfel wuerfel2;
    private String ergebnis;

    public Wuerfelbecher()
    {
        wuerfel1 = new Wuerfel();
        wuerfel2 = new Wuerfel();
    }

    public void schuetteln()
    {
        wuerfel1.wuerfeln();
        wuerfel2.wuerfeln();
    }

    public String aufdecken()
    {
        if (wuerfel1.anzeigenErgebnis() > wuerfel2.anzeigenErgebnis()) {
           ergebnis = (wuerfel1.anzeigenErgebnis() + "" + wuerfel2.anzeigenErgebnis() + "");
        }

        else {
            ergebnis = (wuerfel2.anzeigenErgebnis() + "" + wuerfel1.anzeigenErgebnis() + "");

        }
        return ergebnis;
    }
}
