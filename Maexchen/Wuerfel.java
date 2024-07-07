
/**
 * Beschreiben Sie hier die Klasse Wuerfel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

import java.util.Random; //Klasse Random wird importiert

public class Wuerfel
{
    // Instanzvariablen werden deklariert
    private int wuerfelwert; //Wuerfelwert wird gespeichert
    private Random zufallszahl; //v

    public Wuerfel()
    {
        zufallszahl = new Random(); //erzeugt ein Objekt des Typs Random
        wuerfeln(); //Methode, die verwendet wird um einen Startwert zu haben
    }

    public void wuerfeln() 
    {
        wuerfelwert = zufallszahl.nextInt(6)+1; //Dem Wuerfelwert wird die zufällig generierte Zahl zugewiesen. +1 wird addiert damit die Spanne 1 bis 6 beträgt
    }
    
    public int anzeigenErgebnis()
    { 
        return wuerfelwert; // Der Wuerfelwert wird zurückgegeben
    }
}