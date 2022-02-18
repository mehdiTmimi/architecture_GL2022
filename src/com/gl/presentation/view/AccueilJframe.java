package com.gl.presentation.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.gl.presentation.controller.UpperCaseAction;

public class AccueilJframe extends JFrame{
	private JPanel panel;
	private JButton button;
	private JTextField textField;
	public AccueilJframe()
	{
		setTitle("Accueil");
		setVisible(true);
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel =new JPanel();
		button=new JButton("uppercase");
		textField=new JTextField(10);
		panel.add(textField);
		panel.add(button);
		panel.setLayout(new FlowLayout());
		setContentPane(panel);
		UpperCaseAction upperCaseAction=new UpperCaseAction(this);
		button.addActionListener(upperCaseAction);
		
	}
	public JPanel getPanel() {
		return panel;
	}
	public JButton getButton() {
		return button;
	}
	public JTextField getTextField() {
		return textField;
	}
	
}
