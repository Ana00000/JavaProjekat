package izgledaplikacije;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class HelpToolbar extends JDialog{

	private static final long serialVersionUID = 2420033596461581384L;

	GridBagLayout gb1;
	
	JPanel p0;
	
	GridBagConstraints gcp0;
	
	GridBagLayout gbp0;
	
	JTextArea text;
	
	GridBagConstraints gc1;
	
	ImageIcon image1;
	
	public HelpToolbar() {
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void jbInit() throws Exception {
		
		int screenHeight = 768*9/20;
		int screenWidth = 1366*2/5;
		setSize(screenWidth , screenHeight);
		setResizable(true);
		setModal(true);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setTitle("Help za Toolbar");
		
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
		
		text = new JTextArea("1.Dugme prvo:\n  Služi za dodavanje studenta/profesora/predmeta na kraj njegove tabele.\n2.Dugme drugo:\n"
				+ "  Služi za izmenu izabranog studenta/profesora/predmeta iz njegove tabele\n  (ovim se sva polja mogu promeniti).\n3.Dugme"
				+ " treće:\n  Služi za brisanje izabranog studenta/profesora/predmeta iz njegove tabele.\n******************************\n"
				+ "Samo kod tabele predmeta:\n4.Dugme četvrto:\n  Služi za dodavanje profesora na izabrani predmet.\n"
				+ "5.Dugme peto:\n  Služi za dodavanje studenta na izabrani predmet.\n"
				+ "6.Dugme šesto:\n  Brisanje profesora sa izabranog predmeta."
				+ "\n******************************\n7.Dugme sedmo:\n  "
				+ "Služi za pretragu studenta/profesora /predmeta po"
				+ " vrednostima.");
		text.setEditable(false);
		text.setSelectionColor(Color.MAGENTA);
		text.setFont(new Font("Arial", Font.PLAIN, 13));
	    gc1 =  new GridBagConstraints();
		gc1.gridx = 0;
		gc1.gridy = 0;
	    p0.add(text,gc1);
	    
	}
}