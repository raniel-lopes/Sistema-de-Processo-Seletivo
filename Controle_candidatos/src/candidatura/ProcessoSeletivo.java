package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		selecaoCandidatos();
	}

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
