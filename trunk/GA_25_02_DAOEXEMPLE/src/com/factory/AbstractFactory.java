package com.factory;

import codeclient.ConfigLoader;

import com.dao.EtudiantDAO;
import com.dao.LivreDAO;

public abstract class AbstractFactory {

	public static final int XML_STORAGE = 0;

	public static final int ORACLE_STORAGE = 1;

	public static AbstractFactory getFactory() {

		int typeStorage = Integer.valueOf(ConfigLoader
				.getString("type_storage"));

		switch (typeStorage) {
		case XML_STORAGE:
			return new XMLFactoryDAO();

		case ORACLE_STORAGE:
			return new OracleFactoryDAO();

		}

		return new OracleFactoryDAO();

	}

	public abstract EtudiantDAO getEtudiantDAO();

	public abstract LivreDAO getLivreDAO();

}
