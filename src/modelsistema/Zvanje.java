package modelsistema;

public enum Zvanje {
	VANREDNI("Vanredni profesor"), REDOVAN("Redovni profesor"), DOCENT("Docent");
	

	private String izlazImena;
	
	Zvanje(String izlazImena) {
		this.izlazImena=izlazImena;
	}
	public String izlazImena() {
	
		return izlazImena;
	}

}