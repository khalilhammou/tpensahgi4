
package codeclient;

import com.bo.Etudiant;
import com.dao.EtudiantDAO;
import com.factory.AbstractFactory;

public class Client {



	public static void main(String[] args) {

		
		
		AbstractFactory factory =  AbstractFactory.getFactory();
		
		EtudiantDAO  etdao = factory.getEtudiantDAO();
		
		etdao.save(new Etudiant());
		
		
		
	}

}
