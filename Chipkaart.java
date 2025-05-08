package ovchipkaartsysteem;

public class Chipkaart
{
    private double GebruikerSaldo;
    private double PasSaldo;
    private boolean geldig;
    private boolean StatusPaal;
    private String IncheckLocatie;
    private boolean Uitgecheckt;

    // geldigheid checken Ov-pas
    public boolean GetGeldigheid()
    {
	return geldig;
    }

    public void SetGeldigheid(boolean y)
    {
	geldig = y;
    }

    //geldigheid checken in/uitcheckpaal
    public boolean GetStatusPaal()
    {
	return StatusPaal;
    }

    public void SetStatusPaal(boolean z)
    {
	StatusPaal = z;
    }
    //Inchecklocatie vastzetten
    public void SetIncheckLocatie(String x)
    {
	IncheckLocatie = x;
    }

    public String GetIncheckLocatie()
    {
	return IncheckLocatie;
    }
    //Aangeven wanneer er is uitgecheckt
    public void SetUitgecheckt(boolean x)
    {
	Uitgecheckt = x;
    }

    public boolean GetUitgecheckt()
    {
	return Uitgecheckt;
    }
    // GebruikerSaldo aanmaken en vastleggen
    public double GetGebruikerSaldo() {
	
	return GebruikerSaldo;
    }
    public void SetGebruikerSaldo(double x) {
	GebruikerSaldo = x;
    }
    // PasSaldo aanmaken en vastleggen
    public double GetPasSaldo() {
	
	return PasSaldo;
    }
    public void SetPasSaldo(double x) {
	PasSaldo = x;
    }
    //IncheckLocaties aangemaakt
    private int IncheckLocatieNummer;

    public void SetIncheckLocatieNummer(int nummer) {
        IncheckLocatieNummer = nummer;
    }

    public int GetIncheckLocatieNummer() {
        return IncheckLocatieNummer;
    }
    // Geen getter/setter, maar hoort wel nog bij de chipkaart
    public void OpwaarderenGebruikerSaldo(double bedrag) {
	    GebruikerSaldo += bedrag;
	    System.out.println("GebruikerSaldo is opgewaardeerd met €" + bedrag);
	}

	public void OpwaarderenPasSaldo(double bedrag) {
	    PasSaldo += bedrag;
	    System.out.println("PasSaldo is opgewaardeerd met €" + bedrag);
	}

}

