package funkcionalnosti;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import modelsistema.Predmet;
import modelsistema.Semestar;
import modelsistema.TrenutnaGodina;
import controllers.PredmetiController;

public class IzmenaPredmeta extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	GridBagLayout gb1;
	GridBagLayout gbp0;
	GridBagLayout gbp1;
	GridBagLayout gbp2;
	GridBagLayout gbp3;
	GridBagLayout gbp4;
	GridBagLayout gbp5;
	GridBagLayout gbp6;
	GridBagLayout gbp7;
	GridBagLayout gbp8;
	GridBagLayout gbp9;
	GridBagLayout gbp10b1;
	GridBagLayout gbp10b2;
	GridBagLayout gbp11;
	GridBagLayout gbp12;
	
	GridBagConstraints gc0;
	GridBagConstraints gc1;
	GridBagConstraints gc2;
	GridBagConstraints gc3;
	GridBagConstraints gc4;
	GridBagConstraints gc5;
	GridBagConstraints gc6;
	GridBagConstraints gc7;
	GridBagConstraints gc8;
	GridBagConstraints gc9; 
	GridBagConstraints gc10;
	GridBagConstraints gc11;
	GridBagConstraints gc12;
	GridBagConstraints gc13;
	GridBagConstraints gc14;
	GridBagConstraints gc15;
	GridBagConstraints gc16;
	GridBagConstraints gc17;
	GridBagConstraints gc18;
	GridBagConstraints gc19;
	GridBagConstraints gc20;
	GridBagConstraints gc21;
	GridBagConstraints gc22;
	GridBagConstraints gc23;
	
	GridBagConstraints gcp0;
	GridBagConstraints gcp00;
	
	GridBagConstraints gcp1;
	GridBagConstraints gcp2;
	GridBagConstraints gcp3;
	GridBagConstraints gcp4;
	GridBagConstraints gcp5;
	GridBagConstraints gcp6;
	GridBagConstraints gcp7;
	GridBagConstraints gcp8;
	GridBagConstraints gcp9;
	GridBagConstraints gcp10b1;
	GridBagConstraints gcp10b2;
	GridBagConstraints gcp11;
	GridBagConstraints gcp12;
	GridBagConstraints gcp13;
	
	JPanel p0;
	
	JPanel p1;
	JPanel p2;
	JPanel p3;
	JPanel p4;
	JPanel p5;
	JPanel p6;
	JPanel p7;
	JPanel p8;
	JPanel p9;
	JPanel p10b1;
	JPanel p10b2;
	JPanel p11;
	JPanel p12;
	JPanel p13;
	
	JPanel pb1;
	JPanel pb2;
	
	
	
	;
	JLabel title;
	JLabel sifra;
	JLabel naziv;
	
	JLabel profesor;
	
	JLabel semestar;
	JLabel trenGodPre;
	
	
	JLabel l;
	JLabel l0;
	
	JTextField tf1;
	JTextField tf2;
	JTextField tf3;
	
	
	JComboBox<TrenutnaGodina> cb1;
	JComboBox<Semestar> cb2;
	ButtonGroup b;
	
	JRadioButton rb1;
	JRadioButton rb2;
	
	JButton b1;
	JButton b2;
	
	public IzmenaPredmeta(Predmet predmet){
		try {
			Toolkit kit = Toolkit.getDefaultToolkit();
			Dimension screenSize = kit.getScreenSize();
			int screenHeight = screenSize.height*2/3;
			int screenWidth = screenSize.width/2 ;
			setSize(screenWidth , screenHeight);
			setResizable(false);
			setModal(true);
			setLocationRelativeTo(null);
			this.setUndecorated(true);
			getContentPane().setBackground(Color.WHITE);
			Predmet p=predmet;
			
			try {
				jbInit(p);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (HeadlessException e1) {
			e1.printStackTrace();
		}
	  
		
	}
	
	private void jbInit(final Predmet p) throws Exception{
     
		gb1 = new GridBagLayout();
        gb1.rowHeights = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        gb1.rowWeights = new double[] {1.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,1.0};
        gb1.columnWidths = new int[] {10};
        gb1.columnWeights = new double[] {1.0};
		getContentPane().setLayout(gb1);
		
		p0 = new JPanel();
		p0.setBackground(Color.LIGHT_GRAY);
		gcp0 =  new GridBagConstraints();
		gcp0.fill = GridBagConstraints.BOTH;
		gcp0.insets = new Insets(0,0,10,0);
		gcp0.gridx = 0;
		gcp0.gridy = 0;
		getContentPane().add(p0,gcp0);
		gbp0 = new GridBagLayout();
		gbp0.columnWidths = new int[]{0,0};
		gbp0.rowHeights = new int[]{0};
		gbp0.columnWeights = new double[]{0.0,1.0};
		gbp0.rowWeights = new double[]{0.0};
		p0.setLayout(gbp0);
		
		l0 = new JLabel(" ");
		l0.setFont(new Font("Arial", Font.PLAIN, 27));
	    gcp00 =  new GridBagConstraints();
		gcp00.gridx = 0;
		gcp00.gridy = 0;
	    p0.add(l0,gcp00);
		
		title = new JLabel("Izmena predmeta");
		title.setFont(new Font("Arial", Font.PLAIN, 17));
		gc0 = new GridBagConstraints();
		gc0.anchor = GridBagConstraints.WEST;
		gc0.gridx = 1;
		gc0.gridy = 0;
		p0.add(title, gc0);
		
		p1 = new JPanel();
		p1.setBackground(Color.WHITE);
		gcp1 =  new GridBagConstraints();
		gcp1.fill = GridBagConstraints.BOTH;
		gcp1.insets = new Insets(10,55,10,100);
		gcp1.gridx = 0;
		gcp1.gridy = 1;
		getContentPane().add(p1,gcp1);
		gbp1 = new GridBagLayout();
		gbp1.columnWidths = new int[]{0,0};
		gbp1.rowHeights = new int[]{0};
		gbp1.columnWeights = new double[]{0.0, 1.0};
		gbp1.rowWeights = new double[]{0.0};
		p1.setLayout(gbp1);
		
		naziv = new JLabel("Naziv*");
		naziv.setFont(new Font("Arial", Font.PLAIN, 17));
		gc1 = new GridBagConstraints();
		gc1.insets = new Insets(0,0,0,35);
		gc1.gridx = 0;
		gc1.gridy = 0;
		p1.add(naziv, gc1);
		
		tf1 = new JTextField(p.getNaziv());
		tf1.setFont(new Font("Futura", Font.PLAIN, 17));
		gc2 = new GridBagConstraints();
		gc2.fill = GridBagConstraints.HORIZONTAL;
		gc2.gridx = 1;
		gc2.gridy = 0;
		p1.add(tf1, gc2);
		
		p2 = new JPanel();
		p2.setBackground(Color.WHITE);
		gcp2 =  new GridBagConstraints();
		gcp2.fill = GridBagConstraints.BOTH;
		gcp2.insets = new Insets(10,55,10,100);
		gcp2.gridx = 0;
		gcp2.gridy = 2;
		getContentPane().add(p2,gcp2);
		gbp2 = new GridBagLayout();
		gbp2.columnWidths = new int[]{0, 0};
		gbp2.rowHeights = new int[]{0};
		gbp2.columnWeights = new double[]{0.0, 1.0};
		gbp2.rowWeights = new double[]{0.0};
		p2.setLayout(gbp2);
		
		sifra = new JLabel("Sifra*");
		sifra.setFont(new Font("Arial", Font.PLAIN, 17));
		gc3 = new GridBagConstraints();
		gc3.insets = new Insets(0,0,0,35);
		gc3.gridx = 0;
		gc3.gridy = 0;
		p2.add(sifra, gc3);
		
		tf2 = new JTextField(p.getSifra());
		tf2.setFont(new Font("Futura", Font.PLAIN, 17));
		gc4 = new GridBagConstraints();
		gc4.fill = GridBagConstraints.HORIZONTAL;
		gc4.gridx = 1;
		gc4.gridy = 0;
		p2.add(tf2,gc4);
		/*
		p3 = new JPanel();
		p3.setBackground(Color.WHITE);
		gcp3 =  new GridBagConstraints();
		gcp3.fill = GridBagConstraints.BOTH;
		gcp3.insets = new Insets(10,55,10,100);
		gcp3.gridx = 0;
		gcp3.gridy = 3;
		getContentPane().add(p3,gcp3);
		gbp3 = new GridBagLayout();
		gbp3.columnWidths = new int[]{0, 0};
		gbp3.rowHeights = new int[]{0};
		gbp3.columnWeights = new double[]{0.0, 1.0};
		gbp3.rowWeights = new double[]{0.0};
		p3.setLayout(gbp3);
		
		profesor = new JLabel("Profesor*");
		profesor.setFont(new Font("Arial", Font.PLAIN, 17));
		gc5 = new GridBagConstraints();
		gc5.insets = new Insets(0,0,0,35);	
		gc5.gridx = 0;
		gc5.gridy = 0;
		p3.add(profesor,gc5);
		
		tf3 = new JTextField();
		tf3.setFont(new Font("Futura", Font.PLAIN, 17));
		gc6 = new GridBagConstraints();
		gc6.fill = GridBagConstraints.HORIZONTAL;
		gc6.gridx = 1;
		gc6.gridy = 0;
		p3.add(tf3,gc6);*/
		
		p4 = new JPanel();
		p4.setBackground(Color.WHITE);
		gcp4 =  new GridBagConstraints();
		gcp4.fill = GridBagConstraints.BOTH;
		gcp4.insets = new Insets(10,55,10,100);
		gcp4.gridx = 0;
		gcp4.gridy = 4;
		getContentPane().add(p4,gcp4);
		gbp4 = new GridBagLayout();
		gbp4.columnWidths = new int[]{0, 0};
		gbp4.rowHeights = new int[]{0};
		gbp4.columnWeights = new double[]{0.0, 1.0};
		gbp4.rowWeights = new double[]{0.0};
		p4.setLayout(gbp4);
		
		
		p9 = new JPanel();
		p9.setBackground(Color.WHITE);
		gcp9 =  new GridBagConstraints();
		gcp9.fill = GridBagConstraints.BOTH;
		gcp9.insets = new Insets(10,55,10,100);
		gcp9.gridx = 0;
		gcp9.gridy = 9;
		getContentPane().add(p9,gcp9);
		gbp9 = new GridBagLayout();
		gbp9.columnWidths = new int[]{0, 0};
		gbp9.rowHeights = new int[]{0};
		gbp9.columnWeights = new double[]{0.0, 1.0};
		gbp9.rowWeights = new double[]{0.0};
		p9.setLayout(gbp9);
		
		trenGodPre = new JLabel("Godina Studija u kojoj se predmet izvodi*");
		trenGodPre.setFont(new Font("Arial", Font.PLAIN, 17));
		gc17 = new GridBagConstraints();
		gc17.insets = new Insets(0,0,0,35);	
		gc17.gridx = 0;
		gc17.gridy = 0;
		p9.add(trenGodPre,gc17);
		
		cb1 = new JComboBox<TrenutnaGodina>(TrenutnaGodina.values());
		if((p.getGodinaStudijaUKojojSePredmetIzvodi().toString()).equals("PRVA"))
			cb1.setSelectedIndex(0);
		else if((p.getGodinaStudijaUKojojSePredmetIzvodi().toString()).equals("DRUGA"))
			cb1.setSelectedIndex(1);
		else if((p.getGodinaStudijaUKojojSePredmetIzvodi().toString()).equals("TRECA"))
			cb1.setSelectedIndex(2);
		else
			cb1.setSelectedIndex(3);
		cb1.setFont(new Font("Arial", Font.PLAIN, 17));
		cb1.setBackground(Color.WHITE);
		cb1.setForeground(Color.BLACK);
		gc18 = new GridBagConstraints();
		gc18.fill = GridBagConstraints.HORIZONTAL;
		gc18.gridx = 1;
		gc18.gridy = 0;
		p9.add(cb1,gc18);
		
		p10b1 = new JPanel();
		p10b1.setBackground(Color.WHITE);
		gcp10b1 =  new GridBagConstraints();
		gcp10b1.anchor = GridBagConstraints.WEST;
		gcp10b1.insets = new Insets(10,55,10,100);
		gcp10b1.gridx = 0;
		gcp10b1.gridy = 10;
		getContentPane().add(p10b1,gcp10b1);
		gbp10b1 = new GridBagLayout();
		gbp10b1.columnWidths = new int[]{0};
		gbp10b1.rowHeights = new int[]{0};
		gbp10b1.columnWeights = new double[]{0.0};
		gbp10b1.rowWeights = new double[]{0.0};
		p10b1.setLayout(gbp10b1);
		
		semestar = new JLabel("Semestar u kojem se predmet izvodi*");
		semestar.setFont(new Font("Arial", Font.PLAIN, 17));
		gc18 = new GridBagConstraints();
		gc18.insets = new Insets(0,0,0,35);	
		gc18.gridx = 0;
		gc18.gridy = 0;
		p10b1.add(semestar,gc18);
		
		cb2 = new JComboBox<Semestar>(Semestar.values());
		if((p.getSemestar().toString()).equals("PRVI"))
			cb2.setSelectedIndex(0);
		else if((p.getSemestar().toString()).equals("DRUGI"))
			cb2.setSelectedIndex(1);
		else if((p.getSemestar().toString()).equals("TRECI"))
			cb2.setSelectedIndex(2);
		else if((p.getSemestar().toString()).equals("CETVRTI"))
			cb2.setSelectedIndex(3);
		else if ((p.getSemestar().toString()).equals("PETI"))
			cb2.setSelectedIndex(4);
		else if ((p.getSemestar().toString()).equals("SESTI"))
			cb2.setSelectedIndex(5);
		else if((p.getSemestar().toString()).equals("SEDMI"))
			cb2.setSelectedIndex(6);
		else
			cb2.setSelectedIndex(7);
		cb2.setFont(new Font("Arial", Font.PLAIN, 17));
		cb2.setBackground(Color.WHITE);
		cb2.setForeground(Color.BLACK);
		gc19 = new GridBagConstraints();
		gc19.fill = GridBagConstraints.HORIZONTAL;
		gc19.gridx = 1;
		gc19.gridy = 0;
		p10b1.add(cb2,gc19);
	//*************************************************************	
	
		//**********************************************
		p12 = new JPanel();
		p12.setBackground(Color.WHITE);
		gcp12 =  new GridBagConstraints();
		gcp12.insets = new Insets(20,55,10,100);
		gcp12.anchor = GridBagConstraints.SOUTHEAST;
		gcp12.gridx = 0;
		gcp12.gridy = 13;
		getContentPane().add(p12,gcp12);
		
	    b1 = new JButton("Odustanak");
	    b1.setFont(new Font("Arial", Font.PLAIN, 17));
	    b1.setBackground(Color.WHITE);
	    p12.add(b1);
	    
	    pb1 = new JPanel();
	    pb1.setBackground(Color.WHITE);
	    p12.add(pb1);
	    
	    pb2 = new JPanel();
	    pb2.setBackground(Color.WHITE);
	    p12.add(pb2);
	    
	    b2 = new JButton("Potvrda");
	    b2.setFont(new Font("Arial", Font.PLAIN, 17));
	    b2.setBackground(Color.WHITE);
	    p12.add(b2);
		
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
				String TreGod=cb1.getSelectedItem().toString();
				TrenutnaGodina god=TrenutnaGodina.valueOf(TreGod);
				
				String semestar=cb2.getSelectedItem().toString();
				Semestar sm=Semestar.valueOf(semestar);
				/*
				for(Predmet p:BazaPredmeta.getInstance().getPredmeti()) {
					
					if(tf2.getText().equals(p.getSifra())) {
						JOptionPane.showMessageDialog(null,"Vec postoji predmet sa sifrom "+tf2.getText(), "Greska",JOptionPane.ERROR_MESSAGE);
						return;
					}
					}*/
				PredmetiController.getInstance().IzmeniPredmet(tf2.getText(),tf1.getText(),sm,god,p);
				
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
	    	
	    } );
	    KeyListener myKeyListener =new KeyListener(){

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				if(tf2.getText().trim().length()>0&& tf1.getText().trim().length()>0) {
					b2.setEnabled(true);
				}else b2.setEnabled(false);
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
	    	
	    };
	    
		tf2.addKeyListener(myKeyListener);
		tf1.addKeyListener(myKeyListener);
		
	    p13 = new JPanel();
		p13.setBackground(Color.LIGHT_GRAY);
		gcp13 =  new GridBagConstraints();
		gcp13.fill = GridBagConstraints.BOTH;
		gcp13.insets = new Insets(10,0,0,0);
		gcp13.gridx = 0;
		gcp13.gridy = 14;
		getContentPane().add(p13,gcp13);
		gbp12 = new GridBagLayout();
		gbp12.columnWidths = new int[]{0};
		gbp12.rowHeights = new int[]{0};
		gbp12.columnWeights = new double[]{1.0};
		gbp12.rowWeights = new double[]{0.0};
		p13.setLayout(gbp12);
		
		l = new JLabel(" ");
		l.setFont(new Font("Arial", Font.PLAIN, 27));
		gc23 = new GridBagConstraints();	
		gc23.gridx = 0;
		gc23.gridy = 0;
		p13.add(l,gc23);
	    
	}
}
