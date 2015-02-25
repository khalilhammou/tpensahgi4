package com.client;

import com.bo.Livre;
import com.dao.LivreDAO;
import com.factory.AbstractDAOFactory;

public class Client {

	public static void main(String[] args) {

		AbstractDAOFactory factory = AbstractDAOFactory.getFactory();

		// je t'ai déja specifier le type de le fichier de configuration

		LivreDAO dao = factory.getLivreDao();

		dao.save(new Livre());

	}

}
