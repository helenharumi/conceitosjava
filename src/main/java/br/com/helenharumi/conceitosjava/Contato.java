package br.com.helenharumi.conceitosjava;

public class Contato {

	private String nome;
	private Integer telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return nome + " " + telefone;
	}
}
