package modelsistema;

import java.util.ArrayList;

public class Predmet {
	private int sifra;
	private String naziv;
	private int semestar;
	private int godinaStudijaUKojojSePredmetIzvodi;
	private Profesor profesor;
	private ArrayList<Student> spisakStudenataKojiSlusajuPredmet;
	
    public Predmet() {
    	super();
    }
    public Predmet(int sifra,String naziv,int semestar, int godina,Profesor prof, ArrayList<Student> sps) {
    	this.sifra=sifra;
    	this.naziv=naziv;
    	this.semestar=semestar;
    	this.godinaStudijaUKojojSePredmetIzvodi=godina;
    	this.profesor=prof;
    	this.spisakStudenataKojiSlusajuPredmet=sps;
    }
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getSemestar() {
		return semestar;
	}
	public void setSemestar(int semestar) {
		this.semestar = semestar;
	}
	public int getGodinaStudijaUKojojSePredmetIzvodi() {
		return godinaStudijaUKojojSePredmetIzvodi;
	}
	public void setGodinaStudijaUKojojSePredmetIzvodi(
			int godinaStudijaUKojojSePredmetIzvodi) {
		this.godinaStudijaUKojojSePredmetIzvodi = godinaStudijaUKojojSePredmetIzvodi;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public ArrayList<Student> getSpisakStudenataKojiSlusajuPredmet() {
		return spisakStudenataKojiSlusajuPredmet;
	}
	public void setSpisakStudenataKojiSlusajuPredmet(
			ArrayList<Student> spisakStudenataKojiSlusajuPredmet) {
		this.spisakStudenataKojiSlusajuPredmet = spisakStudenataKojiSlusajuPredmet;
	}
    
}
