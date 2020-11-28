package app;

import app.abstractTypes.Product;

public class Computador extends Product {
	private String hd;
	private String memoria;
	private String processador;
	
	public Computador (String nome, String fabricante, double preco, String hd, String memoria, String processador) {
		super(nome, fabricante, preco);
		this.setHd(hd);
		this.setMemoria(memoria);
		this.setProcessador(processador);
	}
	
	public String getHd() {
		return hd;
	}
	public void setHd(String hd) {
		this.hd = hd;
	}
	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	
	
}
