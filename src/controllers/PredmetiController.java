package controllers;

import java.util.ArrayList;

import izgledaplikacije.AbstractTableModelPredmeti;
import izgledaplikacije.PredmetiJTable;
import modelsistema.BazaPredmeta;
import modelsistema.BazaProfesora;
//import modelsistema.BazaStudenata;
import modelsistema.Predmet;
import modelsistema.Profesor;
import modelsistema.Semestar;
import modelsistema.TrenutnaGodina;

public class PredmetiController {
	private static PredmetiController instance=null;
	
	public static PredmetiController getInstance() {
		if(instance==null) {
			instance=new PredmetiController();
		}
		return instance;
	}

	private PredmetiController() {}
	
	public void dodajPredmet(String sifra,String naziv,Semestar semestar, TrenutnaGodina godina) {
		BazaPredmeta.getInstance().dodajPredmet(sifra,naziv,semestar,godina,new Profesor(), new ArrayList<String>());
		AbstractTableModelPredmeti model=(AbstractTableModelPredmeti) PredmetiJTable.getInstance().getModel();
		model.fireTableDataChanged();
	}
	
	public void izbrisiPredmet(Predmet p) {
		BazaPredmeta.getInstance().izbrisiPredmet(p);
		//BazaPredmeta.getInstance().izbrisiPredmet(p.getSifra());
		AbstractTableModelPredmeti model=(AbstractTableModelPredmeti) PredmetiJTable.getInstance().getModel();
		model.fireTableDataChanged();
	}
	
	public void IzmeniPredmet(String sifra,String naziv,Semestar semestar, TrenutnaGodina godina,Predmet pred){
		BazaPredmeta.getInstance().izmeniPredmet(sifra,naziv,semestar,godina,pred);
		AbstractTableModelPredmeti model=(AbstractTableModelPredmeti) PredmetiJTable.getInstance().getModel();
		model.fireTableDataChanged();
	}
	
	public void dodavanjeProfesoraNaPredmet(int index,String brojLicne) {
		BazaPredmeta.getInstance().dodajProfesoraNaPredmet(index,brojLicne);
		System.out.println(BazaProfesora.getInstance());
		AbstractTableModelPredmeti model=(AbstractTableModelPredmeti) PredmetiJTable.getInstance().getModel();
		model.fireTableDataChanged();
	}
	
	public void uklanjanjeProfesoraSaPredmeta(int index) {
		BazaPredmeta.getInstance().uklanjanjeProfesoraSaPredmeta(index);
		AbstractTableModelPredmeti model=(AbstractTableModelPredmeti) PredmetiJTable.getInstance().getModel();
		model.fireTableDataChanged();
	}
	
	
	public void promenaPosleDeserijalizacije() {
		AbstractTableModelPredmeti model=(AbstractTableModelPredmeti) PredmetiJTable.getInstance().getModel();
		model.fireTableDataChanged();
	}
	
}
