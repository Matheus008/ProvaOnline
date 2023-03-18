package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entitie.Aluno;

public class Program {

	public static void main(String[] args) {
		
		String nome,situacao;
		double media = 0;
		double[] notas = new double[4];
		int quantidadeDeAlunos = 1,i = 0;
		boolean validacao = true;
		char resp = 'S';
		
		List<Aluno> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			//Pegar os nome dos alunos(a)
			for (; i < quantidadeDeAlunos; i++) {
				
				System.out.print("Nome do aluno(a): ");
				nome = sc.next();
				
				//Pegar as notas e já somar para obter a média
				for (int j = 0; j < notas.length; j++) {
					System.out.print("Digite a "+(j+1)+"° nota: ");
					notas[i] = sc.nextDouble();
					
					media += notas[i];
				}
				
				//Calcular a média
				media = media/4;
				
				//Verificar se o aluno foi "aprovado" ou "reprovado"
				if(media < 6) {
					situacao = "Reprovado";
				}else {
					situacao = "Aprovado";
				}
				
				//Adicionar o aluno na lista
				Aluno aluno = new Aluno(nome, media, situacao);
				list.add(aluno);
				media = 0;
			}
			
			//Laço para evitar que o usuário coloque um caracter errado
			do {
				System.out.println("\n");
				System.out.println("Deseja continuar? (S/N)");
				resp = Character.toUpperCase(sc.next().charAt(0));
				
				if(resp == 'S') {
					quantidadeDeAlunos++;
				}else if(resp == 'N') {
					validacao = false;
				}else {
					System.out.println("\n\n");
					System.out.println("Letra digitada está incorreta!!");
				}
				
			} while ( resp != 'S' && resp != 'N');
			
		} while (validacao != false);
		
		//Imprimir a lista com os alunos
		for (Aluno a : list) {
			System.out.println(a);
		}
		
		sc.close();
		
	}

}
