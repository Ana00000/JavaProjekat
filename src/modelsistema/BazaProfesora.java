package modelsistema;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.ArrayList;

import java.util.List;

import controllers.ProfesoriController;

public class BazaProfesora implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static BazaProfesora instance=null;
	
	public static BazaProfesora getInstance() {
		if(instance==null) {
			instance=new BazaProfesora();
		}
		return instance;
		}
	
	private List<Profesor> profesori;
	private List<String> kolone;
	private DateFormat form;
	private BazaProfesora() {
		form = new SimpleDateFormat("dd.MM.yyyy.");
		initProfesore();
		
		this.kolone=new ArrayList<String>();
		this.kolone.add("Ime");
		this.kolone.add("Prezime");
		this.kolone.add("Datum Rodjenja");
		this.kolone.add("Adresa");
		this.kolone.add("Telefon");
		this.kolone.add("Email");
		this.kolone.add("Adresa kancelarije");
		this.kolone.add("Broj licne");
		this.kolone.add("Titula");
		this.kolone.add("Zvanje");
		
	}
	private void initProfesore() {
		this.profesori=new ArrayList<Profesor>();
		//profesori.add(new Profesor("Dana", "Danic",Calendar.getInstance().getTime(), "Miskovac 8",0332445377, "danaDanic4@gmail.com", "Radnicka48", 895462, Titula.REDOVAN, Zvanje.DR, new ArrayList<Predmet>()));
		//profesori.add(new Profesor("Minja", "Vidakovic",Calendar.getInstance().getTime(), "Ive Lole Ribara 8",0332445377, "minja4@gmail.com", "Radnicka49", 895462, Titula.REDOVAN, Zvanje.DR, new ArrayList<Predmet>()));
	//profesori.add(new Profesor("Danilo", "Danic",Calendar.getInstance().getTime(), "Ive 8",0332445377, "daniloDanic4@gmail.com", "Radnicka50", 895462, Titula.REDOVAN, Zvanje.MR, new ArrayList<Predmet>()));
		try {
			profesori.add(new Profesor("Aleksa","Petkovic",form.parse("15.01.1965."),"Temerinska 15,Novi Sad" ,"021/334-990","aleksa.petkovic@mailinator.com","Dositeja Obradovica 6,Novi Sad,MI 105", "007198721",Titula.PROF,Zvanje.REDOVAN,new ArrayList<Predmet>()));
			profesori.add(new Profesor("Jana","Lazarevic",form.parse("25.02.1963."),"Jovana Cvijica 26,Novi Sad","021/435-891","jana.lazarevic@mailinator.com","Dostija Obradovica 6,Novi Sad,Nastavni Blok 206","008431903",Titula.PROF,Zvanje.REDOVAN,new ArrayList<Predmet>()));
			profesori.add(new Profesor("Nadja","Aleksic",form.parse("23.03.1973."),"Gunduliceva 75,Novi Sad","021/730-172","nadja.aleksic@mailinator.com","Dostija Obradovica 6,Novi Sad,NTP 307","005671007",Titula.DR,Zvanje.VANREDNI,new ArrayList<Predmet>()));
			profesori.add(new Profesor("Djordje","Spasojevic",form.parse("24.08.1978."),"Sekspirova 44,Novi Sad","021/514-893","djordje.spasojevic@mailinator.com","Dositeja Obradovica 6,Novi Sad,MI 118","009999331",Titula.DR,Zvanje.VANREDNI,new ArrayList<Predmet>()));
			profesori.add(new Profesor("Elena","Milenkovic",form.parse("08.11.1985."),"Tolstojeva 52,Novi Sad","021/834-901","elena.milenkovic@mailinator.com","Dostija Obradovica 6,Novi Sad,Nastavni blok 217","003330976",Titula.DR,Zvanje.DOCENT,new ArrayList<Predmet>()));
			profesori.add(new Profesor("Teodor","Mladenovic",form.parse("14.12.1983."),"Jovana Subotica 33,Novi Sad","021/441-007","teodor.mladenovic@mailinator.com","Dositeja Obradovica 6,Novi Sad,NTP M35","007441998",Titula.DR,Zvanje.DOCENT,new ArrayList<Predmet>()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

	public List<Profesor> getProfesori() {
		return profesori;
	}

	public void setProfesori(List<Profesor> profesori) {
		this.profesori = profesori;
	}
	
	public int getColumnCount() {
		return 10;
	}
	
	public String getColumnName(int index) {
		return this.kolone.get(index);
	}
	
	public Profesor getRow(int rowIndex) {
		return this.profesori.get(rowIndex);
	}
	
	public String getValueAt(int row,int column) {
		Profesor profesor=this.profesori.get(row);
		
		switch(column) {
		case 0:
			return profesor.getIme();
		case 1:
			return profesor.getPrezime();
		case 2: {
		//	SimpleDateFormat datumFormatiran=new SimpleDateFormat("dd.MM.yyyy");
			//Date datum=profesor.getDatumRodjenja();
			//String datumF=datumFormatiran.format(datum);
			//return datumF;
			Date datum = profesor.getDatumRodjenja();
			String datumF = form.format(datum);
			return datumF;
			
		}
		case 3:
			return  profesor.getAdresaStanovanja();
		case 4:
			return profesor.getKontaktTelefon();
		case 5:
			return profesor.getEmail();
		case 6:
			return profesor.getAdresaKancelarije();
		case 7:
			return profesor.getBrojLicneKarte();
		case 8:
			return profesor.getTitula().toString();
		case 9:
			return profesor.getZvanje().toString();
	
		default:
			return null;
		}
		
	}
	
	public void dodajProfesora(Profesor p) {
		this.profesori.add(p);
	}
	
	public void dodajProfesora(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, String kontaktTelefon, String email,
			String adresaKancelarije, String brojLicneKarte, Titula titula,Zvanje zvanje,ArrayList<Predmet> predmeti) {
		this.profesori.add(new Profesor(ime,prezime,datumRodjenja,adresaStanovanja,kontaktTelefon,email,adresaKancelarije,brojLicneKarte,titula,zvanje,predmeti));
	}
	
	public void izbrisiProfesora(String br) {
		for(Profesor p: profesori) {
			if(p.getBrojLicneKarte()==br) {
				profesori.remove(p); //UKLANJAMO PROFESORA IZ BAZE PROFESORA
				
				for(Predmet predmet : BazaPredmeta.getInstance().getPredmeti()) {//PREDMETI IZ BAZE PREDMETA
					if(predmet.getProfesor().getBrojLicneKarte()==p.getBrojLicneKarte()) {
						BazaPredmeta.getInstance().uklanjanjeProfesoraSaPredmeta(predmet);//BRISEMO PROFESORA SA PREDMETA
					}
				}
				break;
			}
		}
	}
	public void izbrisiProfesoraP(Profesor p) {
		for(Profesor profesor : profesori) {
			if(profesor==p) {
				profesori.remove(profesor);
				break;
			}
		}
	}
	public void izmeniProfesora(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, String kontaktTelefon, String email,
			String adresaKancelarije, String brojLicneKarte, Titula titula,Zvanje zvanje,ArrayList<Predmet> predmeti,Profesor p){
	
				p.setIme(ime);
				p.setPrezime(prezime);
				p.setDatumRodjenja(datumRodjenja);
				p.setAdresaStanovanja(adresaStanovanja);
				p.setKontaktTelefon(kontaktTelefon);
				p.setEmail(email);
				p.setAdresaKancelarije(adresaKancelarije);
				p.setBrojLicneKarte(brojLicneKarte);
				p.setTitula(titula);
				p.setZvanje(zvanje);
			
		
	}
	public void serijalizacijaProfesora() {
		try {
			FileOutputStream fOUTProfesor = new FileOutputStream("profesori.ser");
			ObjectOutputStream profesorOut = new ObjectOutputStream(fOUTProfesor);
			profesorOut.writeObject(BazaProfesora.getInstance().getProfesori());
			profesorOut.close();
			fOUTProfesor.close();
		}catch(IOException exp) {
			exp.printStackTrace();
		}
	}
	public void deserijalizacijaProfesora(){
		try{
			System.out.println("\n\n");
			FileInputStream fOUTProfesor = new FileInputStream("profesori.ser");
			ObjectInputStream profesorIn= new ObjectInputStream(fOUTProfesor);
			@SuppressWarnings("unchecked")
			ArrayList<Profesor> profesori = (ArrayList<Profesor>) profesorIn.readObject();
			BazaProfesora.getInstance().setProfesori(profesori);
			ProfesoriController.getInstance().promenaPosleDeserijalizacije();
			
			fOUTProfesor.close();
			profesorIn.close();
		}catch(IOException exp) {
			exp.printStackTrace();
		}catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
	}
}
