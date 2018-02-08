package com.misys.tiplus2.customizationupgrader;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CustomizationUpgrader {

	String[] flow = { "Incoming", "Outgoing" };
	String[] message = { "message1", "message2"};
	String[] field = { "field1", "field2", "field3", "field4" };
	
	private JFrame Frame;
	private JButton OkButton;
	private JPanel Panel1, Panel2;
	private JComboBox comboFlow;
	private JComboBox comboMessage;
	private JComboBox comboField;
	
	public CustomizationUpgrader() {
		Frame = new JFrame("Customization Upgrader");
		OkButton = new JButton("Okay");
		Panel1 = new JPanel();
		Panel2 = new JPanel();
		comboFlow = new JComboBox(flow);
		comboMessage = new JComboBox(message);
		comboField = new JComboBox(field);
		
	}
	
	public static void main(String[] args) {
		ArrayList<String> dummy = new ArrayList<String>();
		Parser nice = new Parser("C:\\TIDev\\nice_hack", dummy);
		//CustomizationUpgrader cu = new CustomizationUpgrader();
		//cu.DeployInterface();
		System.out.println("nice");
	}
	
	public void DeployInterface() {
		Frame.add(Panel1, BorderLayout.CENTER);
		Frame.add(Panel2, BorderLayout.SOUTH);
		Panel1.setLayout(new GridLayout(1,1));
		Panel1.add(comboFlow);
		Panel1.add(comboMessage);
		Panel1.add(comboField);
		Panel2.add(OkButton);
		
		Frame.pack();
		Frame.setVisible(true);
	}

}
