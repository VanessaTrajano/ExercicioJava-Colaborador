package br.com.vainaweb.backend.java.aula.classeabstrata;

public class DevBackEnd extends Colaborador {

	private String linguagemBack;
	
	public DevBackEnd() {
		super();
	}

	public DevBackEnd(String nome, String cpf, int idade, String habilidadeTecnica, String linguagemBack) {
		super(nome, cpf, idade, habilidadeTecnica);
		this.linguagemBack = linguagemBack;
	}
	
	public String getLinguagemBack() {
		return linguagemBack;
	}
	public void setLinguagemBack(String linguagemBack) {
		this.linguagemBack = linguagemBack;
	}
	

	@Override
	public void receberAumento(double porcentagem) {
		porcentagem += 2;
		double novoSalario = porcentagem * super.getSalario();
		super.setSalario(novoSalario);
	}

	@Override
	public String visualizar() {
		return super.visualizar() + "\nLinguagem de Programação Back-End: " + this.linguagemBack;
	}

}
