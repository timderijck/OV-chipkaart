package ovchipkaartsysteem;

public class OVChipkaartVoorkant
{

    public static void main(String[] args)
    {
	// Aanmaken van de gebruiker en zijn geldigheid laten testen
	Chipkaart gebruiker = new Chipkaart();
	gebruiker.SetGeldigheid(true);
	gebruiker.SetStatusPaal(true);
	gebruiker.SetGebruikerSaldo(20.00);
	gebruiker.SetPasSaldo(5.00);
	
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
