package modelsistema;

import java.io.Serializable;
import java.util.ArrayList;



public class Predmet implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private String sifra;
	private String naziv;
	private Semestar semestar;
	private TrenutnaGodina godinaStudijaUKojojSePredmetIzvodi;
	private Profesor profesor;
	private ArrayList<String> spisakStudenataKojiSlusajuPredmet;
	
    public Predmet() {
    	super();
    }
    public Predmet(String sifra,String naziv,Semestar semestar, TrenutnaGodina godina,Profesor prof, ArrayList<String> sps) {
    	this.sifra=sifra;
    	this.naziv=naziv;
    	this.semestar=semestar;
    	this.godinaStudijaUKojojSePredmetIzvodi=godina;
    	this.profesor=prof;
    	this.spisakStudenataKojiSlusajuPredmet=sps;
    }
    public Predmet(String sifra,String naziv,Semestar semestar, TrenutnaGodina godina,Profesor prof) {
    	this.sifra=sifra;
    	this.naziv=naziv;
    	this.semestar=semestar;
    	this.godinaStudijaUKojojSePredmetIzvodi=godina;
    	this.profesor=prof;
  
    }
	public String getSifra() {
		return sifra;
	}
	public void setSifra(String sifra) {
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Semestar getSemestar() {
		return semestar;
	}
	public void setSemestar(Semestar semestar) {
		this.semestar = semestar;
	}
	public TrenutnaGodina getGodinaStudijaUKojojSePredmetIzvodi() {
		return godinaStudijaUKojojSePredmetIzvodi;
	}
	public void setGodinaStudijaUKojojSePredmetIzvodi(
			TrenutnaGodina godinaStudijaUKojojSePredmetIzvodi) {
		this.godinaStudijaUKojojSePredmetIzvodi = godinaStudijaUKojojSePredmetIzvodi;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public ArrayList<String> getSpisakStudenataKojiSlusajuPredmet() {
		return spisakStudenataKojiSlusajuPredmet;
	}
	public void setSpisakStudenataKojiSlusajuPredmet(
			ArrayList<String> spisakStudenataKojiSlusajuPredmet) {
		this.spisakStudenataKojiSlusajuPredmet = spisakStudenataKojiSlusajuPredmet;
	}
    
}
