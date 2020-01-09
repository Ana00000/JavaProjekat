package modelsistema;

public enum TrenutnaGodina {
	PRVA("1"),
	DRUGA("2"), 
	TRECA("3"), 
	CETVRTA("4");
	
	private String broj;
	
	private TrenutnaGodina(final String broj2) {
		this.broj = broj2;
	}

	public String getBroj() {
		return broj;
	}
	
}
