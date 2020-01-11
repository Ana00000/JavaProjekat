package izgledaplikacije;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import modelsistema.BazaStudenata;
import modelsistema.Student;
import controllers.StudentiController;
import funkcionalnosti.DodavanjeStudenta;
import funkcionalnosti.IzmenaStudenta;

public class ToolBarStudent extends JToolBar{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	
	public ToolBarStudent(){
		JPanel panel=new JPanel();
		FlowLayout flowLayout=(FlowLayout)  panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		add(panel);
		
		JButton btnAdd = new JButton("");
		btnAdd.setToolTipText("Add student");
		ImageIcon image1 = new ImageIcon(getClass().getResource("/slike/icons8-add-user-male-24.png"));
		btnAdd.setIcon(image1);
		btnAdd.setMnemonic(KeyEvent.VK_A);
		panel.add(btnAdd);
		
		
		
		
		JButton btnInsert = new JButton("");
		btnInsert.setToolTipText("Insert sudent");
		ImageIcon image5 = new ImageIcon(getClass().getResource("/slike/icons8-edit-24.png"));
		btnInsert.setIcon(image5);
		btnInsert.setMnemonic(KeyEvent.VK_I);
		panel.add(btnInsert);
		
		
		JButton btnDelete = new JButton("");
		btnDelete.setToolTipText("Delete student");
		ImageIcon image2 = new ImageIcon(getClass().getResource("/slike/icons8-trash-24.png"));
		btnDelete.setIcon(image2);
		btnDelete.setMnemonic(KeyEvent.VK_D);
		panel.add(btnDelete);
		
		
		JPanel panel1=new JPanel();
		FlowLayout flowLayout1=(FlowLayout)  panel1.getLayout();
		flowLayout1.setAlignment(FlowLayout.RIGHT);
		add(panel1);
		
		textField=new JTextField();
		textField.setFont(new Font("Tahoma",Font.PLAIN,30));
		panel1.add(textField);
		textField.setColumns(15);
		
		JButton btnSearch=new JButton("");
		btnSearch.setToolTipText("Search student");
		ImageIcon image9 = new ImageIcon(getClass().getResource("/slike/icons8-search-24.png"));
		btnSearch.setIcon(image9);
		btnSearch.setMnemonic(KeyEvent.VK_S);
		panel1.add(btnSearch);
	
		
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				DodavanjeStudenta stud=new DodavanjeStudenta();
				stud.setVisible(true);
			}
			
		});
		
		btnDelete.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(!StudentiJTable.getInstance().getSelectionModel().isSelectionEmpty()) {	
				int row=StudentiJTable.getInstance().convertRowIndexToModel(StudentiJTable.getInstance().getSelectedRow());
				
				Student student=BazaStudenata.getInstance().getRow(row);
				
				if(JOptionPane.showConfirmDialog(null,"Da li ste sigurni da zelite da obrisete studenta?","Brisanje Studenta",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
					StudentiController.getInstance().izbrisiStudenta(student);
			}else {
				return;
			} } else {
				JOptionPane.showMessageDialog(new JFrame(), "Potrebno je izabrati studenta kojeg želite da obrišete ", "Greška!", JOptionPane.ERROR_MESSAGE);
			}
		}
		});
		btnInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(!StudentiJTable.getInstance().getSelectionModel().isSelectionEmpty()) {
				int row=StudentiJTable.getInstance().convertRowIndexToModel(StudentiJTable.getInstance().getSelectedRow());
				Student student=BazaStudenata.getInstance().getRow(row);
				
			    IzmenaStudenta izmena=new IzmenaStudenta(student);
				izmena.setVisible(true);
			
				}else {
					JOptionPane.showMessageDialog(new JFrame(), "Potrebno je izabrati studenta kojeg želite da izmenite ", "Greška!", JOptionPane.ERROR_MESSAGE);
				}
			
			}
			
		});
		btnSearch.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String query=textField.getText();
				StudentiJTable.getInstance().search(query);
			}
			
		});
		
	}
	
}
