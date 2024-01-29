package br.com.vainaweb.backend.java.aula.classeabstrata;

public class DevFrontEnd extends Colaborador{
	
	private String linguagemFront;
	
	public DevFrontEnd() {
		super();
	}

	public DevFrontEnd(String nome, String cpf, int idade, String habilidadeTecnica, String linguagemFront) {
		super(nome, cpf, idade, habilidadeTecnica);
		this.linguagemFront = linguagemFront;
	}

	public String getLinguagemFront() {
		return linguagemFront;
	}
	public void setLinguagemFront(String linguagemFront) {
		this.linguagemFront = linguagemFront;
	}

	
	@Override
	public void receberAumento(double porcentagem) {
		porcentagem += 0.5;
		double novoSalario = porcentagem * super.getSalario();
		super.setSalario(novoSalario);
	}
	
	@Override
	public String visualizar() {
		return super.visualizar() +  "\nLinguagem de Programação Front-End: " + this.linguagemFront;
	}

}
