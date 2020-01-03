package izgledaplikacije;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class ButtonColumnPredmeti extends AbstractCellEditor implements TableCellRenderer,TableCellEditor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton renderButton;
	private JButton editorButton;
	private JTable table;
	
	public ButtonColumnPredmeti(final JTable table,int column) {
		this.table=table;
		this.table.getColumnModel().getColumn(column).setCellRenderer(this);
		// nacin editovanja celije
		this.table.getColumnModel().getColumn(column).setCellEditor(this);
		
		this.renderButton= new JButton("Prikazi");
		this.editorButton=new JButton("Prikazi");
		
		this.editorButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fireEditingStopped();
				JOptionPane.showMessageDialog(table, "Selektovan je predmet u redu: " + table.getSelectedRow());
			}
		});
	}
	@Override
	public Object getCellEditorValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Component getTableCellRendererComponent(JTable arg0, Object arg1,
			boolean arg2, boolean arg3, int arg4, int arg5) {
		// TODO Auto-generated method stub
		return new PredmetiTablePanel(this.renderButton);
	}

	@Override
	public Component getTableCellEditorComponent(JTable arg0, Object arg1,
			boolean arg2, int arg3, int arg4) {
		// TODO Auto-generated method stub
		 return new  PredmetiTablePanel(this.editorButton);
	}

}
