package com.resource.servico;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.resource.entidades.DadosMercado;
import com.resource.entidades.Operacoes;

public class LeituraArquivos {

	// Criação de Listas
	List<DadosMercado> listDadosMercado = new ArrayList<DadosMercado>();
	List<Operacoes> listOperacoes = new ArrayList<Operacoes>();

	// Leitura de Linhas
	public String linhas;
	boolean primeiraLinha = true;

	// Leitura da Tabela Dados Mercado
	public void DadosMercado() {

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\DadosMercado.csv"))) {

			linhas = br.readLine();

			while ((linhas = br.readLine()) != null) {

				if (primeiraLinha) {
					primeiraLinha = false;
					continue;
				}

				String[] dados = linhas.split(";");
				Integer ID_PRECO = Integer.parseInt(dados[0]);
				Integer NU_PRAZO_DIAS_CORRIDOS = Integer.parseInt(dados[1]);
				Double VL_PRECO = Double.parseDouble(dados[2].replaceAll(",", ""));

				//Falta adicionar a lista Dados Mercado
				listDadosMercado.add(dados[0], dados[1], dados[2]);
				System.out.println("Id: " + ID_PRECO + " Dias: " + NU_PRAZO_DIAS_CORRIDOS + " Preço: " + VL_PRECO);
			}
		}

		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();
		}
	}

	// Leitura da Tabela Operacoes
	public void Operacoes() {

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Operacoes.csv"))) {
			String linhas = br.readLine();

			while ((linhas = br.readLine()) != null) {

				if (primeiraLinha) {
					primeiraLinha = false;
					continue;
				}

				String[] dados = linhas.split(";");
				Integer ID_PRECO = Integer.parseInt(dados[13]);
				String NM_SUBPRODUTO = dados[9];
				Double QUANTIDADE = Double.parseDouble(dados[12].replaceAll(",", ""));
				
				//Falta adicionar a lista Operações
				listOperacoes.add(dados[0], dados[1], dados[2]);

				System.out.println(" Id: " + ID_PRECO + " Nome: " + NM_SUBPRODUTO + " Quantidade: " + QUANTIDADE);
			}
		}

		catch (IOException e) {
			System.out.println("Erro (LeituraDeArquivo) : " + e.getMessage());
		}

	}
}
