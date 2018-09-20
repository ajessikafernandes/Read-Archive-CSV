package com.resource.entidades;

public class Operacoes {

	public String NM_SUBPRODUTO;
	public Integer QUANTIDADE;
	public Integer ID_PRECO;

	public Operacoes(String nM_SUBPRODUTO, Integer qUANTIDADE, Integer iD_PRECO) {
		NM_SUBPRODUTO = nM_SUBPRODUTO;
		QUANTIDADE = qUANTIDADE;
		ID_PRECO = iD_PRECO;
	}

	public String getNM_SUBPRODUTO() {
		return NM_SUBPRODUTO;
	}

	public void setNM_SUBPRODUTO(String nM_SUBPRODUTO) {
		NM_SUBPRODUTO = nM_SUBPRODUTO;
	}

	public Integer getQUANTIDADE() {
		return QUANTIDADE;
	}

	public void setQUANTIDADE(Integer qUANTIDADE) {
		QUANTIDADE = qUANTIDADE;
	}

	public Integer getID_PRECO() {
		return ID_PRECO;
	}

	public void setID_PRECO(Integer iD_PRECO) {
		ID_PRECO = iD_PRECO;
	}

}
