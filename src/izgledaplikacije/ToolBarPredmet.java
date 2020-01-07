package izgledaplikacije;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import controllers.PredmetiController;
import modelsistema.BazaPredmeta;
import modelsistema.Predmet;
import funkcionalnosti.DodavanjePredmeta;
import funkcionalnosti.DodavanjeProfesoraNaPredmet;
import funkcionalnosti.DodavanjeStudentaNaPredmet;
//import funkcionalnosti.DodavanjeStudentaNaPredmet;
import funkcionalnosti.IzmenaPredmeta;

public class ToolBarPredmet extends JToolBar{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	public ToolBarPredmet() {
		JPanel panel=new JPanel();
		FlowLayout flowLayout=(FlowLayout)  panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		add(panel);
		
		JButton btnAdd = new JButton("");
		btnAdd.setToolTipText("Add subject");
		ImageIcon image1 = new ImageIcon(getClass().getResource("/slike/icons8-add-user-male-24.png"));
		btnAdd.setIcon(image1);
		btnAdd.setMnemonic(KeyEvent.VK_A);
		panel.add(btnAdd);
		
		
		
		
		JButton btnInsert = new JButton("");
		btnInsert.setToolTipText("Insert subject");
		ImageIcon image5 = new ImageIcon(getClass().getResource("/slike/icons8-edit-24.png"));
		btnInsert.setIcon(image5);
		btnInsert.setMnemonic(KeyEvent.VK_I);
		panel.add(btnInsert);
		
		
		JButton btnDelete = new JButton("");
		btnDelete.setToolTipText("Delete subject");
		ImageIcon image2 = new ImageIcon(getClass().getResource("/slike/icons8-trash-24.png"));
		btnDelete.setIcon(image2);
		btnDelete.setMnemonic(KeyEvent.VK_D);
		panel.add(btnDelete);
		
		JButton addProfesorBtn=new JButton("");
		addProfesorBtn.setToolTipText("Add profesor on subject");
		ImageIcon image6=new ImageIcon(getClass().getResource("/slike/icons8-popular-man-24.png"));
		addProfesorBtn.setIcon(image6);
		panel.add(addProfesorBtn);
		
		JButton addStudentBtn = new JButton("");
		addStudentBtn.setIcon(image1);
		addStudentBtn.setToolTipText("Add student on subject");
		panel.add(addStudentBtn);
		
		JButton deleteProfesorBtn=new JButton("");
		deleteProfesorBtn.setToolTipText("Delete profesor from subject");
		deleteProfesorBtn.setIcon(image2);
		panel.add(deleteProfesorBtn);
	
	
		
		JPanel panel1=new JPanel();
		FlowLayout flowLayout1=(FlowLayout)  panel1.getLayout();
		flowLayout1.setAlignment(FlowLayout.RIGHT);
		add(panel1);
		
		textField=new JTextField();
		textField.setFont(new Font("Tahoma",Font.PLAIN,30));
		panel1.add(textField);
		textField.setColumns(15);
		
		JButton btnSearch=new JButton("");
		btnSearch.setToolTipText("Search subjects");
		ImageIcon image9 = new ImageIcon(getClass().getResource("/slike/icons8-search-24.png"));
		btnSearch.setIcon(image9);
		btnSearch.setMnemonic(KeyEvent.VK_S);
		panel1.add(btnSearch);
		
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				DodavanjePredmeta pred=new DodavanjePredmeta();
				pred.setVisible(true);
			}
			
		});
		btnDelete.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub 
				int row=PredmetiJTable.getInstance().convertRowIndexToModel(PredmetiJTable.getInstance().getSelectedRow());
				System.out.println("Selected row: "+row); //CONVERT ROW DAJE INDEKS REDA KO
				Predmet predmet=BazaPredmeta.getInstance().getRow(row);
				
				if(JOptionPane.showConfirmDialog(null,"Da li ste sigurni da zelite da obrisete predmet?","Brisanje Predmeta",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
					PredmetiController.getInstance().izbrisiPredmet(predmet);
			}else {
				return;
			}
		}
		});
		btnInsert.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int row=PredmetiJTable.getInstance().convertRowIndexToModel(PredmetiJTable.getInstance().getSelectedRow());
				Predmet predmet=BazaPredmeta.getInstance().getRow(row);
				
			    IzmenaPredmeta izmena=new IzmenaPredmeta(predmet);
				izmena.setVisible(true);
			}
			
		});
		
		addProfesorBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int row=PredmetiJTable.getInstance().convertRowIndexToModel(PredmetiJTable.getInstance().getSelectedRow());
				@SuppressWarnings("unused")
				Predmet predmet=BazaPredmeta.getInstance().getRow(row);
				
				DodavanjeProfesoraNaPredmet dpnp=new DodavanjeProfesoraNaPredmet();
				dpnp.setVisible(true);
			}
			
		});
		addStudentBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int row=PredmetiJTable.getInstance().convertRowIndexToModel(PredmetiJTable.getInstance().getSelectedRow());
				
				@SuppressWarnings("unused")
				Predmet predmet=BazaPredmeta.getInstance().getRow(row);
			
				DodavanjeStudentaNaPredmet dsnp=new DodavanjeStudentaNaPredmet();
				dsnp.setVisible(true);
			}
			
			
		});
		
		deleteProfesorBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int row=PredmetiJTable.getInstance().convertRowIndexToModel(PredmetiJTable.getInstance().getSelectedRow());
				Predmet predmet=BazaPredmeta.getInstance().getRow(row);
				if(!predmet.getProfesor().getIme().equals("")) {
					if(JOptionPane.showConfirmDialog(null,"Da li ste sigurni da zelite da obrisete profesora?","",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
						PredmetiController.getInstance().uklanjanjeProfesoraSaPredmeta(predmet);
				}
			}
			
		});
	
		btnSearch.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String query=textField.getText();
				PredmetiJTable.getInstance().search(query);
			}
			
		});
		
	}
	

}
