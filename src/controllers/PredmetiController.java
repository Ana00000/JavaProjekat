package controllers;

import modelsistema.BazaPredmeta;
import modelsistema.BazaProfesora;
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
	
	public void dodajPredmet(String sifra,String naziv,Semestar semestar, TrenutnaGodina godina,Profesor prof) {
		BazaPredmeta.getInstance().dodajPredmet(sifra,naziv,semestar,godina,prof);
		
	}
	
	public void izbrisiPredmet(Predmet p) {
		BazaPredmeta.getInstance().izbrisiPredmet(p);
	}
	
	public void IzmeniPredmet(String sifra,String naziv,Semestar semestar, TrenutnaGodina godina,Profesor prof){
		BazaPredmeta.getInstance().izmeniPredmet(sifra,naziv,semestar,godina,prof);
	}
	
	public void dodavanjeProfesoraNaPredmet(Predmet predmet,String brojLicne) {
		BazaPredmeta.getInstance().dodajProfesoraNaPredmet(predmet,brojLicne);
		System.out.println(BazaProfesora.getInstance());
	}
	
	public void uklanjanjeProfesoraSaPredmeta(Predmet predmet) {
		BazaPredmeta.getInstance().uklanjanjeProfesoraSaPredmeta(predmet);
	}
	/*
	public void promenaPosleDeserijalizacije() {
		
	}*/
}
