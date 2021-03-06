package app;

import app.abstracttypes.*;
import app.interfaces.Imposto;

public class Televisao extends Produto implements Imposto {
	private double peso;
	private String tamanho;
	private String resolucao;
	
	public Televisao (String nome, String fabricante, double preco, double peso, String tamanho, String resolucao) {
		super(nome, fabricante, preco);
		this.setPeso(peso);
		this.setTamanho(tamanho);
		this.setResolucao(resolucao);
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getResolucao() {
		return resolucao;
	}
	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}
	
	public double valorImposto() {
		return this.getPreco() * 0.06;
	}
}
