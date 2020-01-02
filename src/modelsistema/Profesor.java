package modelsistema;

import java.sql.Date;
import java.util.ArrayList;

enum Zvanje {
	DR, MR;
} 
enum Titula {
	REDOVAN, VANREDNI, DOCENT, ASISTENT;
}
public class Profesor {

	private String ime;
	private String prezime;
	private Date datumRodjenja;
	private String adresaStanovanja;
	private int kontaktTelefon;
	private String email;
	private String adresaKancelarije;
	private int brojLicneKarte;
	private Titula  Titula;
	private Zvanje Zvanje;
	private ArrayList<Predmet> spisakPredmetaNaKojimaPredaje;

	public Profesor() {
		super();
	}
	public Profesor(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, int kontaktTelefon, String email,
			String adresaKancelarije, int brojLicneKarte, Titula titula,Zvanje zvanje, ArrayList<Predmet> spisak) {
		super();
		this.ime=ime;
		this.prezime=prezime;
		this.datumRodjenja=datumRodjenja;
		this.adresaStanovanja=adresaStanovanja;
		this.kontaktTelefon=kontaktTelefon;
		this.email=email;
		this.adresaKancelarije=adresaKancelarije;
		this.brojLicneKarte=brojLicneKarte;
		this.Titula=titula;
		this.Zvanje=zvanje;
		this.spisakPredmetaNaKojimaPredaje=spisak;
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
	public int getKontaktTelefon() {
		return kontaktTelefon;
	}
	public void setKontaktTelefon(int kontaktTelefon) {
		this.kontaktTelefon = kontaktTelefon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresaKancelarije() {
		return adresaKancelarije;
	}
	public void setAdresaKancelarije(String adresaKancelarije) {
		this.adresaKancelarije = adresaKancelarije;
	}
	public int getBrojLicneKarte() {
		return brojLicneKarte;
	}
	public void setBrojLicneKarte(int brojLicneKarte) {
		this.brojLicneKarte = brojLicneKarte;
	}
	public Titula getTitula() {
		return Titula;
	}
	public void setTitula(Titula titula) {
		Titula = titula;
	}
	public Zvanje getZvanje() {
		return Zvanje;
	}
	public void setZvanje(Zvanje zvanje) {
		Zvanje = zvanje;
	}
	public ArrayList<Predmet> getSpisakPredmetaNaKojimaPredaje() {
		return spisakPredmetaNaKojimaPredaje;
	}
	public void setSpisakPredmetaNaKojimaPredaje(
			ArrayList<Predmet> spisakPredmetaNaKojimaPredaje) {
		this.spisakPredmetaNaKojimaPredaje = spisakPredmetaNaKojimaPredaje;
	}
	
}
