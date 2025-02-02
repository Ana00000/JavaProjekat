package funkcionalnosti;

import izgledaplikacije.PredmetiJTable;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controllers.PredmetiController;



public class DodavanjeProfesoraNaPredmet extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	GridBagLayout gb1;
	
	JTextField tf1;
	
	JPanel p0;
	JPanel p1;
	JPanel p2;
	JPanel p3;
	JPanel pb1;
	JPanel pb2;
	
	GridBagConstraints gcp0;
	GridBagConstraints gcp1;
	GridBagConstraints gcp2;
	GridBagConstraints gcp3;
	
	GridBagConstraints gc1;
	GridBagConstraints gc2;
	GridBagConstraints gc3;
	GridBagConstraints gc4;
	GridBagConstraints gc5;
	
	GridBagLayout gbp0;
	GridBagLayout gbp1;
	GridBagLayout gbp2;
	
	JLabel l0;
	JLabel title;
	JLabel licna;
	JLabel l;
	
	JButton b1;
	JButton b2;
	
	public DodavanjeProfesoraNaPredmet() {
		
		try {
			Toolkit kit = Toolkit.getDefaultToolkit();
			Dimension screenSize = kit.getScreenSize();
			int screenHeight = screenSize.height*2/3;
			int screenWidth = screenSize.width/2 ;
			setSize(screenWidth , screenHeight);
			setResizable(true);
			setModal(true);
			setLocationRelativeTo(null);
			getContentPane().setBackground(Color.WHITE);
			this.setUndecorated(true);
			
		
		} catch (HeadlessException e) {
			e.printStackTrace();
		}
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	private void jbInit() throws Exception{

		gb1 = new GridBagLayout();
        gb1.rowHeights = new int[] {0,0,0};
        gb1.rowWeights = new double[] {1.0,0.0,1.0};
        gb1.columnWidths = new int[] {10};
        gb1.columnWeights = new double[] {1.0};
		getContentPane().setLayout(gb1);
		
		p0 = new JPanel();
		p0.setBackground(Color.LIGHT_GRAY);
		gcp0 =  new GridBagConstraints();
		gcp0.fill = GridBagConstraints.BOTH;
		gcp0.insets = new Insets(0,0,7,0);
		gcp0.gridx = 0;
		gcp0.gridy = 0;
		getContentPane().add(p0,gcp0);
		gbp0 = new GridBagLayout();
		gbp0.columnWidths = new int[]{0,0,0,0,0};
		gbp0.rowHeights = new int[]{0};
		gbp0.columnWeights = new double[]{0.0,1.0,0.0,0.0,0.0};
		gbp0.rowWeights = new double[]{0.0};
		p0.setLayout(gbp0);
		
		l0 = new JLabel(" ");
		l0.setFont(new Font("Arial", Font.PLAIN, 17));
	    gc1 =  new GridBagConstraints();
		gc1.gridx = 0;
		gc1.gridy = 0;
	    p0.add(l0,gc1);
		
		title = new JLabel("Dodavanje profesora na predmet");
		title.setFont(new Font("Arial", Font.PLAIN, 13));
		gc2 = new GridBagConstraints();
		gc2.anchor = GridBagConstraints.WEST;
		gc2.gridx = 1;
		gc2.gridy = 0;
		p0.add(title, gc2);
		
		p1 = new JPanel();
		p1.setBackground(Color.WHITE);
		gcp1 =  new GridBagConstraints();
		gcp1.fill = GridBagConstraints.BOTH;
		gcp1.insets = new Insets(7,30,7,30);
		gcp1.gridx = 0;
		gcp1.gridy = 1;
		getContentPane().add(p1,gcp1);
		gbp1 = new GridBagLayout();
		gbp1.columnWidths = new int[]{0,0};
		gbp1.rowHeights = new int[]{0};
		gbp1.columnWeights = new double[]{0.0, 1.0};
		gbp1.rowWeights = new double[]{0.0};
		p1.setLayout(gbp1);
		
		licna = new JLabel("Broj licne karte profesora*");
		licna.setFont(new Font("Arial", Font.PLAIN, 13));
		gc3 = new GridBagConstraints();
		gc3.insets = new Insets(10,0,15,15);
		gc3.gridx = 0;
		gc3.gridy = 0;
		p1.add(licna, gc3);
		
		tf1 = new JTextField(18);
		tf1.setFont(new Font("Futura", Font.PLAIN, 13));
		gc4 = new GridBagConstraints();
		gc4.fill = GridBagConstraints.HORIZONTAL;
		gc4.gridx = 1;
		gc4.gridy = 0;
		p1.add(tf1, gc4);
		
		p2 = new JPanel();
		p2.setBackground(Color.WHITE);
		gcp2 =  new GridBagConstraints();
		gcp2.insets = new Insets(7,35,3,20);
		gcp2.anchor = GridBagConstraints.SOUTHEAST;
		gcp2.gridx = 0;
		gcp2.gridy = 2;
		getContentPane().add(p2,gcp2);
		
	    b1 = new JButton("Odustanak");
	    b1.setFont(new Font("Arial", Font.PLAIN, 13));
	    b1.setBackground(Color.WHITE);
	    p2.add(b1);
	    
	    pb1 = new JPanel();
	    pb1.setBackground(Color.WHITE);
	    p2.add(pb1);
	    
	    pb2 = new JPanel();
	    pb2.setBackground(Color.WHITE);
	    p2.add(pb2);
	    
	    b2 = new JButton("Potvrda");
	    b2.setFont(new Font("Arial", Font.PLAIN, 13));
	    b2.setBackground(Color.WHITE);
	    p2.add(b2);
		/*
	    b1.addMouseListener(new MouseListener()
	    {

			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
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
				b1.setBackground(Color.WHITE);
			}
	    	
	    } );
	    
	    b2.addMouseListener(new MouseListener()
	    {

			@Override
			public void mouseClicked(MouseEvent e) {
				
				dispose();
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
				b2.setBackground(Color.WHITE);
			}
	    	
	    } );*/
		
	    KeyListener myKeyListener = new KeyListener() {

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				if(tf1.getText().trim().length()>0){
					b2.setEnabled(true); //POTREBNO JE PUPUNITI SVA POLJA
				}else  
					b2.setEnabled(false);
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
	    	
	    };
	    tf1.addKeyListener(myKeyListener);
	    
	    b2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				 int row = PredmetiJTable.getInstance().convertRowIndexToModel(PredmetiJTable.getInstance().getSelectedRow());
				//Predmet predmet = BazaPredmeta.getInstance().getRow(row);
				
				 PredmetiController.getInstance().dodavanjeProfesoraNaPredmet(row,tf1.getText());
				 dispose();
			}
	    	
	    });
	    
	    b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
	    	
	    } );
	    p3 = new JPanel();
		p3.setBackground(Color.LIGHT_GRAY);
		gcp3 =  new GridBagConstraints();
		gcp3.fill = GridBagConstraints.BOTH;
		gcp3.insets = new Insets(7,0,0,0);
		gcp3.gridx = 0;
		gcp3.gridy = 3;
		getContentPane().add(p3,gcp3);
		gbp2 = new GridBagLayout();
		gbp2.columnWidths = new int[]{0};
		gbp2.rowHeights = new int[]{0};
		gbp2.columnWeights = new double[]{1.0};
		gbp2.rowWeights = new double[]{0.0};
		p3.setLayout(gbp2);
		
		l = new JLabel(" ");
		l.setFont(new Font("Arial", Font.PLAIN, 17));
		gc5 = new GridBagConstraints();	
		gc5.gridx = 0;
		gc5.gridy = 0;
		p3.add(l,gc5);
		
	}
	
}
