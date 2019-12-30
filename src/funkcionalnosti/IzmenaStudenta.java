package funkcionalnosti;

import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import modelsistema.Status;
import modelsistema.Student;
import modelsistema.TrenutnaGodina;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class IzmenaStudenta extends JDialog {
	
	private static final long serialVersionUID = -4993387552790893124L;
	
	Status status;
	
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
	
	JLabel title;
	JLabel ime;
	JLabel prezime;
	JLabel datum;
	JLabel adresaStan;
	JLabel telefon;
	JLabel email;
	JLabel indeks;
	JLabel datumUpisa;
	JLabel trenGodStu;
	JLabel prosOcena;
	
	JLabel l;
	JLabel l0;
	
	JTextField tf1;
	JTextField tf2;
	JFormattedTextField tf3;
	JTextField tf4;
	JTextField tf5;
	JTextField tf6;
	JTextField tf7;
	JFormattedTextField tf8;
	JFormattedTextField tf9;
	
	JComboBox<TrenutnaGodina> cb1;
	
	ButtonGroup b;
	
	JRadioButton rb1;
	JRadioButton rb2;
	
	JButton b1;
	JButton b2;
	
	public IzmenaStudenta(Student student){
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
			Student s = student;
			
			try {
				jbInit(s);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (HeadlessException e1) {
			e1.printStackTrace();
		}
	  
	}
	
	private void jbInit(Student s) throws Exception{
		
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
		
		title = new JLabel("Dodavanje studenta");
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
		
		ime = new JLabel("Ime*");
		ime.setFont(new Font("Arial", Font.PLAIN, 17));
		gc1 = new GridBagConstraints();
		gc1.insets = new Insets(0,0,0,35);
		gc1.gridx = 0;
		gc1.gridy = 0;
		p1.add(ime, gc1);
		
		tf1 = new JTextField(s.getIme());
		tf1.setFont(new Font("Futura", Font.PLAIN, 17));
		tf1.setColumns(10);
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
		
		prezime = new JLabel("Prezime*");
		prezime.setFont(new Font("Arial", Font.PLAIN, 17));
		gc3 = new GridBagConstraints();
		gc3.insets = new Insets(0,0,0,35);
		gc3.gridx = 0;
		gc3.gridy = 0;
		p2.add(prezime, gc3);
		
		tf2 = new JTextField(s.getPrezime());
		tf2.setFont(new Font("Futura", Font.PLAIN, 17));
		tf2.setColumns(10);
		gc4 = new GridBagConstraints();
		gc4.fill = GridBagConstraints.HORIZONTAL;
		gc4.gridx = 1;
		gc4.gridy = 0;
		p2.add(tf2,gc4);
		
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
		
		datum = new JLabel("Datum rođenja*");
		datum.setFont(new Font("Arial", Font.PLAIN, 17));
		gc5 = new GridBagConstraints();
		gc5.insets = new Insets(0,0,0,35);	
		gc5.gridx = 0;
		gc5.gridy = 0;
		p3.add(datum,gc5);
		
		tf3 = new JFormattedTextField(10);
		tf3.setValue(s.getDatumRodjenja());
		tf3.setFont(new Font("Futura", Font.PLAIN, 17));
		gc6 = new GridBagConstraints();
		gc6.fill = GridBagConstraints.HORIZONTAL;
		gc6.gridx = 1;
		gc6.gridy = 0;
		p3.add(tf3,gc6);
		
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
		
		adresaStan = new JLabel("Adresa stanovanja*");
		adresaStan.setFont(new Font("Arial", Font.PLAIN, 17));
		gc7 = new GridBagConstraints();
		gc7.insets = new Insets(0,0,0,35);		
		gc7.gridx = 0;
		gc7.gridy = 0;
		p4.add(adresaStan,gc7);
		
		tf4 = new JTextField(s.getAdresaStanovanja());
		tf4.setFont(new Font("Futura", Font.PLAIN, 17));
		tf4.setColumns(10);
		gc8 = new GridBagConstraints();
		gc8.fill = GridBagConstraints.HORIZONTAL;
		gc8.gridx = 1;
		gc8.gridy = 0;
		p4.add(tf4,gc8);
		
		p5 = new JPanel();
		p5.setBackground(Color.WHITE);
		gcp5 =  new GridBagConstraints();
		gcp5.fill = GridBagConstraints.BOTH;
		gcp5.insets = new Insets(10,55,10,100);
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
		telefon.setFont(new Font("Arial", Font.PLAIN, 17));
		gc9 = new GridBagConstraints();
		gc9.insets = new Insets(0,0,0,35);		
		gc9.gridx = 0;
		gc9.gridy = 0;
		p5.add(telefon,gc9);
		
		tf5 = new JTextField(s.getKontaktTelefon());
		tf5.setFont(new Font("Futura", Font.PLAIN, 17));
		tf5.setColumns(10);
		gc10 = new GridBagConstraints();
		gc10.fill = GridBagConstraints.HORIZONTAL;
		gc10.gridx = 1;
		gc10.gridy = 0;
		p5.add(tf5,gc10);
		
		p6 = new JPanel();
		p6.setBackground(Color.WHITE);
		gcp6 =  new GridBagConstraints();
		gcp6.fill = GridBagConstraints.BOTH;
		gcp6.insets = new Insets(10,55,10,100);
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
		email.setFont(new Font("Arial", Font.PLAIN, 17));
		gc11 = new GridBagConstraints();
		gc11.insets = new Insets(0,0,0,35);		
		gc11.gridx = 0;
		gc11.gridy = 0;
		p6.add(email,gc11);
		
		tf6 = new JTextField(s.getEmailAdresa());
		tf6.setFont(new Font("Futura", Font.PLAIN, 17));
		tf6.setColumns(10);
		gc12 = new GridBagConstraints();
		gc12.fill = GridBagConstraints.HORIZONTAL;
		gc12.gridx = 1;
		gc12.gridy = 0;
		p6.add(tf6,gc12);
		
		p7 = new JPanel();
		p7.setBackground(Color.WHITE);
		gcp7 =  new GridBagConstraints();
		gcp7.fill = GridBagConstraints.BOTH;
		gcp7.insets = new Insets(10,55,10,100);
		gcp7.gridx = 0;
		gcp7.gridy = 7;
		getContentPane().add(p7,gcp7);
		gbp7 = new GridBagLayout();
		gbp7.columnWidths = new int[]{0, 0};
		gbp7.rowHeights = new int[]{0};
		gbp7.columnWeights = new double[]{0.0, 1.0};
		gbp7.rowWeights = new double[]{0.0};
		p7.setLayout(gbp7);
		
		indeks = new JLabel("Broj indeksa*");
		indeks.setFont(new Font("Arial", Font.PLAIN, 17));
		gc13 = new GridBagConstraints();
		gc13.insets = new Insets(0,0,0,35);		
		gc13.gridx = 0;
		gc13.gridy = 0;
		p7.add(indeks,gc13);
		
		tf7 = new JTextField(s.getBrojIndeksa());
		tf7.setFont(new Font("Futura", Font.PLAIN, 17));
		tf7.setColumns(10);
		gc14 = new GridBagConstraints();
		gc14.fill = GridBagConstraints.HORIZONTAL;
		gc14.gridx = 1;
		gc14.gridy = 0;
		p7.add(tf7,gc14);
		
		p8 = new JPanel();
		p8.setBackground(Color.WHITE);
		gcp8 =  new GridBagConstraints();
		gcp8.fill = GridBagConstraints.BOTH;
		gcp8.insets = new Insets(10,55,10,100);
		gcp8.gridx = 0;
		gcp8.gridy = 8;
		getContentPane().add(p8,gcp8);
		gbp8 = new GridBagLayout();
		gbp8.columnWidths = new int[]{0, 0};
		gbp8.rowHeights = new int[]{0};
		gbp8.columnWeights = new double[]{0.0, 1.0};
		gbp8.rowWeights = new double[]{0.0};
		p8.setLayout(gbp8);
		
		datumUpisa = new JLabel("Datum upisa*");
		datumUpisa.setFont(new Font("Arial", Font.PLAIN, 17));
		gc15 = new GridBagConstraints();
		gc15.insets = new Insets(0,0,0,35);	
		gc15.gridx = 0;
		gc15.gridy = 0;
		p8.add(datumUpisa,gc15);
		
		tf8 = new JFormattedTextField(10);
		tf8.setValue(s.getDatumUpisa());
		tf8.setFont(new Font("Futura", Font.PLAIN, 17));
		gc16 = new GridBagConstraints();
		gc16.fill = GridBagConstraints.HORIZONTAL;
		gc16.gridx = 1;
		gc16.gridy = 0;
		p8.add(tf8,gc16);
		
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
		
		trenGodStu = new JLabel("Trenutna godina studija*");
		trenGodStu.setFont(new Font("Arial", Font.PLAIN, 17));
		gc17 = new GridBagConstraints();
		gc17.insets = new Insets(0,0,0,35);	
		gc17.gridx = 0;
		gc17.gridy = 0;
		p9.add(trenGodStu,gc17);
		
		cb1 = new JComboBox<TrenutnaGodina>(TrenutnaGodina.values());
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
		
		p10b2 = new JPanel();
		p10b2.setBackground(Color.WHITE);
		gcp10b2 =  new GridBagConstraints();
		gcp10b2.anchor = GridBagConstraints.WEST;
		gcp10b2.insets = new Insets(10,55,10,100);
		gcp10b2.gridx = 0;
		gcp10b2.gridy = 11;
		getContentPane().add(p10b2,gcp10b2);
		gbp10b2 = new GridBagLayout();
		gbp10b2.columnWidths = new int[]{0};
		gbp10b2.rowHeights = new int[]{0};
		gbp10b2.columnWeights = new double[]{0.0};
		gbp10b2.rowWeights = new double[]{0.0};
		p10b2.setLayout(gbp10b2);
		
		status = s.getStatus();
		boolean tacnostStatusa;
		if(status == Status.B)
			tacnostStatusa = true;
		else
			tacnostStatusa = false;
		
		b = new ButtonGroup();
		rb1 = new JRadioButton("Budžet",tacnostStatusa);
		rb1.setFont(new Font("Arial", Font.PLAIN, 17));
		rb1.setBackground(Color.WHITE);
		
		rb2 = new JRadioButton("Samofinansiranje",!tacnostStatusa);
		rb2.setFont(new Font("Arial", Font.PLAIN, 17));
		rb2.setBackground(Color.WHITE);
		b.add(rb1);
	    b.add(rb2);
		
		gc19 = new GridBagConstraints();
		gc19.gridx = 0;
		gc19.gridy = 0;
		p10b1.add(rb1,gc19);
	    
		gc20 = new GridBagConstraints();
		gc20.gridx = 0;
		gc20.gridy = 0;
		p10b2.add(rb2,gc20);
		
		p11 = new JPanel();
		p11.setBackground(Color.WHITE);
		gcp11 =  new GridBagConstraints();
		gcp11.fill = GridBagConstraints.BOTH;
		gcp11.insets = new Insets(10,55,10,100);
		gcp11.gridx = 0;
		gcp11.gridy = 12;
		getContentPane().add(p11,gcp11);
		gbp11 = new GridBagLayout();
		gbp11.columnWidths = new int[]{0, 0};
		gbp11.rowHeights = new int[]{0};
		gbp11.columnWeights = new double[]{0.0, 1.0};
		gbp11.rowWeights = new double[]{0.0};
		p11.setLayout(gbp11);
	
		prosOcena = new JLabel("Prosečna ocena*");
		prosOcena.setFont(new Font("Arial", Font.PLAIN, 17));
		gc21 = new GridBagConstraints();
		gc21.insets = new Insets(0,0,0,35);	
		gc21.gridx = 0;
		gc21.gridy = 0;
		p11.add(prosOcena,gc21);
		
		tf9 = new JFormattedTextField(10);
		tf9.setValue(s.getProsOcena());
		tf9.setFont(new Font("Futura", Font.PLAIN, 17));
		gc22 = new GridBagConstraints();
		gc22.fill = GridBagConstraints.HORIZONTAL;
		gc22.gridx = 1;
		gc22.gridy = 0;
		p11.add(tf9,gc22);
		
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
				int kontaktTelefon = Integer.parseInt(tf5.getText());
				Double prosek = Double.parseDouble(tf9.getText());
				
				if(!"".equals(tf1.getText()))
					if(!"".equals(tf2.getText()))
						if(!"".equals(tf3.getText()))
							if(!"".equals(tf4.getText()))
								if(!"".equals(tf5.getText()) && kontaktTelefon == Integer.parseInt(tf5.getText()))
									if(!"".equals(tf6.getText()))
										if(!"".equals(tf7.getText()))
											if(!"".equals(tf8.getText()))
												if(!"".equals(tf9.getText()) && prosek == Double.parseDouble(tf9.getText()))
												{
													
													dispose();
												}
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