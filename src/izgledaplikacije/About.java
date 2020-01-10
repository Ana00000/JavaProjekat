package izgledaplikacije;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class About extends JDialog{

	private static final long serialVersionUID = 2420033596461581384L;

	GridBagLayout gb1;
	
	JPanel p0;
	
	GridBagConstraints gcp0;
	
	GridBagLayout gbp0;
	
	JTextArea text;
	
	GridBagConstraints gc1;
	
	
	public About () {
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void jbInit() throws Exception {
		
		int screenHeight = 768*1/3;
		int screenWidth = 1366*1/3;
		setSize(screenWidth , screenHeight);
		setResizable(true);
		setModal(true);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.DARK_GRAY);
		this.setTitle("About");
		
		gb1 = new GridBagLayout();
        gb1.rowHeights = new int[] {0};
        gb1.rowWeights = new double[] {1.0};
        gb1.columnWidths = new int[] {10};
        gb1.columnWeights = new double[] {1.0};
		getContentPane().setLayout(gb1);
		
		p0 = new JPanel();
		gcp0 =  new GridBagConstraints();
		gcp0.gridx = 0;
		gcp0.gridy = 0;
		getContentPane().add(p0,gcp0);
		gbp0 = new GridBagLayout();
		gbp0.columnWidths = new int[]{0};
		gbp0.rowHeights = new int[]{0};
		gbp0.columnWeights = new double[]{0.0};
		gbp0.rowWeights = new double[]{0.0};
		p0.setLayout(gbp0);
		
		text = new JTextArea("Studentska služba\n\nVersion: 2019-09 R (4.13.0)\n\nStudent 1:\n        Ana Atanacković,   RA43/2017\n\n"
				+ "Student 2:\n        Emina Turković,   RA49/2017\n\nSvrha:\n  Korišćenje tabela za unos,izmenu,brisanje,traženje"
				+ " ili sortiranje\n  studenata/profesora/predmeta.");
		text.setEditable(false);
		text.setSelectionColor(Color.MAGENTA);
		text.setFont(new Font("Arial", Font.PLAIN, 13));
	    gc1 =  new GridBagConstraints();
		gc1.gridx = 0;
		gc1.gridy = 0;
	    p0.add(text,gc1);
	    
	}
}