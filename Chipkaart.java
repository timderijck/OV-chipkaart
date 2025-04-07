package ovchipkaartsysteem;

public class Chipkaart
{
    private int saldo;
    private boolean geldig;
    private boolean StatusPaal;
    private String IncheckLocatie;
    private String UitcheckLocatie;
    
    public boolean GetGeldigheid() {

	return geldig;
    }
    
    public void SetGeldigheid(boolean y) {
	geldig = y;
    }
    
    public boolean GetStatusPaal() {

	return StatusPaal;
    }
    
    public void SetStatusPaal(boolean z) {
	StatusPaal = z;
    }
    public void SetIncheckLocatie(String x) {
	IncheckLocatie = x;
    }
    
    public String GetIncheckLocatie() {
	return IncheckLocatie;
    }
}
