package modelsistema;

public enum Titula {
	DR("Dr"),PROF("Prof. dr");
	
	private String izlazImena;
	
	Titula(String izlazImena) {
		this.izlazImena=izlazImena;
	}
	public String izlazImena() {
	
		return izlazImena;

	}
}
