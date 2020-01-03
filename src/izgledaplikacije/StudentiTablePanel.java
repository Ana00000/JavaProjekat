package izgledaplikacije;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JPanel;

public class StudentiTablePanel extends JPanel{

	private static final long serialVersionUID = 1L;

	private JPanel leftPanel = new JPanel();
	private JPanel rightPanel = new JPanel();
	
	
	public StudentiTablePanel() {
		super();
		this.setBackground(Color.WHITE);
	}
	
	public StudentiTablePanel(Component c) {
		setLayout(new BorderLayout());
		this.add(leftPanel, BorderLayout.WEST);
		this.add(rightPanel, BorderLayout.EAST);
		this.setBackground(Color.WHITE);
		add(c);
	}
	
}