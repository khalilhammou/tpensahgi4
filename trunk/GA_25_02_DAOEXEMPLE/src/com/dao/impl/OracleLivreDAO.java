package com.dao.impl;

import com.bo.Livre;
import com.dao.LivreDAO;

public class OracleLivreDAO implements LivreDAO {

	@Override
	public void save(Livre l) {

		System.out.println("je suis un OracleLivreDAO");
	}

}
