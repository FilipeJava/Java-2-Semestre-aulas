package br.com.fiap.tillsRh.view;



import br.com.fiap.tillsRh.dao.CandidatoDao;
import br.com.fiap.tillsRh.model.Candidato;

public class view {

	public static void main(String[] jow) {
		Candidato c1 = new Candidato();
		Candidato ca = new Candidato();

		ca.setId(5);
		c1.setId(10);

		CandidatoDao teste = new CandidatoDao();
		
		teste.add(ca);
		teste.add(c1);
		
		teste.listar();
		teste.remover(5);
		teste.listar();
		
		
		
	}
}
