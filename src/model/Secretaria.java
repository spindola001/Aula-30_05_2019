package model;

public abstract class Secretaria extends Funcionario {
	private String especialidade;
	private String fucao;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getFucao() {
		return fucao;
	}

	public void setFucao(String fucao) {
		this.fucao = fucao;
	}
	
	
}
