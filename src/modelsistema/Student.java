package modelsistema;

import java.util.ArrayList;

public class Student {
	private String ime;
	private String prezime;
	private String datumRodjenja;
	private String adresaStanovanja;
	private int kontaktTelefon;
	private String emailAdresa;
	private String brojIndeksa;
	private String datumUpisa;
	private String trenGodStudija;
	private Status status;
	private double prosOcena;
	private ArrayList<Predmet>spisakPredmeta;
	
	public Student() {
		super();
	}

	public Student(String ime, String prezime, String datumRodjenja, String adresaStanovanja, int kontaktTelefon,
			String emailAdresa, String brojIndeksa, String datumUpisa, String trenGodStudija, Status status,
			double prosOcena, ArrayList<Predmet> spisakPredmeta) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;
		this.adresaStanovanja = adresaStanovanja;
		this.kontaktTelefon = kontaktTelefon;
		this.emailAdresa = emailAdresa;
		this.brojIndeksa = brojIndeksa;
		this.datumUpisa = datumUpisa;
		this.trenGodStudija = trenGodStudija;
		this.status = status;
		this.prosOcena = prosOcena;
		this.spisakPredmeta = spisakPredmeta;
	}

	public String getIme() {
		return ime;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public String getDatumRodjenja() {
		return datumRodjenja;
	}
	
	public void setDatumRodjenja(String datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}
	
	public String getAdresaStanovanja() {
		return adresaStanovanja;
	}
	
	public void setAdresaStanovanja(String adresaStanovanja) {
		this.adresaStanovanja = adresaStanovanja;
	}
	
	public int getKontaktTelefon() {
		return kontaktTelefon;
	}
	
	public void setKontaktTelefon(int kontaktTelefon) {
		this.kontaktTelefon = kontaktTelefon;
	}
	
	public String getEmailAdresa() {
		return emailAdresa;
	}
	
	public void setEmailAdresa(String emailAdresa) {
		this.emailAdresa = emailAdresa;
	}
	
	public String getBrojIndeksa() {
		return brojIndeksa;
	}
	
	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}
	
	public String getDatumUpisa() {
		return datumUpisa;
	}
	
	public void setDatumUpisa(String datumUpisa) {
		this.datumUpisa = datumUpisa;
	}
	
	public String getTrenGodStudija() {
		return trenGodStudija;
	}
	
	public void setTrenGodStudija(String trenGodStudija) {
		this.trenGodStudija = trenGodStudija;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public double getProsOcena() {
		return prosOcena;
	}
	
	public void setProsOcena(double prosOcena) {
		this.prosOcena = prosOcena;
	}
	
	public ArrayList<Predmet> getSpisakPredmeta() {
		return spisakPredmeta;
	}
	
	public void setSpisakPredmeta(ArrayList<Predmet> spisakPredmeta) {
		this.spisakPredmeta = spisakPredmeta;
	}
	
}
