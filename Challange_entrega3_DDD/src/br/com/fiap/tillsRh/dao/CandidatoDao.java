package br.com.fiap.tillsRh.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.tillsRh.model.Candidato;

public class CandidatoDao {

	private List<Candidato> listCandidato = new ArrayList<>();

	public void add(Candidato candidato) {
		listCandidato.add(candidato);
	}

	public void remover(int id) {
		for (Candidato c : listCandidato) {
			if (c.getId() == id) {
				listCandidato.remove(c);
			}
		}
	}

	public void listar() {
		for (Candidato c : this.listCandidato) {
			System.out.println(c.getId());
		}
	}
}