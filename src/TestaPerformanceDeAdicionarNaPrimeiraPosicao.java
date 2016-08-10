import java.util.*;

	public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {
		
			public static void main(String[] args) {
				
				
				System.out.println("Iniciando...");
				long inicio = System.currentTimeMillis();
				
				List<Integer> teste = new LinkedList/*ArrayList*/<>();
				
				for (int i = 0; i < 30000; i++) {
					teste.add(0, i);
				}
					long fim = System.currentTimeMillis();
					double tempo = (fim - inicio) / 1000.0;
					System.out.println("Tempo gasto adicionando: " + tempo);
					
				for (int i = 0; i < 30000; i++) {
						teste.contains(i);
				}
					long fimB = System.currentTimeMillis();
					long tempoB = fimB - inicio;
					System.out.println("Tempo gasto buscando: " + tempoB);

					
			       
			}
	}