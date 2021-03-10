package br.com.impacta.lab.controller;

public class Produto{

private int id;
private String descricao;
private String tipo;
private double valor; 

public Produto(int id , String descricao, String Tipo , double valor){
  
  this.id = id;
  this.descricao = descricao;
  this.tipo = tipo;
  this.valor = valor;

}

public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return this.descricao;
	}

  	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

  public String getTipo() {
		return this.tipo;
	}

  	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


    public double getValor() {
		return this.valor;
	}

  	public void setValor(double valor) {
		this.valor = valor;
	}

	

}