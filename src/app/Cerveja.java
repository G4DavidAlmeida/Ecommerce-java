package app;

import java.util.Calendar;

import app.abstracttypes.*;
import app.interfaces.Imposto;

public class Cerveja extends Produto implements Imposto {
	private double teorAlcoolico;
	private Calendar validade;
	
	public Cerveja (String nome, String fabricante, double preco, double teorAlcoolico, Calendar validade) {
		super(nome, fabricante, preco);
		this.teorAlcoolico = teorAlcoolico;
		this.validade = validade;
	}
	
	public double getTeorAlcoolico() {
		return teorAlcoolico;
	}
	public void setTeorAlcoolico(double teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}
	public Calendar getValidade() {
		return validade;
	}
	public void setValidade(Calendar validade) {
		this.validade = validade;
	}

	public double valorImposto() {
		return this.getPreco() * 0.08;
	}

}
