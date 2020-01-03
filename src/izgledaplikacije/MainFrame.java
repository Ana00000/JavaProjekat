package izgledaplikacije;

import java.awt.BorderLayout;






import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;


import javax.swing.JPanel;

import listeners.MyWindowListener;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame() {

		//Toolkit kit = Toolkit.getDefaultToolkit();
		//Dimension screenSize = kit.getScreenSize();
		int screenHeight = 768;
		int screenWidth = 1366;
		int width=screenWidth-screenWidth*1/4;
		int height=screenHeight-screenHeight*1/4;
		setSize(width,height);
		setTitle("Studentska Sluzba");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		addWindowListener(new MyWindowListener());
		
		
		MenuBar menu = new MenuBar();
		this.setJMenuBar(menu);

		
		Toolbar toolbar = new Toolbar();
		add(toolbar, BorderLayout.NORTH);

		StatusBar st=new StatusBar();
		st.setVisible(true);
		
		add(st,BorderLayout.SOUTH);
		
		JPanel panelTop = new JPanel();
		JButton btnStudenti = new JButton("Studenti");
		JButton btnProfesori = new JButton("Profesori");
		JButton btnPredmeti = new JButton("Predmeti");
		JPanel panel=new JPanel();
		
		panel.setPreferredSize(new Dimension(610,10));
		btnStudenti.setBackground(Color.WHITE);
		btnProfesori.setBackground(Color.WHITE);
		btnPredmeti.setBackground(Color.WHITE);
		btnStudenti.setFont(new Font("TAHOMA", Font.BOLD, 18));
		btnProfesori.setFont(new Font("TAHOMA", Font.BOLD, 18));
		btnPredmeti.setFont(new Font("TAHOMA", Font.BOLD, 18));
		panel.setBackground(Color.WHITE);
		panelTop.setBackground(Color.WHITE);
		
		panelTop.add(btnStudenti);
		panelTop.add(btnProfesori);
		panelTop.add(btnPredmeti);
		panelTop.add(panel);
		
		
		this.add(panelTop);
		
	}
}