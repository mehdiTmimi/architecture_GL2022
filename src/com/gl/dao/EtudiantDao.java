package com.gl.dao;

import java.util.List;

import com.gl.beans.Etudiant;

public interface EtudiantDao {

	public Etudiant addEtudiant(Etudiant etudiant) throws Exception;
	public Etudiant updateEtudiant(Etudiant etudiant) throws Exception;
	public Etudiant deleteEtudiant(Etudiant etudiant) throws Exception;
	public Etudiant getEtudiant(String cne) throws Exception;
	public List<Etudiant> getEtudiants() throws Exception;
	//public List<Etudiant> getEtudiantsByName(String name);
}
