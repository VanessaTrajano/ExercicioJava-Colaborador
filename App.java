package br.com.vainaweb.backend.java.aula.classeabstrata;

public class App {

	public static void main(String[] args) {
		
		DevBackEnd devJunior = new DevBackEnd("Hamom", "9876", 20, "Lógica", "Java");
		DevFrontEnd devFrontJunior = new DevFrontEnd("Thalia", "1234", 23, "UX/UI", "React");
		Designer designer = new Designer("Vanessa", "4567", 19, "Criatividade");
		Gerente gerente = new Gerente("João Pedro Belo", "6543", 12, "Liderança", "Marketing");
		
		System.out.println(devJunior.visualizar());
		System.out.println("----------------------------------------------");
		System.out.println(devFrontJunior.visualizar());
		System.out.println("----------------------------------------------");
		System.out.println(gerente.visualizar());
		System.out.println("----------------------------------------------");
		System.out.println(designer.visualizar());
	}

}
