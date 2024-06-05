package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		String[] candidatos = { "Felipe", "Marcia", "Paula", "Julia", "Augusto" };
		for (String candidato : candidatos) {
			entrandoEmContato(candidato);
		}
	}
	
	//Entrando em contato com os candidatos
	static void entrandoEmContato (String candidato) {
	int tentativasRealizadas = 1;
	boolean continuarTentando = true;
	boolean atendeu = false;
	do {
		atendeu = atender ();
		continuarTentando = !atendeu;
		if (continuarTentando)
			tentativasRealizadas++;
		else
			System.out.println("Contato Realizado com Sucesso");
	}while(continuarTentando && tentativasRealizadas < 3);
	
	if(atendeu)
		System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas);
	else
		System.out.println("Não conseguimos contato com " + candidato + ", númeor máximo de tentativas " + tentativasRealizadas);
	
	}

	// metodo auxiliar para etrar em contato
	static boolean atender() {
		return new Random().nextInt(3) == 1;
	}

	//Metódo para Imprimir os candidatos Selecionados
	static void imprimirSelecionados() {
		String[] candidatos = { "Felipe", "Marcia", "Paula", "Julia", "Augusto" };

		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

		for (int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de nº " + (indice + 1) + " é " + candidatos[indice]);
		}

		System.out.println("Forma abreviada de interação for each");

		for (String candidato : candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}

	}

	//Método para selecionar os candidatos
	static void selecaoCandidatos() {
		
		// Array com a lista de candidatos
		String[] candidatos = { "Felipe", "Marcia", "Paula", "Julia", "Augusto", "Monica", "Fabricio", "Mirela",
				"Daniela", "Jorge" };

		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();

			System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.println("O " + candidato + " foi selecionado para vaga");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	}

	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	//Analisando o candidato
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioPretendido < salarioBase) {
			System.out.println("Ligar para o Candidato.");
		} else if (salarioPretendido == salarioBase) {
			System.out.println("Ligar para o candidato com contra proposta.");
		} else {
			System.out.println("Aguardando resultado dos demais candidatos.");
		}
	}
}