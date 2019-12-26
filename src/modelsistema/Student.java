package modelsistema;

import java.util.ArrayList;

enum Status{B,S}

public class Student {
	private String ime;
	private String prezime;
	private String datumRodjenja;
	private String adresaStanovanja;
	private int kontaktTelefon;
	private String emailAdresa;
	private String brojIndeksa;
	private String datumUpisa;
	private int trenGodStudija;
	private Status status;
	private double prosOcena;
	private ArrayList<String>spisakPredmeta;
	
	public Student() {
		super();
	}

	public Student(String ime, String prezime, String datumRodjenja, String adresaStanovanja, int kontaktTelefon,
			String emailAdresa, String brojIndeksa, String datumUpisa, int trenGodStudija, Status status,
			double prosOcena, ArrayList<String> spisakPredmeta) {
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
	
	public int getTrenGodStudija() {
		return trenGodStudija;
	}
	
	public void setTrenGodStudija(int trenGodStudija) {
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
	
	public ArrayList<String> getSpisakPredmeta() {
		return spisakPredmeta;
	}
	
	public void setSpisakPredmeta(ArrayList<String> spisakPredmeta) {
		this.spisakPredmeta = spisakPredmeta;
	}
	
}
