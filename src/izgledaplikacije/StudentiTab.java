package izgledaplikacije;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class StudentiTab extends JPanel{

	private static final long serialVersionUID = 1L;
	public StudentiTab() {
	BorderLayout bLayout=new BorderLayout();
	this.setLayout(bLayout);
	JScrollPane scrollPred=new JScrollPane();
	StudentiJTable studentiTabela=StudentiJTable.getInstance();
	this.add(scrollPred,BorderLayout.CENTER);
	scrollPred.setViewportView(studentiTabela);
	}
}
