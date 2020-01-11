package modelsistema;

public enum Zvanje {
	VANREDNI("Vanredni profesor"){
		@Override
		public String toString() {
			return "VANREDNI";
		}
	}, REDOVAN("Redovni profesor"){
		@Override
		public String toString() {
			return "REDOVAN";
		}
	}, DOCENT("Docent"){
		@Override
		public String toString() {
			return "DOCENT";
		}
	};
	

	private String izlazImena;
	
	Zvanje(String izlazImena) {
		this.izlazImena=izlazImena;
	}
	public String izlazImena() {
	
		return izlazImena;
	}

}