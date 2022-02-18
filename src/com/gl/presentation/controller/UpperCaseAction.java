package com.gl.presentation.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.gl.presentation.view.AccueilJframe;

public class UpperCaseAction implements ActionListener{

	private AccueilJframe accueilJframe;
	@Override
	public void actionPerformed(ActionEvent e) {
		String tmp=accueilJframe.getTextField().getText().toUpperCase();
		accueilJframe.getTextField().setText(tmp);
		
	}
	public UpperCaseAction(AccueilJframe accueilJframe) {
		super();
		this.accueilJframe = accueilJframe;
	}
	

}
