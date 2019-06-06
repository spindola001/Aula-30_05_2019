package model;

public class Presidente extends Funcionario {
	private String inicMandato;
	private String fimMandato;
	
	public void getBonificacao() {
		
	}

	public String getInicMandato() {
		return inicMandato;
	}

	public void setInicMandato(String inicMandato) {
		this.inicMandato = inicMandato;
	}

	public String getFimMandato() {
		return fimMandato;
	}

	public void setFimMandato(String fimMandato) {
		this.fimMandato = fimMandato;
	}
	
	
}
