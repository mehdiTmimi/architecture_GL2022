package com.gl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gl.beans.Etudiant;
import com.gl.beans.Option;
import com.gl.utils.MySqlSession;


public class EtudiantDaoJdbc implements EtudiantDao {
	private MySqlSession mySqlSession;
	public  EtudiantDaoJdbc() throws SQLException {
		mySqlSession= MySqlSession.getInstance();
	}
	@Override
	public Etudiant addEtudiant(Etudiant etudiant) throws SQLException {
		Connection connection=mySqlSession.getConnection();
		String query="insert into etudiant values(?,?,?,?)";
		PreparedStatement statement=connection.prepareStatement(query);
		statement.setString(1, etudiant.getCne());
		statement.setString(2, etudiant.getNom());
		statement.setString(3, etudiant.getPrenom());
		statement.setString(4, etudiant.getOption().getNom());
		statement.execute();
		return etudiant;
	}

	@Override
	public Etudiant updateEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Etudiant deleteEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Etudiant getEtudiant(String cne) throws Exception {
		Connection connection=mySqlSession.getConnection();
		String query="Select * from etudiant where cne=?";
		PreparedStatement statement=connection.prepareStatement(query);
		statement.setString(1, cne);
		ResultSet resultSet=statement.executeQuery();
		if(!resultSet.next())
			return null;
		
		Etudiant etudiant=new Etudiant();
		etudiant.setCne(resultSet.getString("cne"));
		etudiant.setNom(resultSet.getString("nom"));
		etudiant.setPrenom(resultSet.getString("prenom"));
		//recuperation de l'option
		String optionId=resultSet.getString("idOption");
		String query2="Select * from option where nom=?";
		PreparedStatement statement2=connection.prepareStatement(query2);
		statement2.setString(1, optionId);
		ResultSet resultSet2=statement2.executeQuery();
		resultSet2.next();
		Option option=new Option();
		option.setNom(resultSet2.getString("nom"));
		option.setDescription(resultSet2.getString("description"));
		
		etudiant.setOption(option);
		return etudiant;
	}

	@Override
	public List<Etudiant> getEtudiants() throws Exception {
		List<Etudiant> etudiants=new ArrayList<Etudiant>();
		
		Connection connection=mySqlSession.getConnection();
		String query="Select * from etudiant";
		PreparedStatement statement=connection.prepareStatement(query);
		ResultSet resultSet=statement.executeQuery();
		while(resultSet.next())
		{
		Etudiant etudiant=new Etudiant();
		etudiant.setCne(resultSet.getString("cne"));
		etudiant.setNom(resultSet.getString("nom"));
		etudiant.setPrenom(resultSet.getString("prenom"));
		//recuperation de l'option
		String optionId=resultSet.getString("idOption");
		String query2="Select * from option where nom=?";
		PreparedStatement statement2=connection.prepareStatement(query2);
		statement2.setString(1, optionId);
		ResultSet resultSet2=statement2.executeQuery();
		resultSet2.next();
		Option option=new Option();
		option.setNom(resultSet2.getString("nom"));
		option.setDescription(resultSet2.getString("description"));
		etudiant.setOption(option);
		etudiants.add(etudiant);
		}
		
		return etudiants;
	}

}
