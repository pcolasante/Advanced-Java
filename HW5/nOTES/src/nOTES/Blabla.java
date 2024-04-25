package nOTES;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.nio.file.*;
import java.io.*;

// SAME CODE BUT INSIDE OWN CLASS
class MyFrame extends JFrame {
	public MyFrame() {
		super();
		init();
	}

	private void init() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("JCheckBox Test");
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JCheckBox ac = new JCheckBox("A/C");
		ac.setSelected(true);
		JCheckBox cdPlayer = new JCheckBox("CD Player");
		JCheckBox cruiseControl = new JCheckBox("Cruise Control");
		JCheckBox keylessEntry = new JCheckBox("Keyless Entry");
		JCheckBox antiTheft = new JCheckBox("Anti-Theft Alarm");
		JCheckBox centralLock = new JCheckBox("Central Lock");
		frame.add(new JLabel("Car Features"));
		frame.add(ac);
		frame.add(cdPlayer);
		frame.add(cruiseControl);
		frame.add(keylessEntry);
		frame.add(antiTheft);
		frame.add(centralLock);
		frame.pack();
		frame.setVisible(true);
	}

}

public class Blabla {
	
	private static void constructGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		MyFrame frame = new MyFrame(); 
		frame.setVisible(true);
	}

	public static void main(String[] args) { // this creates a new thread. correct way to call GUI. you could call
												// contructGUI itself, but this works better.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { // run function that just calls constructGUI
				constructGUI();
			}
		});
	}
}
