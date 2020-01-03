package izgledaplikacije;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class PredmetiTablePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel leftPanel = new JPanel();

	private JPanel rightPanel = new JPanel();
	
	public PredmetiTablePanel() {
		super();
		this.setBackground(Color.WHITE);
	
	}
	public PredmetiTablePanel(java.awt.Component c) {
		setLayout(new BorderLayout());
		this.add(leftPanel, BorderLayout.WEST);
		this.add(rightPanel, BorderLayout.EAST);
		this.setBackground(Color.WHITE);
		add(c);
	}
	
	}

