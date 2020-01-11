package modelsistema;

public enum TrenutnaGodina {
	PRVA("1"){
		@Override
		public String toString() {
			return "PRVA";
		}
	},
	DRUGA("2"){
		@Override
		public String toString() {
			return "DRUGA";
		}
	}, 
	TRECA("3"){
		@Override
		public String toString() {
			return "TRECA";
		}
	}, 
	CETVRTA("4"){
		@Override
		public String toString() {
			return "CETVRTA";
		}
	};
	
	private String broj;
	
	private TrenutnaGodina(final String broj2) {
		this.broj = broj2;
	}

	public String getBroj() {
		return broj;
	}
	
}
