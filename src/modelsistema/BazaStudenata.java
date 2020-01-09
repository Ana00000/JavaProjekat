package modelsistema;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DateFormat;
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
	private DateFormat form;
	
	private BazaStudenata() {
		form = new SimpleDateFormat("dd.MM.yyyy.");
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
			
			studenti.add(new Student("Luka", "Jovanović", form.parse("01.01.2000."), "Karađorđeva 83, Novi Sad", "021/333-555",
					 "luka.jovanovic@mailinator.com", "RA 1/2019", form.parse("01.07.2019."), TrenutnaGodina.PRVA, Status.B, 0));
			
			studenti.add(new Student("Sofija", "Petrović", form.parse("16.05.2000."), "Miloša Pocerca 55, Šabac", "015/343-356",
					 "sofija.petrovic@mailinator.com", "RA 5/2019",	form.parse("11.07.2019."), TrenutnaGodina.PRVA, Status.B, 0));
			
			studenti.add(new Student("Stefan", "Nikolić", form.parse("18.03.2000."), "Knez Mihajlova 16, Beograd", "011/9234-857",
					 "stefan.nikolic@mailinator.com", "RA 3/2019",	form.parse("03.07.2019."), TrenutnaGodina.PRVA, Status.B, 0));
			
			studenti.add(new Student("Dunja", "Ilić", form.parse("11.11.2000."), "Petefi Šandora 15, Novi Sad", "021/433-958",
					 "dunja.ilic@mailinator.com", "RA 2/2019",	form.parse("01.07.2019."), TrenutnaGodina.PRVA, Status.S, 0));
			
			studenti.add(new Student("Lazar", "Đorđević", form.parse("03.12.2000."), "Josip Broz Tito 13, Subotica", "024/333-559",
					 "lazar.djordjevic@mailinator.com", "RA 4/2019", form.parse("06.07.2019."), TrenutnaGodina.PRVA, Status.S, 0));
			
			studenti.add(new Student("Sara", "Pavlović", form.parse("03.12.1999."), "Vojvode Mišića 23, Šabac", "015/313-061",
					 "sara.pavlovic@mailinator.com", "RA 3/2018",	form.parse("01.07.2018."), TrenutnaGodina.DRUGA, Status.B, 0));
			
			studenti.add(new Student("Vuk", "Marković", form.parse("03.12.1999."), "Temerinska 133, Novi Sad", "021/351-091",
					 "vuk.markovic@mailinator.com", "RA 15/2018",	form.parse("11.07.2018."), TrenutnaGodina.DRUGA, Status.B, 0));
			
			studenti.add(new Student("Teodora", "Popović", form.parse("03.12.1998."), "Surepova 15, Šabac", "015/324-500",
					 "teodora.popovic@mailinator.com", "RA 133/2017",	form.parse("03.07.2017."), TrenutnaGodina.DRUGA, Status.S, 0));
			
			studenti.add(new Student("Filip", "Stojanović", form.parse("03.12.1998."), "Francuska 113, Beograd", "011/2333-900",
					 "filip.stojanovic@mailinator.com", "RA 122/2017",	form.parse("02.07.2017."), TrenutnaGodina.DRUGA, Status.S, 0));
			
			studenti.add(new Student("Ana", "Živković", form.parse("03.12.1998."), "Kralja Petra 20, Novi Sad", "021/231-114",
					 "ana.zivkovic@mailinator.com", "RA 201/2017",	form.parse("04.07.2017."), TrenutnaGodina.DRUGA, Status.S, 0));
			
			studenti.add(new Student("Viktor", "Janković", form.parse("03.12.1998."), "Gogoljeva 3, Novi Sad", "021/135-463",
					 "viktor.jankovic@mailinator.com", "RA 1/2017",	form.parse("01.07.2017."), TrenutnaGodina.TRECA, Status.B, 0));
			
			studenti.add(new Student("Petra", "Todorović", form.parse("03.12.1998."), "Njegoševa 2, Novi Sad", "021/903-463",
					 "petra.todorovic@mailinator.com", "RA 5/2017",	form.parse("12.07.2017."), TrenutnaGodina.TRECA, Status.B, 0));
			
			studenti.add(new Student("Andrej", "Stanković", form.parse("03.12.1998."), "Radoja Domanovića 5, Novi Sad", "021/731-067",
					 "andrej.stankovic@mailinator.com", "RA 33/2017",	form.parse("19.07.2017."), TrenutnaGodina.TRECA, Status.B, 0));
			
			studenti.add(new Student("Mila", "Ristić", form.parse("03.12.1997."), "Vojvode Stepe 183, Beograd", "011/4333-800",
					 "mila.ristic@mailinator.com", "RA 152/2016",	form.parse("15.07.2016."), TrenutnaGodina.TRECA, Status.S, 0));
			
			studenti.add(new Student("Pavle", "Kostić", form.parse("03.12.1997."), "Crnotravska 13, Beograd", "011/3130-007",
					 "pavle.kostic@mailinator.com", "RA 104/2016",	form.parse("06.07.2016."), TrenutnaGodina.TRECA, Status.S, 0));
			
			studenti.add(new Student("Lena", "Kovačević", form.parse("03.12.1997."), "Bulevar Oslobođenja 143, Novi Sad", "021/5333-801",
					 "lena.kovacevic@mailinator.com", "RA 1/2016",	form.parse("01.07.2016."), TrenutnaGodina.CETVRTA, Status.B, 0));
			
			studenti.add(new Student("Filip", "Živković", form.parse("03.12.1997."), "1300 Kaplara, Šabac", "015/333-500",
					 "filip.zivkovic@mailinator.com", "RA 5/2016",	form.parse("21.07.2016."), TrenutnaGodina.CETVRTA, Status.B, 0));
			
			studenti.add(new Student("Tara", "Dmiitrijević", form.parse("03.12.1996."), "Milovana Glišića, Valjevo", "014/303-007",
					 "tara.dimitrijevic@mailinator.com", "RA 33/2015",	form.parse("23.07.2015."), TrenutnaGodina.CETVRTA, Status.S, 0));
			
			studenti.add(new Student("Vasilije", "Micić", form.parse("03.12.1996."), "Vuka Karadžića, Loznica", "015/101-909",
					 "vasilije.micic@mailinator.com", "RA 102/2015",	form.parse("04.07.2015."), TrenutnaGodina.CETVRTA, Status.S, 0));
			
			studenti.add(new Student("Lenka", "Jović", form.parse("03.12.1997."), "Bulevar Mihajla Pupina, Novi Sad", "021/431-500",
					 "lenka.jovic@mailinator.com", "RA 244/2016",	form.parse("07.07.2016."), TrenutnaGodina.CETVRTA, Status.S, 0));
			
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
			Date datum = student.getDatumRodjenja();
			String datumF = form.format(datum);
			return datumF;
		case 3:
			return  student.getAdresaStanovanja();
		case 4:
			return student.getKontaktTelefon();
		case 5:
			return student.getEmailAdresa();
		case 6:
			return student.getBrojIndeksa();
		case 7:
			Date datum2 = student.getDatumUpisa();
			String datumF2 = form.format(datum2);
			return datumF2;
		case 8:
			return student.getTrenGodStudija().getBroj();
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
			String emailAdresa, String brojIndeksa, Date datumUpisa, TrenutnaGodina trenGodStudija, Status status,double prosOcena,Student s) {
		
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

	public void dodajStudentaNaPredmet(Predmet predmet,String brojIndeksa) {
		int exists = 0;
		for(Student s:BazaStudenata.getInstance().getStudenti()) {
			
			if(s.getBrojIndeksa().equals(brojIndeksa)) {
				exists = 1;
				if(!predmet.getSpisakStudenataKojiSlusajuPredmet().contains(brojIndeksa))
				{
					predmet.getSpisakStudenataKojiSlusajuPredmet().add(brojIndeksa);
				}else {
					JOptionPane.showMessageDialog (null , "Student već sluša taj predmet" , "GREŠKA" , JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		if(exists == 0) {
			JOptionPane.showMessageDialog(null, "Ne postoji student sa datim brojem indeksa", "GREŠKA", JOptionPane.ERROR_MESSAGE);
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