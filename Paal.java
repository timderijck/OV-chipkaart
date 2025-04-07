package ovchipkaartsysteem;

import java.util.*;

public class Paal
{
    public String locatie;
    
    public boolean Ingecheckt(Chipkaart x) {
	if (x.GetStatusPaal() == true && x.GetGeldigheid() == true) {
	    System.out.println("U bent succesvol ingecheckt.");
	    x.SetIncheckLocatie(locatie);
	    System.out.println("Huidige locatie: " + x.GetIncheckLocatie());
	}
	
	else {
	   System.out.println("Error, uw kaart is ongeldig, of de incheckpaal is inactief."); 
	}
	    
	return x.GetGeldigheid();
    }
}