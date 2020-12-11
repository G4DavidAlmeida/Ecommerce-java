package app;

import app.abstracttypes.*;
import app.interfaces.Imposto;

public class Pedido {
	public Produto produto;
	public int quantidade;
	Imposto imposto;
	
	public Pedido (Produto produto, int quantidade, Imposto imposto) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.imposto = imposto;
	}
}
