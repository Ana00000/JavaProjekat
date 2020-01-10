package izgledaplikacije;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Help extends JDialog{

	private static final long serialVersionUID = 2420033596461581384L;

	GridBagLayout gb1;
	
	JPanel p0;
	
	GridBagConstraints gcp0;
	
	GridBagLayout gbp0;
	
	JTextArea text;
	
	GridBagConstraints gc1;
	
	JButton b1;
	JButton b2;
	JButton b3;
	
	public Help () {
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void jbInit() throws Exception {
		
		int screenHeight = 768*1/2;
		int screenWidth = 1366*1/2;
		setSize(screenWidth , screenHeight);
		setResizable(true);
		setModal(true);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.DARK_GRAY);
		this.setTitle("Help");
		
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
		
		b1 = new JButton("Menu Bar");
		b2 = new JButton("Toolbar");
		b3 = new JButton("Tabele");
		
		p0.add(b1);
		p0.add(b2);
		p0.add(b3);
		
		b1.addMouseListener(new MouseListener()
		    {

				@Override
				public void mouseClicked(MouseEvent e) {
					HelpMenuBar h1 = new HelpMenuBar();
					h1.setVisible(true);
				}

				@Override
				public void mousePressed(MouseEvent e) {
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					b1.setBackground(new Color(51,204,255));
				}

				@Override
				public void mouseExited(MouseEvent e) {
					b1.setBackground(new JButton().getBackground());
				}
		    	
		    } );
		
		 b2.addMouseListener(new MouseListener()
		    {

				@Override
				public void mouseClicked(MouseEvent e) {
					HelpToolbar h2 = new HelpToolbar();
					h2.setVisible(true);
				}

				@Override
				public void mousePressed(MouseEvent e) {
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					b2.setBackground(new Color(51,204,255));
				}

				@Override
				public void mouseExited(MouseEvent e) {
					b2.setBackground(new JButton().getBackground());
				}
		    	
		    } );
		 
		 b3.addMouseListener(new MouseListener()
		    {

				@Override
				public void mouseClicked(MouseEvent e) {
					HelpTabele h3 = new HelpTabele();
					h3.setVisible(true);
				}

				@Override
				public void mousePressed(MouseEvent e) {
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					b3.setBackground(new Color(51,204,255));
				}

				@Override
				public void mouseExited(MouseEvent e) {
					b3.setBackground(new JButton().getBackground());
				}
		    	
		    } );
		 
	}
}