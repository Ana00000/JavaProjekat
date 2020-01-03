package funkcionalnosti;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import modelsistema.Titula;
import modelsistema.Zvanje;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DodavanjeProfesora extends JDialog {
	
	private static final long serialVersionUID = -4993387552790893124L;
	
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
	GridBagLayout gbp10;
	GridBagLayout gbp11;
	
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
	GridBagConstraints gcp10;
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
	JPanel p10;
	JPanel p11;
	JPanel p12;
	
	JPanel pb1;
	JPanel pb2;
	
	JLabel title;
	JLabel ime;
	JLabel prezime;
	JLabel datum;
	JLabel adresaStan;
	JLabel telefon;
	JLabel email;
	JLabel adresaKanc;
	JLabel brojLicne;
	JLabel titula;
	JLabel zvanje;
	
	JLabel l;
	JLabel l0;
	
	JTextField tf1;
	JTextField tf2;
	JTextField tf3;
	JTextField tf4;
	JTextField tf5;
	JTextField tf6;
	JTextField tf7;
	JTextField tf8;
	
	JComboBox<Titula> cb1;
	JComboBox<Zvanje> cb2;

	JButton b1;
	JButton b2;

	public DodavanjeProfesora(){
		try {
			int screenHeight = 768*2/3;
			int screenWidth = 1366/2 ;
			setSize(screenWidth , screenHeight);
			setResizable(false);
			setModal(true);
			setLocationRelativeTo(null);
			this.setUndecorated(true);
			getContentPane().setBackground(Color.WHITE);
		} catch (HeadlessException e1) {
			e1.printStackTrace();
		}
	  
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void jbInit() throws Exception{
		
        gb1 = new GridBagLayout();
        gb1.rowHeights = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0};
        gb1.rowWeights = new double[] {1.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,1.0};
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
		l0.setFont(new Font("Arial", Font.PLAIN, 17));
	    gcp00 =  new GridBagConstraints();
		gcp00.gridx = 0;
		gcp00.gridy = 0;
	    p0.add(l0,gcp00);
		
		title = new JLabel("Dodavanje profesora");
		title.setFont(new Font("Arial", Font.PLAIN, 10));
		gc0 = new GridBagConstraints();
		gc0.anchor = GridBagConstraints.WEST;
		gc0.gridx = 1;
		gc0.gridy = 0;
		p0.add(title, gc0);
		
		p1 = new JPanel();
		p1.setBackground(Color.WHITE);
		gcp1 =  new GridBagConstraints();
		gcp1.fill = GridBagConstraints.BOTH;
		gcp1.insets = new Insets(10,35,10,35);
		gcp1.gridx = 0;
		gcp1.gridy = 1;
		getContentPane().add(p1,gcp1);
		gbp1 = new GridBagLayout();
		gbp1.columnWidths = new int[]{0,0};
		gbp1.rowHeights = new int[]{0};
		gbp1.columnWeights = new double[]{0.0, 1.0};
		gbp1.rowWeights = new double[]{0.0};
		p1.setLayout(gbp1);
		
		ime = new JLabel("Ime*");
		ime.setFont(new Font("Arial", Font.PLAIN, 10));
		gc1 = new GridBagConstraints();
		gc1.insets = new Insets(0,0,0,20);
		gc1.gridx = 0;
		gc1.gridy = 0;
		p1.add(ime, gc1);
		
		tf1 = new JTextField(11);
		tf1.setFont(new Font("Futura", Font.PLAIN, 10));
		gc2 = new GridBagConstraints();
		gc2.fill = GridBagConstraints.HORIZONTAL;
		gc2.gridx = 1;
		gc2.gridy = 0;
		p1.add(tf1, gc2);
		
		p2 = new JPanel();
		p2.setBackground(Color.WHITE);
		gcp2 =  new GridBagConstraints();
		gcp2.fill = GridBagConstraints.BOTH;
		gcp2.insets = new Insets(10,35,10,35);
		gcp2.gridx = 0;
		gcp2.gridy = 2;
		getContentPane().add(p2,gcp2);
		gbp2 = new GridBagLayout();
		gbp2.columnWidths = new int[]{0, 0};
		gbp2.rowHeights = new int[]{0};
		gbp2.columnWeights = new double[]{0.0, 1.0};
		gbp2.rowWeights = new double[]{0.0};
		p2.setLayout(gbp2);
		
		prezime = new JLabel("Prezime*");
		prezime.setFont(new Font("Arial", Font.PLAIN, 10));
		gc3 = new GridBagConstraints();
		gc3.insets = new Insets(0,0,0,20);
		gc3.gridx = 0;
		gc3.gridy = 0;
		p2.add(prezime, gc3);
		
		tf2 = new JTextField(11);
		tf2.setFont(new Font("Futura", Font.PLAIN, 10));
		gc4 = new GridBagConstraints();
		gc4.fill = GridBagConstraints.HORIZONTAL;
		gc4.gridx = 1;
		gc4.gridy = 0;
		p2.add(tf2,gc4);
		
		p3 = new JPanel();
		p3.setBackground(Color.WHITE);
		gcp3 =  new GridBagConstraints();
		gcp3.fill = GridBagConstraints.BOTH;
		gcp3.insets = new Insets(10,35,10,35);
		gcp3.gridx = 0;
		gcp3.gridy = 3;
		getContentPane().add(p3,gcp3);
		gbp3 = new GridBagLayout();
		gbp3.columnWidths = new int[]{0, 0};
		gbp3.rowHeights = new int[]{0};
		gbp3.columnWeights = new double[]{0.0, 1.0};
		gbp3.rowWeights = new double[]{0.0};
		p3.setLayout(gbp3);
		
		datum = new JLabel("Datum rođenja(dd.MM.yyyy.)*");
		datum.setFont(new Font("Arial", Font.PLAIN, 10));
		gc5 = new GridBagConstraints();
		gc5.insets = new Insets(0,0,0,20);	
		gc5.gridx = 0;
		gc5.gridy = 0;
		p3.add(datum,gc5);
		
		tf3 = new JTextField(11);
		tf3.setFont(new Font("Futura", Font.PLAIN, 10));
		gc6 = new GridBagConstraints();
		gc6.fill = GridBagConstraints.HORIZONTAL;
		gc6.gridx = 1;
		gc6.gridy = 0;
		p3.add(tf3,gc6);
		
		p4 = new JPanel();
		p4.setBackground(Color.WHITE);
		gcp4 =  new GridBagConstraints();
		gcp4.fill = GridBagConstraints.BOTH;
		gcp4.insets = new Insets(10,35,10,35);
		gcp4.gridx = 0;
		gcp4.gridy = 4;
		getContentPane().add(p4,gcp4);
		gbp4 = new GridBagLayout();
		gbp4.columnWidths = new int[]{0, 0};
		gbp4.rowHeights = new int[]{0};
		gbp4.columnWeights = new double[]{0.0, 1.0};
		gbp4.rowWeights = new double[]{0.0};
		p4.setLayout(gbp4);
		
		adresaStan = new JLabel("Adresa stanovanja*");
		adresaStan.setFont(new Font("Arial", Font.PLAIN, 10));
		gc7 = new GridBagConstraints();
		gc7.insets = new Insets(0,0,0,20);		
		gc7.gridx = 0;
		gc7.gridy = 0;
		p4.add(adresaStan,gc7);
		
		tf4 = new JTextField(11);
		tf4.setFont(new Font("Futura", Font.PLAIN, 10));
		gc8 = new GridBagConstraints();
		gc8.fill = GridBagConstraints.HORIZONTAL;
		gc8.gridx = 1;
		gc8.gridy = 0;
		p4.add(tf4,gc8);
		
		p5 = new JPanel();
		p5.setBackground(Color.WHITE);
		gcp5 =  new GridBagConstraints();
		gcp5.fill = GridBagConstraints.BOTH;
		gcp5.insets = new Insets(10,35,10,35);
		gcp5.gridx = 0;
		gcp5.gridy = 5;
		getContentPane().add(p5,gcp5);
		gbp5 = new GridBagLayout();
		gbp5.columnWidths = new int[]{0, 0};
		gbp5.rowHeights = new int[]{0};
		gbp5.columnWeights = new double[]{0.0, 1.0};
		gbp5.rowWeights = new double[]{0.0};
		p5.setLayout(gbp5);
		
		telefon = new JLabel("Kontakt telefon*");
		telefon.setFont(new Font("Arial", Font.PLAIN, 10));
		gc9 = new GridBagConstraints();
		gc9.insets = new Insets(0,0,0,20);		
		gc9.gridx = 0;
		gc9.gridy = 0;
		p5.add(telefon,gc9);
		
		tf5 = new JTextField(11);
		tf5.setFont(new Font("Futura", Font.PLAIN, 10));
		gc10 = new GridBagConstraints();
		gc10.fill = GridBagConstraints.HORIZONTAL;
		gc10.gridx = 1;
		gc10.gridy = 0;
		p5.add(tf5,gc10);
		
		p6 = new JPanel();
		p6.setBackground(Color.WHITE);
		gcp6 =  new GridBagConstraints();
		gcp6.fill = GridBagConstraints.BOTH;
		gcp6.insets = new Insets(10,35,10,35);
		gcp6.gridx = 0;
		gcp6.gridy = 6;
		getContentPane().add(p6,gcp6);
		gbp6 = new GridBagLayout();
		gbp6.columnWidths = new int[]{0, 0};
		gbp6.rowHeights = new int[]{0};
		gbp6.columnWeights = new double[]{0.0, 1.0};
		gbp6.rowWeights = new double[]{0.0};
		p6.setLayout(gbp6);
		
		email = new JLabel("E-mail adresa*");
		email.setFont(new Font("Arial", Font.PLAIN, 10));
		gc11 = new GridBagConstraints();
		gc11.insets = new Insets(0,0,0,20);		
		gc11.gridx = 0;
		gc11.gridy = 0;
		p6.add(email,gc11);
		
		tf6 = new JTextField(11);
		tf6.setFont(new Font("Futura", Font.PLAIN, 10));
		gc12 = new GridBagConstraints();
		gc12.fill = GridBagConstraints.HORIZONTAL;
		gc12.gridx = 1;
		gc12.gridy = 0;
		p6.add(tf6,gc12);
		
		p7 = new JPanel();
		p7.setBackground(Color.WHITE);
		gcp7 =  new GridBagConstraints();
		gcp7.fill = GridBagConstraints.BOTH;
		gcp7.insets = new Insets(10,35,10,35);
		gcp7.gridx = 0;
		gcp7.gridy = 7;
		getContentPane().add(p7,gcp7);
		gbp7 = new GridBagLayout();
		gbp7.columnWidths = new int[]{0, 0};
		gbp7.rowHeights = new int[]{0};
		gbp7.columnWeights = new double[]{0.0, 1.0};
		gbp7.rowWeights = new double[]{0.0};
		p7.setLayout(gbp7);
		
		adresaKanc = new JLabel("Adresa kancelarije*");
		adresaKanc.setFont(new Font("Arial", Font.PLAIN, 10));
		gc13 = new GridBagConstraints();
		gc13.insets = new Insets(0,0,0,20);		
		gc13.gridx = 0;
		gc13.gridy = 0;
		p7.add(adresaKanc,gc13);
		
		tf7 = new JTextField(11);
		tf7.setFont(new Font("Futura", Font.PLAIN, 10));
		gc14 = new GridBagConstraints();
		gc14.fill = GridBagConstraints.HORIZONTAL;
		gc14.gridx = 1;
		gc14.gridy = 0;
		p7.add(tf7,gc14);
		
		p8 = new JPanel();
		p8.setBackground(Color.WHITE);
		gcp8 =  new GridBagConstraints();
		gcp8.fill = GridBagConstraints.BOTH;
		gcp8.insets = new Insets(10,35,10,35);
		gcp8.gridx = 0;
		gcp8.gridy = 8;
		getContentPane().add(p8,gcp8);
		gbp8 = new GridBagLayout();
		gbp8.columnWidths = new int[]{0, 0};
		gbp8.rowHeights = new int[]{0};
		gbp8.columnWeights = new double[]{0.0, 1.0};
		gbp8.rowWeights = new double[]{0.0};
		p8.setLayout(gbp8);
		
		brojLicne = new JLabel("Broj lične karte*");
		brojLicne.setFont(new Font("Arial", Font.PLAIN, 10));
		gc15 = new GridBagConstraints();
		gc15.insets = new Insets(0,0,0,20);	
		gc15.gridx = 0;
		gc15.gridy = 0;
		p8.add(brojLicne,gc15);
		
		tf8 = new JTextField(11);
		tf8.setFont(new Font("Futura", Font.PLAIN, 10));
		gc16 = new GridBagConstraints();
		gc16.fill = GridBagConstraints.HORIZONTAL;
		gc16.gridx = 1;
		gc16.gridy = 0;
		p8.add(tf8,gc16);
		
		p9 = new JPanel();
		p9.setBackground(Color.WHITE);
		gcp9 =  new GridBagConstraints();
		gcp9.fill = GridBagConstraints.BOTH;
		gcp9.insets = new Insets(10,35,10,35);
		gcp9.gridx = 0;
		gcp9.gridy = 9;
		getContentPane().add(p9,gcp9);
		gbp9 = new GridBagLayout();
		gbp9.columnWidths = new int[]{0, 0};
		gbp9.rowHeights = new int[]{0};
		gbp9.columnWeights = new double[]{0.0, 1.0};
		gbp9.rowWeights = new double[]{0.0};
		p9.setLayout(gbp9);
		

		titula = new JLabel("Titula*");
		titula.setFont(new Font("Arial", Font.PLAIN, 10));
		gc17 = new GridBagConstraints();
		gc17.insets = new Insets(0,0,0,20);	
		gc17.gridx = 0;
		gc17.gridy = 0;
		p9.add(titula,gc17);
		
		cb1 = new JComboBox<Titula>(Titula.values());
		cb1.setFont(new Font("Arial", Font.PLAIN, 10));
		cb1.setBackground(Color.WHITE);
		cb1.setForeground(Color.BLACK);
		gc18 = new GridBagConstraints();
		gc18.fill = GridBagConstraints.HORIZONTAL;
		gc18.gridx = 1;
		gc18.gridy = 0;
		p9.add(cb1,gc18);
		
		p10 = new JPanel();
		p10.setBackground(Color.WHITE);
		gcp10 =  new GridBagConstraints();
		gcp10.fill = GridBagConstraints.BOTH;
		gcp10.insets = new Insets(10,35,10,35);
		gcp10.gridx = 0;
		gcp10.gridy = 10;
		getContentPane().add(p10,gcp10);
		gbp10 = new GridBagLayout();
		gbp10.columnWidths = new int[]{0, 0};
		gbp10.rowHeights = new int[]{0};
		gbp10.columnWeights = new double[]{0.0, 1.0};
		gbp10.rowWeights = new double[]{0.0};
		p10.setLayout(gbp10);
		
		zvanje = new JLabel("Zvanje*");
		zvanje.setFont(new Font("Arial", Font.PLAIN, 10));
		gc19 = new GridBagConstraints();
		gc19.insets = new Insets(0,0,0,20);	
		gc19.gridx = 0;
		gc19.gridy = 0;
		p10.add(zvanje,gc19);
		
		cb2 = new JComboBox<Zvanje>(Zvanje.values());
		cb2.setFont(new Font("Arial", Font.PLAIN, 10));
		cb2.setBackground(Color.WHITE);
		cb2.setForeground(Color.BLACK);
		gc20 = new GridBagConstraints();
		gc20.fill = GridBagConstraints.HORIZONTAL;
		gc20.gridx = 1;
		gc20.gridy = 0;
		p10.add(cb2,gc20);
	
		p11 = new JPanel();
		p11.setBackground(Color.WHITE);
		gcp11 =  new GridBagConstraints();
		gcp11.insets = new Insets(20,35,5,35);
		gcp11.anchor = GridBagConstraints.SOUTHEAST;
		gcp11.gridx = 0;
		gcp11.gridy = 11;
		getContentPane().add(p11,gcp11);
		
	    b1 = new JButton("Odustanak");
	    b1.setFont(new Font("Arial", Font.PLAIN, 10));
	    b1.setBackground(Color.WHITE);
	    p11.add(b1);
	    
	    pb1 = new JPanel();
	    pb1.setBackground(Color.WHITE);
	    p11.add(pb1);
	    
	    pb2 = new JPanel();
	    pb2.setBackground(Color.WHITE);
	    p11.add(pb2);
	    
	    b2 = new JButton("Potvrda");
	    b2.setFont(new Font("Arial", Font.PLAIN, 10));
	    b2.setBackground(Color.WHITE);
	    p11.add(b2);
	    
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
				int brojLicneKarte = Integer.parseInt(tf8.getText());
				if(!"".equals(tf1.getText()))
					if(!"".equals(tf2.getText()))
						if(!"".equals(tf3.getText()))
							if(!"".equals(tf4.getText()))
								if(!"".equals(tf5.getText()))
									if(!"".equals(tf6.getText()))
										if(!"".equals(tf7.getText()))
											if(!"".equals(tf8.getText()) && brojLicneKarte == Integer.parseInt(tf8.getText()))
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
	    
	    p12 = new JPanel();
		p12.setBackground(Color.LIGHT_GRAY);
		gcp12 =  new GridBagConstraints();
		gcp12.fill = GridBagConstraints.BOTH;
		gcp12.insets = new Insets(10,0,0,0);
		gcp12.gridx = 0;
		gcp12.gridy = 12;
		getContentPane().add(p12,gcp12);
		gbp11 = new GridBagLayout();
		gbp11.columnWidths = new int[]{0};
		gbp11.rowHeights = new int[]{0};
		gbp11.columnWeights = new double[]{1.0};
		gbp11.rowWeights = new double[]{0.0};
		p12.setLayout(gbp11);
		
		l = new JLabel(" ");
		l.setFont(new Font("Arial", Font.PLAIN, 17));
		gc21 = new GridBagConstraints();	
		gc21.gridx = 0;
		gc21.gridy = 0;
		p12.add(l,gc21);
		
	}
}