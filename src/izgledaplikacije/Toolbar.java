package izgledaplikacije;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class Toolbar extends JToolBar{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public Toolbar() {
		
		super(SwingConstants.HORIZONTAL);
		
	
	
		
		JButton btnAdd = new JButton();
		btnAdd.setToolTipText("Add");
		ImageIcon image1 = new ImageIcon(getClass().getResource("/slike/icons8-add-user-male-24.png"));
		btnAdd.setIcon(image1);
		
		add(btnAdd);
		
		
		JButton btnInsert = new JButton();
		btnInsert.setToolTipText("Insert");
		ImageIcon image5 = new ImageIcon(getClass().getResource("/slike/icons8-edit-24.png"));
		btnInsert.setIcon(image5);
		add(btnInsert);
		
		
		JButton btnDelete = new JButton();
		btnDelete.setToolTipText("Delete");
		ImageIcon image2 = new ImageIcon(getClass().getResource("/slike/icons8-trash-24.png"));
		btnDelete.setIcon(image2);
		add(btnDelete);

		JPanel jpan=new JPanel();
		jpan.setPreferredSize(new Dimension(500,10));
		add(jpan);
		
		
		JTextField textField = new JTextField();
		textField.setToolTipText("Select");
		 add(textField);
		
        
		
		JButton btnSearch=new JButton();
		btnSearch.setToolTipText("Search");
		ImageIcon image9 = new ImageIcon(getClass().getResource("/slike/icons8-search-24.png"));
		btnSearch.setIcon(image9);
	
		add(btnSearch);
		
		
		
		
		setFloatable(false);
	

	}
}
