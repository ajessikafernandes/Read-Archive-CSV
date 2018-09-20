package com.resource.aplicacao;

import com.resource.servico.LeituraArquivos;

public class programa {

	public static void main(String[] args) {

		long tempoExecucao = System.currentTimeMillis();

		System.out.println("Tabela Dados Mercado : \n");
		LeituraArquivos dadosMercado = new LeituraArquivos();
		dadosMercado.DadosMercado();
		
		System.out.println("\nTabela Operação : \n");
		LeituraArquivos Operacoes = new LeituraArquivos();
		Operacoes.Operacoes();
		
		System.out.println("\n");
		System.out.println("Tempo de Execução Total: " + (System.currentTimeMillis() - tempoExecucao));

	}
}
