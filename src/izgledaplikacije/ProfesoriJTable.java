package izgledaplikacije;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
public class ProfesoriJTable extends JTable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static ProfesoriJTable instance=null;
	
	public static ProfesoriJTable getInstance() {
		if(instance==null) {
			instance=new ProfesoriJTable();
		}
		return instance;
	}
	private TableRowSorter<AbstractTableModelProfesori> sorter;
	
	private ProfesoriJTable() {
		this.setModel(new AbstractTableModelProfesori());
		sorter=new TableRowSorter<>((AbstractTableModelProfesori) getModel());
		this.setRowSorter(sorter);
	}
	public void search(String query) {
		String[] parts=query.split(";");
		Map<String,String> map=new HashMap<>();
		
		
		map.put("ime", "");
		map.put("prezime", "");
		map.put("datum rodjenja", "");
		map.put("adresa stanovanja", "");
		map.put("telefon", "");
		map.put("email", "");
		map.put("adresa kancelarije", "");
		map.put("broj licne", "");
		map.put("titula", "");
		map.put("zvanje", "");
		
		for(int i=0;i<parts.length;i++){
			String[] splited = parts[i].split(":");
			if(splited.length > 1) {
			map.put(splited[0].toLowerCase(), splited[1]);
			System.out.println("Kljuc: " + splited[0].toLowerCase() + "\nVrednost: " + splited[1]);
	}
		}
			List<RowFilter<Object,Object>> rf = new ArrayList<RowFilter<Object,Object>>();
			rf.add(RowFilter.regexFilter(".*" + map.get("ime") + ".*",  0)); 
			rf.add(RowFilter.regexFilter(".*" + map.get("prezime") + ".*", 1));
			rf.add(RowFilter.regexFilter(".*" + map.get("datum rodjenja") + ".*", 2));
			rf.add(RowFilter.regexFilter(".*" + map.get("adresa stanovanja") + ".*", 3));
			rf.add(RowFilter.regexFilter(".*" + map.get("telefon") + ".*", 4));
			rf.add(RowFilter.regexFilter(".*" + map.get("email") + ".*", 5));
			rf.add(RowFilter.regexFilter(".*" + map.get("adresa kancelarije") + ".*", 6));
			rf.add(RowFilter.regexFilter(".*" + map.get("broj licne") + ".*", 7));
			rf.add(RowFilter.regexFilter(".*" + map.get("titula") + ".*", 8));
			rf.add(RowFilter.regexFilter(".*" + map.get("zvanje") + ".*", 9));
			sorter.setRowFilter(RowFilter.andFilter(rf));

		
		}
		
	

}
