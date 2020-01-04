package izgledaplikacije;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import modelsistema.BazaPredmeta;
import modelsistema.BazaProfesora;


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
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		
		MenuBar menu = new MenuBar();
		setJMenuBar(menu);

		StatusBar st=new StatusBar();
	    getContentPane().add(st,BorderLayout.SOUTH);
		
		final TabbedPane tabbedPane=new TabbedPane();
		tabbedPane.setFont(new Font("Arial",Font.PLAIN,30));
		getContentPane().add(tabbedPane,BorderLayout.CENTER);
		
		final ToolBarStudent studentToolbar=new ToolBarStudent();
		add(studentToolbar,BorderLayout.NORTH);
		
		final ToolBarProfesor profesorToolbar=new ToolBarProfesor();
		final ToolBarPredmet predmetToolbar=new ToolBarPredmet();
		
		tabbedPane.addChangeListener(new ChangeListener(){
			
			
		
			@SuppressWarnings("deprecation")
			@Override
			public void stateChanged(ChangeEvent arg0) {
				// TODO Auto-generated method stub
				int i=tabbedPane.getSelectedIndex();
				if(i==0) {
					getContentPane().add(studentToolbar,BorderLayout.NORTH);
					studentToolbar.show();
					profesorToolbar.hide();
					predmetToolbar.hide();
				}else if(i==1) {
					add(profesorToolbar, BorderLayout.NORTH);
					studentToolbar.hide();
					profesorToolbar.show();
					predmetToolbar.hide();
				}else {
					add(predmetToolbar, BorderLayout.NORTH);
					studentToolbar.hide();
					profesorToolbar.hide();
					predmetToolbar.show();
				}
			}
			
			
		});
			this.addWindowListener(new WindowListener(){

				@Override
				public void windowActivated(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowClosed(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowClosing(WindowEvent arg0) {
					// TODO Auto-generated method stub
					BazaPredmeta.getInstance().serijalizacijaPredmeta();
					BazaProfesora.getInstance().serijalizacijaProfesora();
				}

				@Override
				public void windowDeactivated(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowDeiconified(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowIconified(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowOpened(WindowEvent arg0) {
					// TODO Auto-generated method stub
					BazaPredmeta.getInstance().deserijalizacijaPredmeta();
					BazaProfesora.getInstance().deserijalizacijaProfesora();
				}
				
			}); 	
			
	}
	
	
}