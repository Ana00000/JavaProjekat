package modelsistema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ime;
	private String prezime;
	private Date datumRodjenja;
	private String adresaStanovanja;
	private String kontaktTelefon;
	private String emailAdresa;
	private String brojIndeksa;
	private Date datumUpisa;
	private TrenutnaGodina trenGodStudija;
	private Status status;
	private double prosOcena;
	private ArrayList<Predmet>spisakPredmeta;
	
	public Student() {
		super();
	}

	public Student(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, String kontaktTelefon,
			String emailAdresa, String brojIndeksa, Date datumUpisa, TrenutnaGodina trenGodStudija, Status status,
			double prosOcena) {
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
	}
	
	public Student(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, String kontaktTelefon,
			String emailAdresa, String brojIndeksa, Date datumUpisa, TrenutnaGodina trenGodStudija, Status status,
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
	
	public Date getDatumRodjenja() {
		return datumRodjenja;
	}
	
	public void setDatumRodjenja(Date datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}
	
	public String getAdresaStanovanja() {
		return adresaStanovanja;
	}
	
	public void setAdresaStanovanja(String adresaStanovanja) {
		this.adresaStanovanja = adresaStanovanja;
	}
	
	public String getKontaktTelefon() {
		return kontaktTelefon;
	}
	
	public void setKontaktTelefon(String kontaktTelefon) {
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
	
	public Date getDatumUpisa() {
		return datumUpisa;
	}
	
	public void setDatumUpisa(Date datumUpisa) {
		this.datumUpisa = datumUpisa;
	}
	
	public TrenutnaGodina getTrenGodStudija() {
		return trenGodStudija;
	}
	
	public void setTrenGodStudija(TrenutnaGodina trenGodStudija) {
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
