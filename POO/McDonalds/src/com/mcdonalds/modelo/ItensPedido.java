package com.mcdonalds.modelo;

import java.sql.Date;

public class ItensPedido {
	
	private Integer id;
	private Integer pedido;
	private Date dataPedido;
	private String nome_Produto;
	private Integer id_Produto;
	private Float valor_Unit;
	private Integer qtd;
	private Float desconto;
	
	private int informarQtd;
	private int informarIDP;
	

	public ItensPedido(){
		
	}
	
	public ItensPedido(int informarIDP, int informarQtd){
		this.informarIDP = informarIDP;
		this.informarQtd = informarQtd;
	}
	
	
	public ItensPedido(Integer id, Integer pedido, Date dataPedido, String nome_Produto, Integer id_Produto
			, Float valor_Unit, Integer qtd, Float desconto){
		
		this.id = id;
		this.pedido = pedido;
		this.dataPedido = dataPedido;
		this.nome_Produto = nome_Produto;
		this.id_Produto = id_Produto;
		this.valor_Unit = valor_Unit;
		this.qtd = qtd;
		this.desconto = desconto;
		
		
	}
	
	public ItensPedido(Integer pedido, String nome_Produto, Integer id_Produto, Float valor_Unit
			, Integer qtd, Float desconto){
		this.pedido = pedido;
		this.nome_Produto = nome_Produto;
		this.id_Produto = id_Produto;
		this.valor_Unit = valor_Unit;
		this.qtd = qtd;
		this.desconto = desconto;
		
	}
	
	
	
	
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPedido() {
		return this.pedido;
	}
	public void setPedido(Integer pedido) {
		this.pedido = pedido;
	}
	public Date getDataPedido() {
		return this.dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	public String getNome_Produto() {
		return this.nome_Produto;
	}
	public void setNome_Produto(String nome_Produto) {
		this.nome_Produto = nome_Produto;
	}
	public Integer getId_Produto() {
		return this.id_Produto;
	}
	public void setId_Produto(Integer id_Produto) {
		this.id_Produto = id_Produto;
	}
	public Float getValor_Unit() {
		return this.valor_Unit;
	}
	public void setValor_Unit(Float valor_Unit) {
		this.valor_Unit = valor_Unit;
	}
	public Integer getQtd() {
		return this.qtd;
	}
	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	public Float getDesconto() {
		return this.desconto;
	}
	public void setDesconto(Float desconto) {
		this.desconto = desconto;
	}
	public int getInformarQtd() {
		return this.informarQtd;
	}

	public void setInformarQtd(int informarQtd) {
		this.informarQtd = informarQtd;
	}

	public int getInformarIDP() {
		return this.informarIDP;
	}

	public void setInformarIDP(int informarIDP) {
		this.informarIDP = informarIDP;
	}
	

}
