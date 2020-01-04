package izgledaplikacije;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ProfesoriTab extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ProfesoriTab() {
		BorderLayout bLayout=new BorderLayout();
		this.setLayout(bLayout);
		JScrollPane scrollProf=new JScrollPane();
		ProfesoriJTable profesoriTabela=ProfesoriJTable.getInstance();
		this.add(scrollProf,BorderLayout.CENTER);
		scrollProf.setViewportView(profesoriTabela);
	}
}
