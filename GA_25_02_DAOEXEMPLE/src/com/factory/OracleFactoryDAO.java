package com.factory;

import com.dao.EtudiantDAO;
import com.dao.LivreDAO;
import com.dao.impl.*;

public class OracleFactoryDAO extends AbstractFactory {

	public  EtudiantDAO getEtudiantDAO() {

		return new OracleEtudiantDAO();
	}

	public  LivreDAO getLivreDAO() {

		return new OracleLivreDAO();
	}

}
