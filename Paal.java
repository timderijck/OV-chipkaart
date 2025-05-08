package ovchipkaartsysteem;

import java.util.*;

public class Paal
{
    public String locatie;
    public int locatieNummer;
    public int locatieNummerControle;

    // Incheckcontrole
    public boolean Ingecheckt(Chipkaart x)
    {
        if (x.GetStatusPaal() == true && x.GetGeldigheid() == true)
        {
            System.out.println("U bent succesvol ingecheckt.");
            x.SetIncheckLocatie(locatie);
            x.SetIncheckLocatieNummer(locatieNummer); 
            System.out.println("Huidige locatie: " + x.GetIncheckLocatie());
            System.out.println(" ");
            // €2 instapkosten afschrijven
            double pasSaldo = x.GetPasSaldo();
            double gebruikerSaldo = x.GetGebruikerSaldo();

            if (pasSaldo >= 2.00) {
                x.SetPasSaldo(pasSaldo - 2.00);
            } else {
                double tekort = 2.00 - pasSaldo;
                if (gebruikerSaldo >= tekort) {
                    x.SetPasSaldo(0);
                    x.SetGebruikerSaldo(gebruikerSaldo - tekort);
                    System.out.printf("€%.2f opgewaardeerd vanaf bank voor instapkosten.%n", tekort);
                } else {
                    System.out.println("Onvoldoende saldo voor instapkosten. Check-in mislukt.");
                    return false;
                }
            }

            System.out.printf("Instapkosten afgeschreven. Huidig pasSaldo: €%.2f%n", x.GetPasSaldo());
        }
        else
        {
            System.out.println("Error: uw kaart is ongeldig, of de in/uitcheckpaal is inactief.");
        }

        return x.GetGeldigheid();
    }


    // Uitcheckcontrole
    public void Uitgecheckt(Chipkaart x)
    {
	if (x.GetStatusPaal() == true && x.GetGeldigheid() == true)
	{
	    if (x.GetIncheckLocatie() != null)
	    {
		System.out.println(" ");
		System.out.println("U bent succesvol uitgecheckt.");
		System.out.println("Ingecheckt in: " + x.GetIncheckLocatie());
		System.out.println("Uitgecheckt in: " + locatie);
		x.SetUitgecheckt(true);
		x.SetIncheckLocatie(null); // reset de inchecklocatie
	    } else

	    {
		System.out.println("Error: U bent niet ingecheckt.");
	    }
	} else

	{

	}
    }
    // Reis kosten berekenen
    public void ReisKostenBerekening(Chipkaart x)
    {
        int incheckNummer = x.GetIncheckLocatieNummer();
        int uitcheckNummer = this.locatieNummer;

        // Aantal haltes gereisd
        int haltesGereisd = Math.abs(uitcheckNummer - incheckNummer) + 1;

        double totaalReisKosten = haltesGereisd * 1.00;

        double pasSaldo = x.GetPasSaldo();
        double gebruikerSaldo = x.GetGebruikerSaldo();

        System.out.println("Aantal haltes gereisd: " + haltesGereisd);
        System.out.printf("Totale reiskosten: €%.2f%n", totaalReisKosten);

        if (pasSaldo >= totaalReisKosten)
        {
            x.SetPasSaldo(pasSaldo - totaalReisKosten);
        }
        else
        {
            double tekort = totaalReisKosten - pasSaldo;
            if (gebruikerSaldo >= tekort)
            {
                x.SetPasSaldo(0);
                x.SetGebruikerSaldo(gebruikerSaldo - tekort);
                System.out.printf("€%.2f opgewaardeerd vanaf bank voor reiskosten.%n", tekort);
            }
            else
            {
                System.out.println("Onvoldoende saldo op pas én bank. Transactie mislukt.");
                System.exit(0);
            }
        }

        System.out.printf("Nieuw pasSaldo: €%.2f%n", x.GetPasSaldo());
        System.out.printf("Nieuw bankSaldo: €%.2f%n", x.GetGebruikerSaldo());
    }


}
