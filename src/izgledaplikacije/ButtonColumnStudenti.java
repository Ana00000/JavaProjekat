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

public class ButtonColumnStudenti  extends AbstractCellEditor implements TableCellRenderer, TableCellEditor {

	private static final long serialVersionUID = 1L;

	private JButton renderButton;
	private JButton editorButton;
	private JTable table;
	
	@Override
	public Object getCellEditorValue() {
		return null;
	}
	
	public ButtonColumnStudenti(JTable table, int column) {
		
		this.table = table;
		this.table.getColumnModel().getColumn(column).setCellRenderer(this);
		this.table.getColumnModel().getColumn(column).setCellEditor(this);

		this.renderButton = new JButton("Prikaži");
		this.editorButton = new JButton("Prikaži");

		this.editorButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fireEditingStopped();
				JOptionPane.showMessageDialog(table, "Selektovan je student u redu: " + table.getSelectedRow());
			}
		});
	}
	
	@Override
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		
		return new StudentiTablePanel(this.editorButton);
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		
		return new StudentiTablePanel(this.renderButton);
	}

}
