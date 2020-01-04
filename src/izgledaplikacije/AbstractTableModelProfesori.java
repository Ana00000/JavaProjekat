package izgledaplikacije;

import javax.swing.table.AbstractTableModel;

import modelsistema.BazaProfesora;

public class AbstractTableModelProfesori extends AbstractTableModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return BazaProfesora.getInstance().getColumnCount();
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return BazaProfesora.getInstance().getProfesori().size();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return BazaProfesora.getInstance().getValueAt(arg0,arg1);
	}

	@Override
	public String getColumnName(int column) {
		
		return BazaProfesora.getInstance().getColumnName(column);
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		super.setValueAt(aValue, rowIndex, columnIndex);
		
	}

	
}
