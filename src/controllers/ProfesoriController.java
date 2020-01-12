package controllers;

import java.util.ArrayList;
import java.util.Date;

import izgledaplikacije.AbstractTableModelPredmeti;
import izgledaplikacije.AbstractTableModelProfesori;
import izgledaplikacije.PredmetiJTable;
import izgledaplikacije.ProfesoriJTable;
import modelsistema.BazaProfesora;
import modelsistema.Predmet;
import modelsistema.Profesor;
import modelsistema.Titula;
import modelsistema.Zvanje;

public class ProfesoriController {
	private static ProfesoriController instance=null;
	
	public static ProfesoriController getInstance() {
		if(instance==null) {
			instance=new ProfesoriController(); 
		}
		return instance;
	}
	
	 public void izbrisiProfesora(String brojLicneKarte) {
        BazaProfesora.getInstance().izbrisiProfesora(brojLicneKarte);
		
		AbstractTableModelProfesori model=(AbstractTableModelProfesori) ProfesoriJTable.getInstance().getModel();
		AbstractTableModelPredmeti model1=(AbstractTableModelPredmeti) PredmetiJTable.getInstance().getModel();
		model.fireTableDataChanged();
		model1.fireTableDataChanged();
	}
	
	public void izbrisiProfesoraP(Profesor p) {
		BazaProfesora.getInstance().izbrisiProfesoraP(p);
		
		AbstractTableModelProfesori model=(AbstractTableModelProfesori) ProfesoriJTable.getInstance().getModel();
		model.fireTableDataChanged();
	}
	
	public void dodajProfesora(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, String kontaktTelefon, String email,
			String adresaKancelarije, String brojLicneKarte, Titula titula,Zvanje zvanje,ArrayList<Predmet> predmeti) {
		BazaProfesora.getInstance().dodajProfesora(ime, prezime, datumRodjenja, adresaStanovanja, kontaktTelefon, email, adresaKancelarije, brojLicneKarte, titula, zvanje,predmeti);
		
		AbstractTableModelProfesori model=(AbstractTableModelProfesori) ProfesoriJTable.getInstance().getModel();
		model.fireTableDataChanged();
	}
	
	public void promenaPosleDeserijalizacije() {
		AbstractTableModelProfesori model=(AbstractTableModelProfesori) ProfesoriJTable.getInstance().getModel();
		model.fireTableDataChanged();
	}

	public void izmenaProfesora(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, String kontaktTelefon, String email,
			String adresaKancelarije, String brojLicneKarte, Titula titula,Zvanje zvanje,ArrayList<Predmet> predmeti,Profesor p) {
		
		BazaProfesora.getInstance().izmeniProfesora(ime, prezime, datumRodjenja, adresaStanovanja, kontaktTelefon, email,
				adresaKancelarije, brojLicneKarte, titula, zvanje,predmeti,p
				);
		AbstractTableModelProfesori model = (AbstractTableModelProfesori) ProfesoriJTable.getInstance().getModel();
		model.fireTableDataChanged();
	}
}
