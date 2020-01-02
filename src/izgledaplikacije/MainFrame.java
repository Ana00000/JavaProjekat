package izgledaplikacije;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import listeners.MyWindowListener;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame() {

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
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
	}
}
