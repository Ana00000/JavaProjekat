package controllers;

import modelsistema.BazaStudenata;
import modelsistema.Predmet;
import modelsistema.Status;
import modelsistema.Student;
import modelsistema.TrenutnaGodina;

import java.util.Date;

import izgledaplikacije.AbstractTableModelPredmeti;
import izgledaplikacije.AbstractTableModelStudenti;
import izgledaplikacije.PredmetiJTable;
import izgledaplikacije.StudentiJTable;

public class StudentiController {

	private static StudentiController instance = null;
	
	public static StudentiController getInstance() {
		if (instance == null) {
			instance = new StudentiController();
		}
		return instance;
	}
	
	private StudentiController() {}
	
	public void dodajStudenta(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, String kontaktTelefon,
			String emailAdresa, String brojIndeksa, Date datumUpisa, TrenutnaGodina trenGodStudija, Status status,double prosOcena) {
		
		BazaStudenata.getInstance().dodajStudenta(ime, prezime,datumRodjenja, adresaStanovanja, kontaktTelefon,
						emailAdresa, brojIndeksa, datumUpisa, trenGodStudija, status, prosOcena);
		AbstractTableModelStudenti model = (AbstractTableModelStudenti) StudentiJTable.getInstance().getModel();
		model.fireTableDataChanged();
		
	}
	
    public void izbrisiStudenta(Student s) {
    	
    	BazaStudenata.getInstance().izbrisiStudenta(s);
    	AbstractTableModelStudenti model = (AbstractTableModelStudenti) StudentiJTable.getInstance().getModel();
		model.fireTableDataChanged();
	
    }
	
	public void izmeniStudenta(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, String kontaktTelefon,
			String emailAdresa, String brojIndeksa, Date datumUpisa, TrenutnaGodina trenGodStudija, Status status,double prosOcena,Student s) {
		
		BazaStudenata.getInstance().izmeniStudenta(ime, prezime, datumRodjenja, adresaStanovanja, kontaktTelefon,
						emailAdresa, brojIndeksa, datumUpisa, trenGodStudija, status, prosOcena,s);
		AbstractTableModelStudenti model = (AbstractTableModelStudenti) StudentiJTable.getInstance().getModel();
		model.fireTableDataChanged();
	}
	
	public void dodavanjeStudentaNaPredmet(Predmet predmet,String brojIndeksa) {
		BazaStudenata.getInstance().dodajStudentaNaPredmet(predmet,brojIndeksa);
		AbstractTableModelPredmeti model=(AbstractTableModelPredmeti) PredmetiJTable.getInstance().getModel();
		model.fireTableDataChanged();
	}
	
	public void uklanjanjeStudentaSaPredmeta(Predmet predmet) {
		AbstractTableModelPredmeti model=(AbstractTableModelPredmeti) PredmetiJTable.getInstance().getModel();
		model.fireTableDataChanged();
	}
	
	public void promenaPosleDeserijalizacije() {
		AbstractTableModelStudenti model=(AbstractTableModelStudenti) StudentiJTable.getInstance().getModel();
		model.fireTableDataChanged();
	}
	
}