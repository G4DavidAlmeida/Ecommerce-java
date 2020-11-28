package app;

import java.util.Calendar;

import app.abstractTypes.*;

public class Cerveja extends Product {
	private String teorAlcoolico;
	private Calendar validade;
	
	public Cerveja (String nome, String fabricante, double preco, String teorAlcoolico, Calendar validade) {
		super(nome, fabricante, preco);
		this.teorAlcoolico = teorAlcoolico;
		this.validade = validade;
	}
	
	public String getTeorAlcoolico() {
		return teorAlcoolico;
	}
	public void setTeorAlcoolico(String teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}
	public Calendar getValidade() {
		return validade;
	}
	public void setValidade(Calendar validade) {
		this.validade = validade;
	}
}
