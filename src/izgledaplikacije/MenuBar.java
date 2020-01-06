package izgledaplikacije;

import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.KeyStroke;

import controllers.PredmetiController;
import controllers.StudentiController;
import modelsistema.Semestar;
import modelsistema.Status;
import modelsistema.TrenutnaGodina;

import java.awt.Font;

public class MenuBar extends JMenuBar implements ActionListener{
	
	private static final long serialVersionUID = -4993387552790893124L;
	
	public MenuBar(){
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void jbInit() throws Exception{
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenu help = new JMenu("Help");
		
		file.setFont(new Font("Arial", Font.PLAIN, 20));
		edit.setFont(new Font("Arial", Font.PLAIN, 20));
		help.setFont(new Font("Arial", Font.PLAIN, 20));
		
		file.setMnemonic(KeyEvent.VK_F);
		edit.setMnemonic(KeyEvent.VK_E);
		help.setMnemonic(KeyEvent.VK_H);
		
		ImageIcon icon1 = createImageIcon("/slike/iconfinder_add_134224.png");
		ImageIcon icon2 = createImageIcon("/slike/iconfinder_ic_close_48px_352270.png");
		ImageIcon icon3 = createImageIcon("/slike/iconfinder_081_Pen_183209.png");
		ImageIcon icon4 = createImageIcon("/slike/iconfinder_Streamline-70_185090.png");
		ImageIcon icon5 = createImageIcon("/slike/iconfinder_164_QuestionMark_183285.png");
		ImageIcon icon6 = createImageIcon("/slike/iconfinder_v-31_3162614.png");
		
		JMenuItem miNew = new JMenuItem("New",icon1);
		miNew.setMnemonic(KeyEvent.VK_N);
		miNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		miNew.addActionListener(this);
		
		JMenuItem miClose = new JMenuItem("Close",icon2);
		miClose.setMnemonic(KeyEvent.VK_C);
		miClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
		miClose.addActionListener(this);
		
		JMenuItem miEdit = new JMenuItem("Edit",icon3);
		miEdit.setMnemonic(KeyEvent.VK_E);
		miEdit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
		miEdit.addActionListener(this);
		
		JMenuItem miDelete = new JMenuItem("Delete",icon4);
		miDelete.setMnemonic(KeyEvent.VK_D);
		miDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
		miDelete.addActionListener(this);
		
		JMenuItem miHelp = new JMenuItem("Help",icon5);
		miHelp.setMnemonic(KeyEvent.VK_H);
		miHelp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,ActionEvent.CTRL_MASK));
		miHelp.addActionListener(this);
		
		JMenuItem miAbout = new JMenuItem("About",icon6);
		miAbout.setMnemonic(KeyEvent.VK_A);
		miAbout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
		miAbout.addActionListener(this);
		
		add(file);
		file.add(miNew);
		file.addSeparator();
		file.add(miClose);
		
		add(edit);
		edit.add(miEdit);
		edit.addSeparator();
		edit.add(miDelete);
		
		add(help);
		help.add(miHelp);
		help.addSeparator();
		help.add(miAbout);
		
		this.setBackground(Color.WHITE);
		
		miNew.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				StudentiController.getInstance().dodajStudenta("Petar","Petrović",Calendar.getInstance().getTime(),"Radnička 12",
						0652023333,"petar01@gmail.com","ra55/2017",Calendar.getInstance().getTime(),TrenutnaGodina.TRECA,Status.B,8.53);
				
				PredmetiController.getInstance().dodajPredmet("RA49","Programski Prevodioci",Semestar.PETI,TrenutnaGodina.TRECA);
				
//				ProfesoriController.getInstance().dodajProfesora("Dana", "Danic",Calendar.getInstance().getTime(), "Miskovac 8",
//						0332445377, "danaDanic4@gmail.com", "Radnicka48", 895462, Titula.REDOVAN, Zvanje.DR);
			}
		});
		
		miClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		
		miEdit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		
		miDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		
		miHelp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		
		miAbout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		
	}
	
	public void actionPerformed(ActionEvent e) {
		JMenuItem source = (JMenuItem) (e.getSource());
		String s = "Opcija menija:" + source.getText();
		System.out.println(s);
		if (source.getText().equals("Exit"))
			System.exit(0);
	}	
	
	private ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = MenuBar.class.getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}
}