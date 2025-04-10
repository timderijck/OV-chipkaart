package ovchipkaartsysteem;

public class OVChipkaartVoorkant
{

    public static void main(String[] args)
    {
	Chipkaart gebruiker = new Chipkaart();
	gebruiker.SetGeldigheid(true);
	gebruiker.SetStatusPaal(true);
	
	
	Paal Boxmeer = new Paal();
	Paal Cuijk = new Paal();
	Paal MookMolenhoek = new Paal();
	Paal NijmegenHeyendaal = new Paal();
	Paal Nijmegen = new Paal();
	
	Boxmeer.locatie = "Boxmeer";
	Cuijk.locatie = "Cuijk";
	MookMolenhoek.locatie = "Mook, Molenhoek";
	NijmegenHeyendaal.locatie = "Nijmegen, Heyendaal";
	Nijmegen.locatie = "Nijmegen";
	
	Boxmeer.Ingecheckt(gebruiker);
	Cuijk.Uitgecheckt(gebruiker);
	
    }

}
