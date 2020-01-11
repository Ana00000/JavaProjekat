package modelsistema;

public enum Titula {
	DR("Dr"){
		@Override
		public String toString() {
			return "DR";
		}
	},PROF("Prof. dr"){
		@Override
		public String toString() {
			return "PROF";
		}
	};
	
	private String izlazImena;
	
	Titula(String izlazImena) {
		this.izlazImena=izlazImena;
	}
	public String izlazImena() {
	
		return izlazImena;

	}
}
