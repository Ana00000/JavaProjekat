package izgledaplikacije;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PredmetiTab extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PredmetiTab() {
		BorderLayout bLayout=new BorderLayout();
		this.setLayout(bLayout);
		JScrollPane scrollPred=new JScrollPane();
		PredmetiJTable predmetiTabela=PredmetiJTable.getInstance();
		this.add(scrollPred,BorderLayout.CENTER);
		scrollPred.setViewportView(predmetiTabela);
	}
}
