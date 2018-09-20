package com.resource.entidades;

import java.util.List;

public class Operacoes {

	List<Operacoes> listOperacoes;
	
	public String NM_SUBPRODUTO;
	public Double QUANTIDADE;
	public Integer ID_PRECO;

	public Operacoes(Integer iD_PRECO, String nM_SUBPRODUTO, Double qUANTIDADE) {
		ID_PRECO = iD_PRECO;
		NM_SUBPRODUTO = nM_SUBPRODUTO;
		QUANTIDADE = qUANTIDADE;
	}

	public String getNM_SUBPRODUTO() {
		return NM_SUBPRODUTO;
	}

	public void setNM_SUBPRODUTO(String nM_SUBPRODUTO) {
		NM_SUBPRODUTO = nM_SUBPRODUTO;
	}

	public Double getQUANTIDADE() {
		return QUANTIDADE;
	}

	public void setQUANTIDADE(Double qUANTIDADE) {
		QUANTIDADE = qUANTIDADE;
	}

	public Integer getID_PRECO() {
		return ID_PRECO;
	}

	public void setID_PRECO(Integer iD_PRECO) {
		ID_PRECO = iD_PRECO;
	}

}
