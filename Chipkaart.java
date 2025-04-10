package ovchipkaartsysteem;

public class Chipkaart
{
    private int saldo;
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

}
