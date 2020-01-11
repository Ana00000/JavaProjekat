package modelsistema;

public enum Semestar {
	PRVI
	{
		@Override
		public String toString() {
			return "PRVI";
		}
	}, DRUGI
	{
		@Override
		public String toString() {
			return "DRUGI";
		}
	}, TRECI
	{
		@Override
		public String toString() {
			return "TRECI";
		}
	}, CETVRTI{
		@Override
		public String toString() {
			return "CETVRTI";
		}
	}, PETI
	{
		@Override
		public String toString() {
			return "PETI";
		}
	}, SESTI
	{
		@Override
		public String toString() {
			return "SESTI";
		}
	}, SEDMI
	{
		@Override
		public String toString() {
			return "SEDMI";
		}
	}, OSMI{
		@Override
		public String toString() {
			return "OSMI";
		}
	};
}
