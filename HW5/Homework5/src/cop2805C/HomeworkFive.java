/*
 * Author: Paulina Flores
 * Date: 02/16/2020
 * COP2802C
 * Build a GUI that has the following:
    A JComboBox with selections: “Single” and “Multiple”
    A JList with countries inside of it (an array of Strings).  You don't have to use the same countries that I did.
    A JLabel that shows what is currently selected

 */
package cop2805C;

import java.util.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.*;
import java.nio.file.*;
import java.io.*;

class MyFrame extends JFrame {
	
	public JLabel label;//text at end
	public int i = 0;
	public JList list;
	
	public MyFrame() {
		super();
		init();
		
	}
	// ACTION LISTENER
class MyActionListener implements ActionListener {
	MyFrame localFrame;
	public  MyActionListener(MyFrame frame) {
		localFrame = frame;
		
	}
	public void actionPerformed(ActionEvent e) {
		JComboBox source = (JComboBox) e.getSource();
		String selectedText = (String)source.getSelectedItem();
		JOptionPane.showMessageDialog(null, "You clicked " + selectedText);
		if(selectedText == "Multiple") {
			localFrame.list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		}else if(selectedText == "Single"){
			localFrame.list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		}
	}
	
}
	
	// LIST LISTENER
class MyListListener implements ListSelectionListener {

		MyFrame localFrame;
			
			public MyListListener (MyFrame frame) {
				localFrame = frame;
			}
			public void valueChanged(ListSelectionEvent e) {
				JList source = (JList) e.getSource();
				localFrame.label.setText("You have selected: "+source.getSelectedValuesList()); // How did I pull this off, it is the mystery of the year.
				//System.out.println(source.getSelectedValue());
				
				// USE CTRL WHEN SELECTING
			}
}

	
	private void init() {
		//JCOMBOBOX
		 this.setLayout(new FlowLayout());
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 String[] selections = { "Single", "Multiple" };
		 JComboBox comboBox = new JComboBox(selections);
		 comboBox.setSelectedIndex(1);
		 comboBox.addActionListener(new MyActionListener(this));
		 
		
		 //JLIST
		 
		 String[] countries = { "Venezuela" , "Colombia", "USA", "Costa Rica", "Montevideo", "Spain", "Italy" };
		 list = new JList(countries);
		 list.setSelectedIndex(1);
		 list.addListSelectionListener(new MyListListener(this));
		 
		 

		 // JLABEL
		 
		 label = new JLabel("You have no countries selected");
		 this.pack();
		 this.setVisible(true);
		 
		 // LAYOUT
		 
		 JComponent panel = new JPanel();
			panel.setLayout(new FlowLayout());
			panel.add(new JLabel("Choose Selection Mode:"));
			panel.add(comboBox);
			this.add(panel, BorderLayout.NORTH);
			this.add(list, BorderLayout.WEST);
			this.add(label, BorderLayout.SOUTH);


	}

}


	//CONSTRUCTGUI
public class HomeworkFive {
	
	private static void constructGUI() {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		MyFrame frame = new MyFrame();
		int frameWidth = 250;
		int frameHeight = 300;

		Dimension screenSize =
				Toolkit.getDefaultToolkit().getScreenSize();
				frame.setBounds((int) screenSize.getWidth() - frameWidth,
				0, frameWidth, frameHeight);

		frame.setVisible(true);
		
	}

	//MAIN
		public static void main(String[] args) {

			SwingUtilities.invokeLater(new Runnable() {
				public void run() { // run function that just calls constructGUI
					constructGUI();
				}
			});
		}

	}
