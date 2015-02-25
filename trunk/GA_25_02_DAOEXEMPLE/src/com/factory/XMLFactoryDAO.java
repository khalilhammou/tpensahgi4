package com.factory;

import com.dao.EtudiantDAO;
import com.dao.LivreDAO;
import com.dao.impl.XMLEtudiantDAO;
import com.dao.impl.XMLLivreDAO;

public class XMLFactoryDAO extends AbstractFactory {

	public EtudiantDAO getEtudiantDAO() {

		return new XMLEtudiantDAO();
	}

	public LivreDAO getLivreDAO() {

		return new XMLLivreDAO();
	}

}
