package com.factory;

import com.dao.EtudiantDAO;
import com.dao.LivreDAO;
import com.dao.impl.SQLiteEtudiantDAO;
import com.dao.impl.SQLiteLivreDAO;

public class SQLiteFactory extends AbstractDAOFactory {

	public EtudiantDAO getEtudiantDao() {
		return new SQLiteEtudiantDAO();
	}

	public LivreDAO getLivreDao() {
		return new SQLiteLivreDAO();
	}

}
