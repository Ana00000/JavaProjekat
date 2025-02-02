package modelsistema;

import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;


public class Profesor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String ime;
	private String prezime;
	private Date datumRodjenja;
	private String adresaStanovanja;
	private String kontaktTelefon;
	private String email;
	private String adresaKancelarije;
	private String brojLicneKarte;
	private Titula  Titula;
	private Zvanje Zvanje;
	private ArrayList<Predmet> spisakPredmetaNaKojimaPredaje;

	public Profesor() {
		super();
	}
	public Profesor(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, String kontaktTelefon, String email,
			String adresaKancelarije, String brojLicneKarte, Titula titula,Zvanje zvanje, ArrayList<Predmet> spisak) {
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
	public Profesor(String ime, String prezime, java.util.Date datumRodjenja, String adresaStanovanja, String kontaktTelefon, String email,
			String adresaKancelarije, String brojLicneKarte, Titula titula,Zvanje zvanje) {
		super();
		this.ime=ime;
		this.prezime=prezime;
		this.datumRodjenja=(Date) datumRodjenja;
		this.adresaStanovanja=adresaStanovanja;
		this.kontaktTelefon=kontaktTelefon;
		this.email=email;
		this.adresaKancelarije=adresaKancelarije;
		this.brojLicneKarte=brojLicneKarte;
		this.Titula=titula;
		this.Zvanje=zvanje;
		
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
	public String getBrojLicneKarte() {
		return brojLicneKarte;
	}
	public void setBrojLicneKarte(String brojLicneKarte) {
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
	public void izbrisiPredmet(String sifra) {
		for(Predmet p : spisakPredmetaNaKojimaPredaje) {
			if(p.getSifra().equals(sifra)) {
				spisakPredmetaNaKojimaPredaje.remove(p);
				break;
			}
		}
	}
	
}
