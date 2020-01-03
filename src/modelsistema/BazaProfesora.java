package modelsistema;

//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

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
	
	private BazaProfesora() {
		
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
		case 2:
			return profesor.getDatumRodjenja().toString();
		case 3:
			return  profesor.getAdresaStanovanja();
		case 4:
			return Integer.toString(profesor.getKontaktTelefon());
		case 5:
			return profesor.getEmail();
		case 6:
			return profesor.getAdresaKancelarije();
		case 7:
			return Integer.toString(profesor.getBrojLicneKarte());
		case 8:
			return profesor.getTitula().toString();
		case 9:
			return profesor.getZvanje().toString();
	
		default:
			return null;
		}
		
	}
	
	public void dodajProfesora(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, int kontaktTelefon, String email,
			String adresaKancelarije, int brojLicneKarte, Titula titula,Zvanje zvanje) {
		this.profesori.add(new Profesor(ime,prezime,datumRodjenja,adresaStanovanja,kontaktTelefon,email,adresaKancelarije,brojLicneKarte,titula,zvanje));
	}
	
	public void izbrisiProfesora(Integer br) {
		for(Profesor p: profesori) {
			if(p.getBrojLicneKarte()==br) {
				profesori.remove(p);
				
				for(Predmet predmet : BazaPredmeta.getInstance().getPredmeti()) {
					if(predmet.getProfesor().getBrojLicneKarte()==p.getBrojLicneKarte()) {
						BazaPredmeta.getInstance().uklanjanjeProfesoraSaPredmeta(predmet);
					}
				}
			}
		}
	}
	public void izmeniProfesora(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, int kontaktTelefon, String email,
			String adresaKancelarije, int brojLicneKarte, Titula titula,Zvanje zvanje){
		for(Profesor p:profesori) {
			if(p.getBrojLicneKarte()==brojLicneKarte) {
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
		}
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
	}/*
	public void deserijalizacijaProfesora(){
		try{
			System.out.println("\n\n");
			FileInputStream fOUTProfesor = new FileInputStream("profesori.ser");
			ObjectInputStream profesorIn= new ObjectInputStream(fOUTProfesor);
			ArrayList<Profesor> profesori = (ArrayList<Profesor>) profesorIn.readObject();
			BazaProfesora.getInstance().setProfesori(profesori);
		//	ProfesoriController.getInstance().promenaPosleDeserijalizacije();
			
			fOUTProfesor.close();
			profesorIn.close();
		}catch(IOException exp) {
			exp.printStackTrace();
		}catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
	}*/
}
