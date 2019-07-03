package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton addname;
	JButton viewname;
	String inputtedname;
	String[] names[];
	int numberofnames = 0;
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. 
	//Add that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	public void makeFrame() {
		frame = new JFrame();
		panel = new JPanel();
		addname = new JButton();
		viewname = new JButton();
		AddandSet();
	}

	public void AddandSet() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(3);
		frame.add(panel);
		panel.add(addname);
		panel.add(viewname);
		addname.addActionListener(this);
		viewname.addActionListener(this);
		addname.setText("Add Name");
		viewname.setText("View Name");
		frame.pack();
	}
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
if (addname==e.getSource()) {
 String names[]= new String[numberofnames+1];
 inputtedname = JOptionPane.showInputDialog("Please enter a name.");
 names[numberofnames] = inputtedname;
}
else if(viewname==e.getSource()) {
	for (int i = 0; i < names.length; i++) {
		JOptionPane.showMessageDialog(null, names[i]);
	}
}
	}
	
}
