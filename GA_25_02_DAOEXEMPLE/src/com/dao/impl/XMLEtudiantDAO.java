package com.dao.impl;

import com.bo.Etudiant;
import com.dao.EtudiantDAO;

public class XMLEtudiantDAO implements EtudiantDAO {

	@Override
	public void save(Etudiant l) {
		System.out.println("Je suis un XMLEtudiantDAO ");
	}

}
