package com.gl.business;

import java.sql.SQLException;
import java.util.List;

import com.gl.beans.Etudiant;
import com.gl.beans.Option;
import com.gl.dao.EtudiantDao;
import com.gl.dao.EtudiantDaoJdbc;
import com.gl.dao.EtudiantDaoTxt;
import com.gl.dao.OptionDao;
import com.gl.dao.OptionDaoJdbc;

public class DefaultServices implements Services {

	private EtudiantDao etudiantDao;
	private OptionDao optionDao;
	
	private static DefaultServices instance = null;
	private DefaultServices() throws Exception {
		etudiantDao=new EtudiantDaoJdbc();
		optionDao=new OptionDaoJdbc();
	}
	public static DefaultServices getInstance() throws Exception
	{
		if(instance==null)
			instance=new DefaultServices();
		return instance;
	}
	
	@Override
	public Etudiant addEtudiant(Etudiant etudiant) throws Exception{
		return etudiantDao.addEtudiant(etudiant);
	}

	@Override
	public Etudiant updateEtudiant(Etudiant etudiant) throws Exception{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Etudiant deleteEtudiant(Etudiant etudiant)throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Etudiant getEtudiant(String cne) throws Exception{
		// TODO Auto-generated method stub
		return etudiantDao.getEtudiant(cne);
	}

	@Override
	public List<Etudiant> getEtudiants() throws Exception{
		
		return etudiantDao.getEtudiants();
	}

	@Override
	public Option addOption(Option option)throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Option updateOption(Option option) throws Exception{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Option deleteOption(Option option)throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Option getOption(String name) throws Exception{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Option> getOptions() throws Exception{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean transferEtudiantOption(Etudiant etudiant, Option option) throws Exception {
		etudiant.setOption(option);
		return etudiantDao.updateEtudiant(etudiant)!=null;
	}
	public void setEtudiantDao(EtudiantDao etudiantDao) {
		this.etudiantDao = etudiantDao;
	}

}
