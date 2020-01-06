package modelsistema;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import controllers.StudentiController;
import modelsistema.Status;
import modelsistema.Student;
import modelsistema.TrenutnaGodina;

public class BazaStudenata implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
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
		
		initStudente();
		
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

	public void initStudente() {
		this.studenti = new ArrayList<Student>();
		
		try {
			SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy.");
			Date date1 = format.parse("11.11.1998.");
			Date date2 = format.parse("24.05.1998.");
			Date date3 = format.parse("02.09.1998.");
			Date date4 = format.parse("11.11.2017.");
			Date date5 = format.parse("01.10.2017.");
			Date date6 = format.parse("01.10.2017.");
			studenti.add(new Student("Petar","Petrović",date1,"Radnička 12","0652023333","petar01@gmail.com","ra55/2017",
						date2,TrenutnaGodina.TRECA,Status.B,8.53));
			studenti.add(new Student("Lazar","Lazarević",date3,"Radnička 35","0656363545","lazlaz@gmail.com","ra85/2017",
						date4,TrenutnaGodina.TRECA,Status.B,9.93));
			studenti.add(new Student("Gojko","Gojković",date5,"Radnička 53","+381652033523","gojko0.0@gmail.com","ra155/2017",
						date6,TrenutnaGodina.TRECA,Status.B,8.93));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public List<Student> getStudenti() {
		return studenti;
	}

	public void setStudenata(List<Student> studenti) {
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
			return student.getKontaktTelefon();
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
	
	public void dodajStudenta(Student student) {
		this.studenti.add(student);
	}

	public void dodajStudenta(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, String kontaktTelefon,
			String emailAdresa, String brojIndeksa, Date datumUpisa, TrenutnaGodina trenGodStudija, Status status,double prosOcena) {
		
		this.studenti.add(new Student(ime,prezime,datumRodjenja,adresaStanovanja,kontaktTelefon,emailAdresa,brojIndeksa,datumUpisa,trenGodStudija,status,prosOcena));
		
	}
	
	public void izbrisiStudenta(Student student) {
		for(Student s : studenti) {
			if(s == student) {
				studenti.remove(s);
				break;
			}
		}
	}

	public void izmeniStudenta(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, String kontaktTelefon,
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
		}
	}

	public void dodajStudentaNaPredmet(Predmet predmet,String brojIndeksa) {
		int exists = 0;
		for(Student s:BazaStudenata.getInstance().getStudenti()) {
			if(s.getBrojIndeksa() == brojIndeksa) {
				exists = 1;
				predmet.getSpisakStudenataKojiSlusajuPredmet().add(s);
				s.getSpisakPredmeta().add(predmet);
			}
		}
		if(exists == 0) {
			JOptionPane.showMessageDialog(null, "Ne postoji student sa datim brojem indeksa", "GRESKA", JOptionPane.ERROR_MESSAGE);
		}
	}
	public void ukloniStudentaSaPredmeta(Predmet predmet,String brojIndeksa) {
		int exists = 0;
		for(Student s:BazaStudenata.getInstance().getStudenti()) {
			if(s.getBrojIndeksa() == brojIndeksa) {
				exists = 1;
				predmet.getSpisakStudenataKojiSlusajuPredmet().remove(s);
				s.getSpisakPredmeta().remove(predmet);
			}
		}
		if(exists == 0) {
			JOptionPane.showMessageDialog(null, "Ne postoji student sa datim brojem indeksa", "GRESKA", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void serijalizacijaStudenata() {
		try {
			FileOutputStream fStudenata = new FileOutputStream("studenti.ser");
			ObjectOutputStream studentOut = new ObjectOutputStream(fStudenata);
			studentOut.writeObject(BazaStudenata.getInstance().getStudenti());
			
			studentOut.close();
			fStudenata.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void deserijalizacijaStudenata() {
		try {
			System.out.println("\n\n");
			FileInputStream fStudenata = new FileInputStream("studenti.ser");
			ObjectInputStream studentIn = new ObjectInputStream(fStudenata);
			@SuppressWarnings("unchecked")
			ArrayList<Student> studenti = (ArrayList<Student>) studentIn.readObject();
			BazaStudenata.getInstance().setStudenata(studenti);
		    StudentiController.getInstance().promenaPosleDeserijalizacije();
			
			studentIn.close();
			fStudenata.close();
		}catch (IOException e) {
			
			 e.printStackTrace();
		}catch (ClassNotFoundException cnf) {
		  	 
			cnf.printStackTrace();
		}
	}
}