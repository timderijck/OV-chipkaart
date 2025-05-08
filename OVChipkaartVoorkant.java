package ovchipkaartsysteem;

import java.util.Scanner;


public class OVChipkaartVoorkant
{

    public static void main(String[] args)
    {
	
	// Scanner maken voor invoer
	Scanner input = new Scanner(System.in);

	// Aanmaken van de gebruiker en zijn geldigheid laten checken
	Chipkaart gebruiker = new Chipkaart();
	gebruiker.SetGeldigheid(true);
	gebruiker.SetStatusPaal(true);
	gebruiker.SetGebruikerSaldo(20.00);
	gebruiker.SetPasSaldo(5.00);

	// Vragen of gebruiker wil opwaarderen
	System.out.println("Wilt u uw saldo opwaarderen? Typ 'ja' of 'nee':");
	String antwoord = input.nextLine();

	if (antwoord.equals("ja")) {
	    System.out.println("Typ het bedrag dat u wilt opwaarderen (bijvoorbeeld 10):");
	    String bedragInvoer = input.nextLine();
	    double bedrag = Double.parseDouble(bedragInvoer);

	    if (bedrag > 0) {
	        System.out.println("Typ '1' om gebruikerSaldo op te waarderen of '2' voor pasSaldo:");
	        String keuze = input.nextLine();

	        if (keuze.equals("1")) {
	            gebruiker.OpwaarderenGebruikerSaldo(bedrag);
	        } else if (keuze.equals("2")) {
	            gebruiker.OpwaarderenPasSaldo(bedrag);
	        } else {
	            System.out.println("Ongeldige keuze. Geen opwaardering uitgevoerd.");
	        }
	    } else {
	        System.out.println("Het bedrag moet groter zijn dan 0. Geen opwaardering uitgevoerd.");
	    }
	} else if (antwoord.equals("nee")) {
	    System.out.println("Geen opwaardering uitgevoerd.");
	} else {
	    System.out.println("Fout: Ongeldige invoer. Programma wordt gestopt.");
	    System.exit(0); // programma stopt direct
	}

	// Alle verschillende locaties 'objects'
	Paal Boxmeer = new Paal();
	Paal Cuijk = new Paal();
	Paal MookMolenhoek = new Paal();
	Paal NijmegenHeyendaal = new Paal();
	Paal Nijmegen = new Paal();
	
	// Het initialiseren van de locaties
	Boxmeer.locatie = "Boxmeer";
	Cuijk.locatie = "Cuijk";
	MookMolenhoek.locatie = "Mook, Molenhoek";
	NijmegenHeyendaal.locatie = "Nijmegen, Heyendaal";
	Nijmegen.locatie = "Nijmegen";
	
	// Alle locaties een nummer geven voor het berekenen van de reiskosten
	Boxmeer.locatieNummer = 1;
	Cuijk.locatieNummer = 2;
	MookMolenhoek.locatieNummer = 3;
	NijmegenHeyendaal.locatieNummer = 4;
	Nijmegen.locatieNummer = 5;
	
	// Alle locaties een extra nummer gegeven om te controleren
	Boxmeer.locatieNummerControle = 1;
	Cuijk.locatieNummerControle = 2;
	MookMolenhoek.locatieNummerControle = 3;
	NijmegenHeyendaal.locatieNummerControle = 4;
	Nijmegen.locatieNummerControle = 5;
	
	// (Locatie inchecken van de gebruiker
	Boxmeer.Ingecheckt(gebruiker);
	//Saldo van pas af halen na reis
	Nijmegen.ReisKostenBerekening(gebruiker);
	// (Locatie uitchecken van de gebruiker
	Nijmegen.Uitgecheckt(gebruiker);
	

    }

}
