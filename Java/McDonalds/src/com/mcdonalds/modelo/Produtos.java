package com.mcdonalds.modelo;

public class Produtos {

	private Integer id_Produto;
	private String nome_Produto;
	private Float valor_Unit;
	private Float desconto;
	private String combo;
	
	public Produtos(){
		
	}
	
	public Produtos(Integer id_Produto, String nome_Produto, Float valor_Unit, Float desconto, String combo){
		this.id_Produto = id_Produto;
		this.nome_Produto = nome_Produto;
		this.valor_Unit = valor_Unit;
		this.desconto = desconto;
		this.combo = combo;
		
	}
	public Produtos(String nome_Produto, Float valor_Unit, Float desconto, String combo){
		this.nome_Produto = nome_Produto;
		this.valor_Unit = valor_Unit;
		this.desconto = desconto;
		this.combo = combo;
		
	}
	public Produtos(Integer id_Produto){
		this.id_Produto = id_Produto;
	}
	
	
	public Integer getId_Produto() {
		return this.id_Produto;
	}
	public void setId_Produto(Integer id_Produto) {
		this.id_Produto = id_Produto;
	}
	public String getNome_Produto() {
		return this.nome_Produto;
	}
	public void setNome_Produto(String nome_Produto) {
		this.nome_Produto = nome_Produto;
	}
	public Float getValor_Unit() {
		return this.valor_Unit;
	}
	public void setValor_Unit(Float valor_Unit) {
		this.valor_Unit = valor_Unit;
	}
	public Float getDesconto() {
		return this.desconto;
	}
	public void setDesconto(Float desconto) {
		this.desconto = desconto;
	}
	public String getCombo() {
		return this.combo;
	}
	public void setCombo(String combo) {
		this.combo = combo;
	}
	
	
}
