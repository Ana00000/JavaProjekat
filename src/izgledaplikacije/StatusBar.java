package izgledaplikacije;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.Font;

public class StatusBar extends JPanel{
	
	private static final long serialVersionUID = -4993387552790893124L;
    
	private JLabel name;
	private JLabel time;
	private JLabel date;
	
    public StatusBar(){
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void jbInit() throws Exception{
		GridBagLayout gb = new GridBagLayout();
		this.setLayout(gb);
		
		GridBagConstraints gc1 = new GridBagConstraints();
		GridBagConstraints gc2 = new GridBagConstraints();
		GridBagConstraints gc3 = new GridBagConstraints();
		
		name =  new JLabel("Studentska služba");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		
		time = new JLabel();
		final DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm");
		time.setFont(new Font("Arial", Font.PLAIN, 20));
		
		date = new JLabel();
		final DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
		date.setFont(new Font("Arial", Font.PLAIN, 20));
		
		gc1.gridx = 0;
		gc1.gridy = 0;
		gc1.weightx = 100;
		gc1.weighty = 100;
		gc1.gridwidth = 1;
		gc1.gridheight = 2;
		gc1.anchor = GridBagConstraints.WEST;
		gc1.ipadx = 10;
		gc1.ipady = 5;
		gc1.insets.left = 5;
		
		gc2.gridx = 1;
		gc2.gridy = 0;
		gc2.weightx = 100;
		gc2.weighty = 100;
		gc2.gridwidth = 1;
		gc2.gridheight = 2;
		gc2.anchor = GridBagConstraints.EAST;
		gc2.ipadx = 10;
		gc2.ipady = 5;
		gc2.insets.left = 1050;
		
		gc3.gridx = 2;
		gc3.gridy = 0;
		gc3.weightx = 100;
		gc3.weighty = 100;
		gc3.gridwidth = 1;
		gc3.gridheight = 2;
		gc3.anchor = GridBagConstraints.EAST;
		gc3.ipadx = 10;
		gc3.ipady = 5;
		gc3.insets.right = 5;
		
		this.add(name, gc1);
		this.add(time, gc2);
		this.add(date, gc3);
		this.setBackground(Color.LIGHT_GRAY);

		Timer timer = new Timer(500, new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	time.setText(LocalDateTime.now().format(formatTime));
		    	date.setText(LocalDateTime.now().format(formatDate));
		    }
		});
	        
		timer.setRepeats(true);
		timer.setCoalesce(true);
		timer.setInitialDelay(0);
		timer.start();
	}
}