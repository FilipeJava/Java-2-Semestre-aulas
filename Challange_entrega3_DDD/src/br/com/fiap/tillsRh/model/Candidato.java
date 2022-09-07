package br.com.fiap.tillsRh.model;

import java.util.ArrayList;
import java.util.List;

public class Candidato {

	// Atributos
	private int id;
	private String nome;
	private String endereco;
	private String email;
	private char sexo;
	private String estadoCivil;
	private List<Contato> listaContato = new ArrayList<>();
	private List<Formacao> listaFormacao = new ArrayList<>();
	private Object foto;
	private List<Experiencia> listaExperiencia = new ArrayList<>();
	private List<Vaga> listaVaga = new ArrayList<>();
	private List<HardSkill> listaHard = new ArrayList<>();
	private List<SoftSkill> listaSoft = new ArrayList<>();

	// Construtores
	public Candidato() {
	}

	public Candidato(int id, String nome, String endereco, String email, char sexo, String estadoCivil,
			List<Contato> listaContato, List<Formacao> listaFormacao, Object foto, List<Experiencia> listaExperiencia,
			List<Vaga> listaVaga, List<HardSkill> listaHard, List<SoftSkill> listaSoft) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.listaContato = listaContato;
		this.listaFormacao = listaFormacao;
		this.foto = foto;
		this.listaExperiencia = listaExperiencia;
		this.listaVaga = listaVaga;
		this.listaHard = listaHard;
		this.listaSoft = listaSoft;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	// Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Contato> getListaContato() {
		return listaContato;
	}

	public void setListaContato(List<Contato> listaContato) {
		this.listaContato = listaContato;
	}

	public List<Formacao> getListaFormacao() {
		return listaFormacao;
	}

	public void setListaFormacao(List<Formacao> listaFormacao) {
		this.listaFormacao = listaFormacao;
	}

	public Object getFoto() {
		return foto;
	}

	public void setFoto(Object foto) {
		this.foto = foto;
	}

	public List<Experiencia> getListaExperiencia() {
		return listaExperiencia;
	}

	public void setListaExperiencia(List<Experiencia> listaExperiencia) {
		this.listaExperiencia = listaExperiencia;
	}

	public List<Vaga> getListaVaga() {
		return listaVaga;
	}

	public void setListaVaga(List<Vaga> listaVaga) {
		this.listaVaga = listaVaga;
	}

	public List<HardSkill> getListaHard() {
		return listaHard;
	}

	public void setListaHard(List<HardSkill> listaHard) {
		this.listaHard = listaHard;
	}

	public List<SoftSkill> getListaSoft() {
		return listaSoft;
	}

	public void setListaSoft(List<SoftSkill> listaSoft) {
		this.listaSoft = listaSoft;
	}

}
