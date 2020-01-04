package izgledaplikacije;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class StudentiJTable extends JTable {

	private static final long serialVersionUID = 1L;
	
	private static StudentiJTable instance = null;
	
	public static StudentiJTable getInstance() {
		if(instance == null) {
			instance = new StudentiJTable();
		}
		return instance;
	}
	
	private TableRowSorter<AbstractTableModelStudenti> sorter;
	
	public StudentiJTable() {
		this.setModel(new AbstractTableModelStudenti());
		sorter = new TableRowSorter<>((AbstractTableModelStudenti) getModel());
		this.setRowSorter(sorter);
	}

	public void search(String query) {
		String[] parts = query.split(";");
		Map<String,String> map = new HashMap<>();
		
		map.put("ime", "");
		map.put("prezime", "");
		map.put("datum rođenja", "");
		map.put("adresa stanovanja", "");
		map.put("kontakt telefon", "");
		map.put("e-mail adresa", "");
		map.put("broj indeksa", "");
		map.put("datum upisa", "");
		map.put("trenutna godina studija", "");
		map.put("status", "");
		map.put("prosečna ocena", "");
		
		for(int i = 0; i < parts.length; i++) {
			String[] splited = parts[i].split(":");
			if(splited.length > 1) {
			map.put(splited[0].toLowerCase(), splited[1]);
			}
		}
		
		List<RowFilter<Object,Object>> rfs = new ArrayList<RowFilter<Object,Object>>();
		
		rfs.add(RowFilter.regexFilter(".*" + map.get("ime") + ".*", 0));
		rfs.add(RowFilter.regexFilter(".*" + map.get("prezime") + ".*", 1));
		rfs.add(RowFilter.regexFilter(".*" + map.get("datum rođenja") + ".*", 2));
		rfs.add(RowFilter.regexFilter(".*" + map.get("adresa stanovanja") + ".*", 3));
		rfs.add(RowFilter.regexFilter(".*" + map.get("kontakt telefon") + ".*", 4));
		rfs.add(RowFilter.regexFilter(".*" + map.get("e-mail adresa") + ".*", 5));
		rfs.add(RowFilter.regexFilter(".*" + map.get("broj indeksa") + ".*", 6));
		rfs.add(RowFilter.regexFilter(".*" + map.get("datum upisa") + ".*", 7));
		rfs.add(RowFilter.regexFilter(".*" + map.get("trenutna godina studija") + ".*", 8));
		rfs.add(RowFilter.regexFilter(".*" + map.get("status") + ".*", 9));
		rfs.add(RowFilter.regexFilter(".*" + map.get("prosečna ocena") + ".*", 10));
		
		sorter.setRowFilter(RowFilter.andFilter(rfs));
	}
}
