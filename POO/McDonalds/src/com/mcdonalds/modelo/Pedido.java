package com.mcdonalds.modelo;

import java.sql.Date;

public class Pedido {

	private Integer pedido;
	private Date dataPedido;
	private Float valor;
	private Float desconto;
	private Float valorTotal;
	
	private int pedidoAtual;
	
	

	public Pedido(){
		
	}
	
	public Pedido(Integer pedido, Date dataPedido, Float valor, Float desconto, Float valorTotal){
		this.pedido = pedido;
		this.dataPedido = dataPedido;
		this.valor = valor;
		this.desconto = desconto;
		this.valorTotal = valorTotal;

	}
	
	public Pedido(int pedidoAtual){
		this.pedidoAtual = pedidoAtual;
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
	public Float getValor() {
		return this.valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public Float getDesconto() {
		return this.desconto;
	}
	public void setDesconto(Float desconto) {
		this.desconto = desconto;
	}
	public Float getValorTotal() {
		return this.valorTotal;
	}
	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}
	public int getPedidoAtual() {
		return this.pedidoAtual;
	}

	public void setPedidoAtual(int pedidoAtual) {
		this.pedidoAtual = pedidoAtual;
	}
	
	
	
}
