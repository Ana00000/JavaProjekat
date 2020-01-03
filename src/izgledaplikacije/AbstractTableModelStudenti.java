package izgledaplikacije;

import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

import modelsistema.BazaStudenata;

public class AbstractTableModelStudenti extends AbstractTableModel {

	private static final long serialVersionUID = 1L;

	@Override
	public int getRowCount() {
		return BazaStudenata.getInstance().getStudenti().size();
	}

	@Override
	public int getColumnCount() {
		return BazaStudenata.getInstance().getColumnCount() + 1;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		if (columnIndex < 11)
			return BazaStudenata.getInstance().getValueAt(rowIndex, columnIndex);
		else if (columnIndex == 11) {
			JButton btn = new JButton("" + rowIndex);
			return btn;
		}
		
		return null;
		
	}

	@Override
	public void setValueAt(Object value, int rowIndex, int columnIndex) {
		super.setValueAt(value, rowIndex, columnIndex);
		if (columnIndex != 11) {
			return;
		}
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return columnIndex >= 11;
	}
	
	@Override
	public String getColumnName(int column) {
		return BazaStudenata.getInstance().getColumnName(column);
	}
	
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
			return JButton.class;
		default:
			return null;
		}
	}

}