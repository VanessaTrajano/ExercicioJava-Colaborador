package br.com.vainaweb.backend.java.aula.classeabstrata;

import java.util.Scanner;

public abstract class Colaborador {

	private String nome;
	private String cpf;
	private int idade;
	private boolean isAtivo = true;
	private double salario;
	private String habilidadeTecnica;

	public Colaborador() {}

	public Colaborador(String nome, String cpf, int idade, String habilidadeTecnica) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.habilidadeTecnica = habilidadeTecnica;
	}

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getHabilidadeTecnica() {
		return habilidadeTecnica;
	}
	public void setHabilidadeTecnica(String habilidadeTecnica) {
		this.habilidadeTecnica = habilidadeTecnica;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return salario;
	}
	
	public boolean isAtivo() {
		return isAtivo;
	}
		
	public String visualizar() {
		return "[ " + this.nome + ", " + this.idade + " ]\n" + "Habilidade Técnica: " + this.habilidadeTecnica + "\nCPF: " + this.cpf + "\nEstá ativo? " + this.isAtivo;
	}

	public void desvincularColaborador() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Você deseja desvincular " + this.nome + " da empresa ?");
		Character resposta = sc.next().charAt(0);
		Character.toLowerCase(resposta);
		if (resposta.equals('s')) {
			System.out.println(this.nome + " está demitido(a)");
			this.isAtivo = false;
		}
		sc.close();
	}

	public abstract void receberAumento(double porcentagem);

}
