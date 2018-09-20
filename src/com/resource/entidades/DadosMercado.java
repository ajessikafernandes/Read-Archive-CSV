package com.resource.entidades;

import java.util.ArrayList;
import java.util.List;

public class DadosMercado {

	List<DadosMercado> listDadosMercado;
	
	public Integer ID_PRECO;
	public Integer NU_PRAZO_DIAS_CORRIDOS;
	public Double VL_PRECO;

	public DadosMercado(Integer iD_PRECO, Integer nU_PRAZO_DIAS_CORRIDOS, Double vL_PRECO) {
		this.ID_PRECO = iD_PRECO;
		this.NU_PRAZO_DIAS_CORRIDOS = nU_PRAZO_DIAS_CORRIDOS;
		this.VL_PRECO = vL_PRECO;
	}

	public Integer getID_PRECO() {
		return ID_PRECO;
	}
	public void setID_PRECO(Integer iD_PRECO) {
		ID_PRECO = iD_PRECO;
	}

	public Integer getNU_PRAZO_DIAS_CORRIDOS() {
		return NU_PRAZO_DIAS_CORRIDOS;
	}
	public void setNU_PRAZO_DIAS_CORRIDOS(Integer nU_PRAZO_DIAS_CORRIDOS) {
		NU_PRAZO_DIAS_CORRIDOS = nU_PRAZO_DIAS_CORRIDOS;
	}

	public Double getVL_PRECO() {
		return VL_PRECO;
	}
	public void setVL_PRECO(Double vL_PRECO) {
		VL_PRECO = vL_PRECO;
	}
	
}
