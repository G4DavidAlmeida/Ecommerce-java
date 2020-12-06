package app;

import app.abstracttypes.*;

public class Pedido {
	public Produto produto;
	public int quantidade;
	
	public Pedido (Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
}
