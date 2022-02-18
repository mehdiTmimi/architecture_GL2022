package com.gl.utils;

import java.util.List;

import com.gl.beans.Etudiant;
import com.gl.beans.Option;
import com.gl.business.DefaultServices;
import com.gl.business.Services;
import com.gl.dao.EtudiantDaoJdbc;
import com.gl.dao.EtudiantDaoTxt;
import com.gl.presentation.view.AccueilJframe;

public class Main {
	private Services services;
	public Main() {
		Etudiant etudiant=new Etudiant("CD1234567", "Tmimi", "mehdi");
		Etudiant etudiant2=new Etudiant("CD2334634", "alaoui", "anouar");
		
		Option option=new Option("GL", "Programmation et dev");
		etudiant.setOption(option);
		etudiant2.setOption(option);
		try {
		services.addEtudiant(etudiant);
		services.addEtudiant(etudiant2);
		
		List<Etudiant> etudiants=services.getEtudiants();
		for(Etudiant e:etudiants)
			{
			System.out.println(e.getNom()+" "+e.getPrenom()+" " +e.getOption().getNom());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Main();
	}

}
