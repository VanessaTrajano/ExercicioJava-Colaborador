package br.com.vainaweb.backend.java.aula.classeabstrata;

public class Designer extends Colaborador {
	
	public Designer() {
		super();
	}


	public Designer(String nome, String cpf, int idade, String habilidadeTecnica) {
		super(nome, cpf, idade, habilidadeTecnica);
	}
	
	@Override
	public void receberAumento(double porcentagem) {
		porcentagem += 0.1;
		double novoSalario = porcentagem * super.getSalario();
		super.setSalario(novoSalario);
	}

}
