package com.factory;

import com.bo.ConfigLoader;
import com.dao.EtudiantDAO;
import com.dao.LivreDAO;

public abstract class AbstractDAOFactory {

	public static AbstractDAOFactory getFactory() {

		String type = ConfigLoader.getString("type_stockage");

		if ("sqlite".equals(type)) {

			return new SQLiteFactory();
		}

		else if ("xdb".equals(type)) {

			return new XDBFactory();
		}

		else {

			throw new RuntimeException("Configuration problem");
		}

	}

	public abstract EtudiantDAO getEtudiantDao();

	public abstract LivreDAO getLivreDao();

}
