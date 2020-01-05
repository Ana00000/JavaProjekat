package izgledaplikacije;

import javax.swing.JTabbedPane;

public class TabbedPane extends JTabbedPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TabbedPane() {
     	StudentiTab studenti = new StudentiTab();
		this.addTab("Studenti", studenti);
		
		ProfesoriTab profesori=new ProfesoriTab();
		this.addTab("Profesori",profesori);
		
		PredmetiTab predmeti=new PredmetiTab();
		this.addTab("Predmeti",predmeti);
		
	}
}
