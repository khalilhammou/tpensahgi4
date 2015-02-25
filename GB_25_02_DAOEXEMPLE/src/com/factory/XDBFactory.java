package com.factory;

import com.dao.EtudiantDAO;
import com.dao.LivreDAO;
import com.dao.impl.XDBEtudiantDAO;
import com.dao.impl.XDBLivreDAO;

public class XDBFactory extends AbstractDAOFactory {

	public EtudiantDAO getEtudiantDao() {
		return new XDBEtudiantDAO();
	}

	public LivreDAO getLivreDao() {
		return new XDBLivreDAO();
	}

}
