package controllers;

import modelsistema.BazaStudenata;
import modelsistema.Status;
import modelsistema.TrenutnaGodina;

import java.util.Date;

public class StudentiController {

	private static StudentiController instance = null;
	
	public static StudentiController getInstance() {
		if (instance == null) {
			instance = new StudentiController();
		}
		return instance;
	}
	
	private StudentiController() {}
	
	public void dodajStudenta(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, int kontaktTelefon,
			String emailAdresa, String brojIndeksa, Date datumUpisa, TrenutnaGodina trenGodStudija, Status status,
			double prosOcena) {
		
		BazaStudenata.getInstance().dodajStudenta(ime, prezime,datumRodjenja, adresaStanovanja, kontaktTelefon,
						emailAdresa, brojIndeksa, datumUpisa, trenGodStudija, status, prosOcena);
		
	}
	
    public void izbrisiStudenta(String brojIndeksa) {
    	
		BazaStudenata.getInstance().izbrisiStudenta(brojIndeksa);
	
    }
	
	public void izmeniStudenta(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, int kontaktTelefon,
			String emailAdresa, String brojIndeksa, Date datumUpisa, TrenutnaGodina trenGodStudija, Status status,double prosOcena) {
		
		BazaStudenata.getInstance().izmeniStudenta(ime, prezime, datumRodjenja, adresaStanovanja, kontaktTelefon,
						emailAdresa, brojIndeksa, datumUpisa, trenGodStudija, status, prosOcena);
		
	}
	
}