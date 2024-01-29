package br.com.vainaweb.backend.java.aula.classeabstrata;

public class Gerente extends Colaborador {
	
	private String setor;
	
	public Gerente() {
		super();
	}

	public Gerente(String nome, String cpf, int idade, String habilidadeTecnica, String setor) {
		super(nome, cpf, idade, habilidadeTecnica);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}

	
	@Override
	public void receberAumento(double porcentagem) {
		porcentagem += 4;
		double novoSalario = porcentagem * super.getSalario();
		super.setSalario(novoSalario);
	}
	
	@Override
	public String visualizar() {
		return super.visualizar()+  "\nSetor de gerência: " + this.setor;
	}

}
