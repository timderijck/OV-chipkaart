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
	   System.out.println("Error: uw kaart is ongeldig, of de in/uitcheckpaal is inactief."); 
	}
	    
	return x.GetGeldigheid();
    }
    public void Uitgecheckt(Chipkaart x) {
	    if (x.GetStatusPaal() == true && x.GetGeldigheid() == true) {
	        if (x.GetIncheckLocatie() != null) {
	            System.out.println(" ");
	            System.out.println("U bent succesvol uitgecheckt.");
	            System.out.println("Ingecheckt in: " + x.GetIncheckLocatie());
	            System.out.println("Uitgecheckt in: " + locatie);
	            x.SetUitgecheckt(true);
	            x.SetIncheckLocatie(null); // reset de inchecklocatie
	        } else {
	            System.out.println("Error: U bent niet ingecheckt.");
	        }
	    } else {
	        
	    }
	}
	    
	
    }
