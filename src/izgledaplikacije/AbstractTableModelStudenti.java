package izgledaplikacije;

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
		return BazaStudenata.getInstance().getColumnCount() ;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return BazaStudenata.getInstance().getValueAt(rowIndex, columnIndex);
	}

	@Override
	public void setValueAt(Object value, int rowIndex, int columnIndex) {
		super.setValueAt(value, rowIndex, columnIndex);
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
	
	@Override
	public String getColumnName(int column) {
		return BazaStudenata.getInstance().getColumnName(column);
	}

}