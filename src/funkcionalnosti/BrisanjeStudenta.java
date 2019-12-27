package funkcionalnosti;

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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BrisanjeStudenta extends JDialog{
	
	private static final long serialVersionUID = -4993387552790893124L; 
	
	GridBagLayout gb1;
	
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
	GridBagConstraints gc6;
	GridBagConstraints gc7;
	GridBagConstraints gc8;
	
	GridBagLayout gbp0;
	GridBagLayout gbp1;
	GridBagLayout gbp2;
	
	JLabel l0;
	JLabel title;
	JLabel bin;
	JLabel pitanje;
	JLabel l;
	
	JButton minimize;
	JButton restore;
	JButton close;
	JButton b1;
	JButton b2;
	
	ImageIcon image1;
	ImageIcon image2;
	ImageIcon image3;
	ImageIcon image4;
	
	public BrisanjeStudenta(JFrame frame) {
		try {
			Toolkit kit = Toolkit.getDefaultToolkit();
			Dimension screenSize = kit.getScreenSize();
			int screenHeight = screenSize.height*1/4;
			int screenWidth = screenSize.width*2/5;
			setSize(screenWidth , screenHeight);
			setResizable(true);
			setModal(true);
			setLocationRelativeTo(frame);
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
        gb1.rowWeights = new double[] {0.0,0.0,0.0};
        gb1.columnWidths = new int[] {10};
        gb1.columnWeights = new double[] {1.0};
		getContentPane().setLayout(gb1);
		
		p0 = new JPanel();
		p0.setBackground(Color.LIGHT_GRAY);
		gcp0 =  new GridBagConstraints();
		gcp0.fill = GridBagConstraints.BOTH;
		gcp0.insets = new Insets(0,0,20,0);
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
		l0.setFont(new Font("Arial", Font.PLAIN, 40));
	    gc1 =  new GridBagConstraints();
		gc1.gridx = 0;
		gc1.gridy = 0;
	    p0.add(l0,gc1);
		
		title = new JLabel("Brisanje studenta");
		title.setFont(new Font("Arial", Font.PLAIN, 25));
		gc2 = new GridBagConstraints();
		gc2.anchor = GridBagConstraints.WEST;
		gc2.gridx = 1;
		gc2.gridy = 0;
		p0.add(title, gc2);
		
		image1 = new ImageIcon(getClass().getResource("/slike/icons8-minimize-window-24.png"));
		minimize = new JButton(image1);
		minimize.setBackground(Color.LIGHT_GRAY);
		minimize.setBorderPainted(false);
		minimize.setMargin(new Insets(0, 0, 0, 0));
		gc3 = new GridBagConstraints();
		gc3.gridx = 2;
		gc3.gridy = 0;
		p0.add(minimize, gc3);
		
		minimize.addMouseListener(new MouseListener()
	    {

			@Override
			public void mouseClicked(MouseEvent e) {
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				minimize.setBackground(Color.DARK_GRAY);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				minimize.setBackground(Color.LIGHT_GRAY);
			}
	    	
	    } );
		
		image2 = new ImageIcon(getClass().getResource("/slike/icons8-restore-window-26.png"));
		restore = new JButton(image2);
		restore.setBackground(Color.LIGHT_GRAY);
		restore.setBorderPainted(false);
		restore.setMargin(new Insets(0, 0, 0, 0));
		gc4 = new GridBagConstraints();
		gc4.gridx = 3;
		gc4.gridy = 0;
		p0.add(restore, gc4);
		
		restore.addMouseListener(new MouseListener()
	    {

			@Override
			public void mouseClicked(MouseEvent e) {
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				restore.setBackground(Color.DARK_GRAY);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				restore.setBackground(Color.LIGHT_GRAY);
			}
	    	
	    } );
		
		image3 = new ImageIcon(getClass().getResource("/slike/iconfinder_ic_close_48px_352270.png"));
		close = new JButton(image3);
		close.setBackground(Color.LIGHT_GRAY);
		close.setBorderPainted(false);
		close.setMargin(new Insets(0, 0, 0, 5));
		gc5 = new GridBagConstraints();
		gc5.gridx = 4;
		gc5.gridy = 0;
		p0.add(close, gc5);
		
		close.addMouseListener(new MouseListener()
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
				close.setBackground(Color.DARK_GRAY);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				close.setBackground(Color.LIGHT_GRAY);
			}
	    	
	    } );
		
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
		
		image4 = new ImageIcon(getClass().getResource("/slike/icons8-trash-can-60.png"));
		bin = new JLabel(image4);
		bin.setFont(new Font("Arial", Font.PLAIN, 25));
		gc6 = new GridBagConstraints();
		gc6.insets = new Insets(0,0,0,20);
		gc6.gridx = 0;
		gc6.gridy = 0;
		p1.add(bin, gc6);
		
		pitanje = new JLabel("Da li ste sigurni da želite da obrišete studenta?");
		pitanje.setFont(new Font("Arial", Font.PLAIN, 25));
		gc7 = new GridBagConstraints();
		gc7.fill = GridBagConstraints.HORIZONTAL;
		gc7.gridx = 1;
		gc7.gridy = 0;
		p1.add(pitanje, gc7);
		
		p2 = new JPanel();
		p2.setBackground(Color.WHITE);
		gcp2 =  new GridBagConstraints();
		gcp2.insets = new Insets(10,55,10,100);
		gcp2.anchor = GridBagConstraints.SOUTHEAST;
		gcp2.gridx = 0;
		gcp2.gridy = 2;
		getContentPane().add(p2,gcp2);
		
	    b1 = new JButton("Odustanak");
	    b1.setFont(new Font("Arial", Font.PLAIN, 27));
	    b1.setBackground(Color.WHITE);
	    p2.add(b1);
	    
	    pb1 = new JPanel();
	    pb1.setBackground(Color.WHITE);
	    p2.add(pb1);
	    
	    pb2 = new JPanel();
	    pb2.setBackground(Color.WHITE);
	    p2.add(pb2);
	    
	    b2 = new JButton("Potvrda");
	    b2.setFont(new Font("Arial", Font.PLAIN, 27));
	    b2.setBackground(Color.WHITE);
	    p2.add(b2);
		
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
	    	
	    } );
		
	    p3 = new JPanel();
		p3.setBackground(Color.LIGHT_GRAY);
		gcp3 =  new GridBagConstraints();
		gcp3.fill = GridBagConstraints.BOTH;
		gcp3.insets = new Insets(10,0,0,0);
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
		l.setFont(new Font("Arial", Font.PLAIN, 40));
		gc8 = new GridBagConstraints();	
		gc8.gridx = 0;
		gc8.gridy = 0;
		p3.add(l,gc8);
		
	}
}
