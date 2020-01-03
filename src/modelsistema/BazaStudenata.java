package modelsistema;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import modelsistema.Status;
import modelsistema.Student;
import modelsistema.TrenutnaGodina;



public class BazaStudenata {
	private static BazaStudenata instance=null;

	public static BazaStudenata getInstance() {
		if(instance==null) {
			instance=new BazaStudenata();
		}
		return instance;
	}
	
	private List<Student> studenti;
	private List<String> kolone;

	private BazaStudenata() {
		
		this.kolone=new ArrayList<String>();
		this.kolone.add("Ime");
		this.kolone.add("Prezime");
		this.kolone.add("Datum rođenja");
		this.kolone.add("Adresa stanovanja");
		this.kolone.add("Kontakt telefon");
		this.kolone.add("E-mail adresa");
		this.kolone.add("Broj indeksa");
		this.kolone.add("Datum upisa");
		this.kolone.add("Trenutna godina studija");
		this.kolone.add("Status");
		this.kolone.add("Prosečna ocena");

	}

	public List<Student> getStudenti() {
		return studenti;
	}

	public void setIgraci(List<Student> studenti) {
		this.studenti=studenti;
	}
	
	public int getColumnCount() {
		return 11; 
	}

	public String getColumnName(int index) {
		return this.kolone.get(index);
	}

	public Student getRow(int rowIndex) {
		return this.studenti.get(rowIndex);
	}
	public String getValueAt(int row,int column) {
		Student student=this.studenti.get(row);
		switch(column) {
		case 0:
			return student.getIme();
		case 1:
			return student.getPrezime();
		case 2:
			return student.getDatumRodjenja().toString();
		case 3:
			return  student.getAdresaStanovanja();
		case 4:
			return Long.toString(student.getKontaktTelefon());
		case 5:
			return student.getEmailAdresa();
		case 6:
			return student.getBrojIndeksa();
		case 7:
			return student.getDatumUpisa().toString();
		case 8:
			return student.getTrenGodStudija().toString();
		case 9:
			return student.getStatus().toString();
		case 10:
			return Long.toString((long) student.getProsOcena());
		default:
			return null;
		}

	}

	public void dodajStudenta(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, int kontaktTelefon,
			String emailAdresa, String brojIndeksa, Date datumUpisa, TrenutnaGodina trenGodStudija, Status status,double prosOcena) {
		this.studenti.add(new Student(ime,prezime,datumRodjenja,adresaStanovanja,kontaktTelefon,emailAdresa,brojIndeksa,datumUpisa,trenGodStudija,status,prosOcena));
	}

	public void izbrisiStudenta(String index) {
		for(Student s : studenti) {
			if(s.getBrojIndeksa()==index) {
				studenti.remove(s);
				break;
			}
		}
	}

	public void izmeniStudenta(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, int kontaktTelefon,
			String emailAdresa, String brojIndeksa, Date datumUpisa, TrenutnaGodina trenGodStudija, Status status,double prosOcena) {
		for (Student s:studenti) {
			if(s.getBrojIndeksa()==brojIndeksa) {
				s.setIme(ime);
				s.setPrezime(prezime);
				s.setDatumRodjenja(datumRodjenja);
				s.setAdresaStanovanja(adresaStanovanja);
				s.setKontaktTelefon(kontaktTelefon);
				s.setEmailAdresa(emailAdresa);
				s.setBrojIndeksa(brojIndeksa);
				s.setDatumUpisa(datumUpisa);
				s.setTrenGodStudija(trenGodStudija);
				s.setStatus(status);
				s.setProsOcena(prosOcena);
			}
		}	}

}