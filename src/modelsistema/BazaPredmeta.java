package modelsistema;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import controllers.PredmetiController;

public class BazaPredmeta implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static BazaPredmeta instance=null;
	
	public static BazaPredmeta getInstance() {
		if(instance==null) {
			instance=new BazaPredmeta();
		}
		return instance;
	}
	
	private List<Predmet> predmeti;
	private List<String> kolone;
	
	private BazaPredmeta() {
		initPredmete();
		//System.out.println("Konstruktor");
		
		this.kolone=new ArrayList<String>();
		this.kolone.add("Sifra");
		this.kolone.add("Naziv");
		this.kolone.add("Semestar");
		this.kolone.add("Godina");
		this.kolone.add("Profesor");
	}

	public List<Predmet> getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(List<Predmet> predmeti) {
		this.predmeti = predmeti;
	}
	

	public int getColumnCount() {
		return 5;
	}
	public Predmet getRow(int rowIndex) {
		return this.predmeti.get(rowIndex);
	}


	public String getColumnName(int index) {
		return this.kolone.get(index);
	}
	public String getValueAt(int row,int column) {
		Predmet predmet=this.predmeti.get(row);
		switch(column) {
		case 0:
			return predmet.getSifra();
		case 1:
			return predmet.getNaziv();
		case 2:
			return predmet.getSemestar().toString();
		case 3:
			return  predmet.getGodinaStudijaUKojojSePredmetIzvodi().toString();
		case 4:
			String profesor;
			if(predmet.getProfesor()==null){
				profesor="";
			}else profesor=predmet.getProfesor().getIme()+ " "+predmet.getProfesor().getPrezime();
			return profesor;
		
		default:
			return null;
		}
	}
	public void initPredmete() {
		this.predmeti=new ArrayList<Predmet>();
	
	//	predmeti.add(new Predmet("RA4","Programski Prevodioci",Semestar.PETI,TrenutnaGodina.TRECA,new Profesor("Dana", "Danic",new Date(), "Miskovac 8",0332445377, "danaDanic4@gmail.com", "Radnicka48", 895462, Titula.REDOVAN, Zvanje.DR, new ArrayList<Predmet>()), new ArrayList<String>()));
		//predmeti.add(new Predmet("RA50","OISISI",Semestar.PETI,TrenutnaGodina.TRECA,new Profesor("Minja", "Vidakovic",new Date(), "Ive Lole Ribara 8",0332445377, "minja4@gmail.com", "Radnicka49", 895462, Titula.REDOVAN, Zvanje.DR, new ArrayList<Predmet>()), new ArrayList<String>()));
		//predmeti.add(new Predmet("RA78","BAZE",Semestar.PETI,TrenutnaGodina.TRECA,new Profesor("Danilo", "Danic",new Date(), "Ive 8",0332445377, "daniloDanic4@gmail.com", "Radnicka50", 895462, Titula.REDOVAN, Zvanje.MR, new ArrayList<Predmet>()), new ArrayList<String>()));
		//predmeti.add(new Predmet("RA789","ANALIZA",Semestar.PRVI,TrenutnaGodina.PRVA,new Profesor("Minja", "Vidakovic",new Date(), "Ive Lole Ribara 8",0332445377, "minja4@gmail.com", "Radnicka49", 895462, Titula.REDOVAN, Zvanje.DR, new ArrayList<Predmet>()), new ArrayList<String>()));
		//predmeti.add(new Predmet("RA7855","ALGEBRA",Semestar.PRVI,TrenutnaGodina.PRVA,new Profesor("Danilo", "Danic",new Date(), "Ive 8",0332445377, "daniloDanic4@gmail.com", "Radnicka50", 895462, Titula.REDOVAN, Zvanje.MR, new ArrayList<Predmet>()), new ArrayList<String>()));
		//predmeti.add(new Predmet("RA5","C",Semestar.PRVI,TrenutnaGodina.PRVA,new Profesor("Minja", "Vidakovic",new Date(), "Ive Lole Ribara 8",0332445377, "minja4@gmail.com", "Radnicka49", 895462, Titula.REDOVAN, Zvanje.DR, new ArrayList<Predmet>()), new ArrayList<String>()));

		predmeti.add(new Predmet("OP301","Osnove Programiranja",Semestar.PRVI,TrenutnaGodina.PRVA,new Profesor(),new ArrayList<String>()));
		predmeti.add(new Predmet("DM881","Diskretna Matematika",Semestar.TRECI,TrenutnaGodina.DRUGA,new Profesor(),new ArrayList<String>()));
		predmeti.add(new Predmet("PP007","Paralelno programiranje",Semestar.PETI,TrenutnaGodina.TRECA,new Profesor(),new ArrayList<String>()));
		predmeti.add(new Predmet("RVP33","Racunarstvo visokih performansi",Semestar.SEDMI,TrenutnaGodina.CETVRTA,new Profesor(),new ArrayList<String>()));
		predmeti.add(new Predmet("JSD91","Jezici specificni za domen",Semestar.OSMI,TrenutnaGodina.CETVRTA,new Profesor(),new ArrayList<String>()));
		
	}
	
	public void dodajPredmet(Predmet predmet) {
		this.predmeti.add(predmet);
	}
	
	 public void dodajPredmet(String sifra,String naziv,Semestar semestar, TrenutnaGodina godina,Profesor prof,ArrayList<String> SpisakStudenti) {
		 this.predmeti.add(new Predmet(sifra,naziv,semestar,godina,prof,SpisakStudenti));	
	}
	
	
	public void izbrisiPredmet(Predmet p) {
		Profesor prof= p.getProfesor();
		if(prof != null) {
			for(Profesor profesor : BazaProfesora.getInstance().getProfesori()) {
				if(profesor.getBrojLicneKarte().equals(prof.getBrojLicneKarte())) {
					profesor.izbrisiPredmet(p.getSifra());
				}
			}
		}
		predmeti.remove(p);
		System.out.println(BazaProfesora.getInstance());
	}
	
	public void izbrisiPredmet(String sifra) {
		for(Predmet p:predmeti) {
			if(p.getSifra()==sifra) 
			{
				predmeti.remove(p);
				break;
			}
		}
	}
	public void izmeniPredmet(String sifra,String naziv,Semestar semestar, TrenutnaGodina godina,Predmet predmet) {
		
		for(Profesor profesor : BazaProfesora.getInstance().getProfesori()) {
			for(Predmet p : profesor.getSpisakPredmetaNaKojimaPredaje()) {
				if(p.getSifra().equals(predmet.getSifra())) {
				p.setSifra(sifra);
				p.setNaziv(naziv);
				p.setSemestar(semestar);
				p.setGodinaStudijaUKojojSePredmetIzvodi(godina);
				break;
				}
			}
			
	}
		
		predmet.setSifra(sifra);
		predmet.setNaziv(naziv);
		predmet.setSemestar(semestar);
		predmet.setGodinaStudijaUKojojSePredmetIzvodi(godina);
	}
	public void dodajProfesoraNaPredmet(Predmet predmet,String brojLicne) {
		int exists=0;
		for(Profesor p:BazaProfesora.getInstance().getProfesori()) {
			if(p.getBrojLicneKarte()==brojLicne) {
				exists=1;
				if(predmet.getProfesor().getBrojLicneKarte() !=p.getBrojLicneKarte()) {
					//predmet.getProfesor().getSpisakPredmetaNaKojimaPredaje().remove(predmet);//UKLONIMO PREDMET KOD STAROG PROFESORA
					predmet.setProfesor(p);//POSTAVLJAMO NOVOG PROFESORA NA PREDMET
					p.getSpisakPredmetaNaKojimaPredaje().add(predmet);//DODAMO PREDMET U LISTU KOD NOVOG PROFESORA 
				}else {//AKO SU ISTE LICNE ZNACI DA JE VEC PROFESOR NA TOM PREDMETU
					JOptionPane.showMessageDialog (null , "Profesor vec predaje na predmetu" , "GRESKA" , JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		if(exists==0) {
			JOptionPane.showMessageDialog(null, "NE postoji profesor sa datim brojem licne karte", "GRESKA", JOptionPane.ERROR_MESSAGE);
		}
	}
	public void dodajProfesoraNaPredmet(int indeks, String brLicneKarte) {
		int postoji = 0;
		Predmet predmet = BazaPredmeta.getInstance().getPredmeti().get(indeks);
		for(Profesor p : BazaProfesora.getInstance().getProfesori()) {
			System.out.println("stari broj licne"+ p.getBrojLicneKarte()+ "novi broj licne"+ brLicneKarte);
			if(p.getBrojLicneKarte().equals(brLicneKarte)) {System.out.println("isti su "); }
			if(p.getBrojLicneKarte().equals(brLicneKarte)) {
				postoji = 1;
				if(predmet.getProfesor() == null) {
					predmet.setProfesor(p);
					p.getSpisakPredmetaNaKojimaPredaje().add(predmet);
					break;
					}else if(!predmet.getProfesor().getBrojLicneKarte().equals(p.getBrojLicneKarte())){
					
					uklanjanjeProfesoraSaPredmeta(indeks);
					predmet.setProfesor(p);
					p.getSpisakPredmetaNaKojimaPredaje().add(predmet);	
					break;
				}else {
					JOptionPane.showMessageDialog(null, "Već postoji profesor na tom predmetu sa istim brojem lične karte", "Greška!", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		if(postoji == 0) {
			JOptionPane.showMessageDialog(null, "Ne postoji zadati broj lične karte u bazi profesora", "Greška!", JOptionPane.ERROR_MESSAGE);
		}
	}
	public void uklanjanjeProfesoraSaPredmeta(Predmet predmet) {
		predmet.getProfesor().getSpisakPredmetaNaKojimaPredaje().remove(predmet);//UKLONIMO PREDMET KOD PROFESORA
		predmet.setProfesor(new Profesor());//POSTAVIMO NOVOG PROFESORA
		System.out.println(BazaProfesora.getInstance());
	}
	public void uklanjanjeProfesoraSaPredmeta(int index) {
		Predmet predmet = BazaPredmeta.getInstance().getPredmeti().get(index);
		Profesor prof = BazaPredmeta.getInstance().getPredmeti().get(index).getProfesor();
		for(Profesor p : BazaProfesora.getInstance().getProfesori()) {
			if(p.getBrojLicneKarte().equals(prof.getBrojLicneKarte())) {
				p.izbrisiPredmet(predmet.getSifra());
				break;
			}
		}
		predmet.setProfesor(null);
		System.out.println(BazaProfesora.getInstance());
	}
	public void serijalizacijaPredmeta() {
		try {
			FileOutputStream fPredmeta = new FileOutputStream("predmeti.ser");
			ObjectOutputStream predmetOut = new ObjectOutputStream(fPredmeta);
			predmetOut.writeObject(BazaPredmeta.getInstance().getPredmeti());
			
			predmetOut.close();
			fPredmeta.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void deserijalizacijaPredmeta() {
		try {
			System.out.println("\n\n");
			FileInputStream fPredmeta= new FileInputStream("predmeti.ser");
			ObjectInputStream predmetiIn = new ObjectInputStream(fPredmeta);
			@SuppressWarnings("unchecked")
			ArrayList<Predmet> predmeti = (ArrayList<Predmet>) predmetiIn.readObject();
			BazaPredmeta.getInstance().setPredmeti(predmeti);
	     	PredmetiController.getInstance().promenaPosleDeserijalizacije();
			
				fPredmeta.close();
				predmetiIn.close();
		}catch (IOException e) {
			
			 e.printStackTrace();
		}catch (ClassNotFoundException cnf) {
		  	 
			cnf.printStackTrace();
		}
	}
}
