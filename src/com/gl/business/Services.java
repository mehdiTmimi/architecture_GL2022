package com.gl.business;

import java.util.List;

import com.gl.beans.Etudiant;
import com.gl.beans.Option;

public interface Services {

	// etudiant
	public Etudiant addEtudiant(Etudiant etudiant) throws Exception;
	public Etudiant updateEtudiant(Etudiant etudiant) throws Exception;
	public Etudiant deleteEtudiant(Etudiant etudiant) throws Exception;
	public Etudiant getEtudiant(String cne) throws Exception;
	public List<Etudiant> getEtudiants() throws Exception;
	
	//Option
	public Option addOption(Option option) throws Exception;
	public Option updateOption(Option option) throws Exception;
	public Option deleteOption(Option option) throws Exception;
	public Option getOption(String name) throws Exception;
	public List<Option> getOptions() throws Exception;
	
	//divers
	public boolean transferEtudiantOption(Etudiant etudiant,Option option) throws Exception;
}
