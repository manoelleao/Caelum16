//import java.io.*;
import java.util.*;
	public class TestaPerformance {
		public static void main(String[] args) {
	
			System.out.println("Iniciando...");
			
			Collection<Integer> teste = new HashSet/*ArrayList*/<>();
			
			long inicio = System.currentTimeMillis();
			int total = 30000;
			
	////////////Add//////////////////////
			
			for (int i = 0; i < total; i++) {
				teste.add(i);
				}
					long fimA = System.currentTimeMillis();
					long tempoA = fimA - inicio;
					System.out.println("Tempo gasto adicionando: " + tempoA);
				
	/////////////Busca/////////////////				
					
			
			for (int i = 0; i < total; i++) {
				teste.contains(i);
				}
					long fimB = System.currentTimeMillis();
					long tempoB = fimB - inicio;
					System.out.println("Tempo gasto buscando: " + tempoB);
			
		}
	}
	