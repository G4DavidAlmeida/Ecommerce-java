package app;

import java.util.*;

public class Carrinho {
	List<Pedido> pedidos;
	
	public Carrinho () {
		this.pedidos = new ArrayList<>();
	}
	
	public void addPedido (Pedido pedido) {
		this.pedidos.add(pedido);
	}
	
	public double totalCarrinho () {
		double total = 0;
		for (Pedido p: pedidos) {
			total += (p.produto.getPreco() * p.quantidade);
		}
		return total;
	}
	
	public double totalValorImposto(){
	       
	       double totalImposto = 0;
	       
	       for(Pedido p: pedidos){
	           double valorTotalPedido = p.imposto.valorImposto() * p.quantidade;
	           totalImposto = totalImposto + valorTotalPedido;
	       }
	       
	       return totalImposto;
	   }
	
	public List<Pedido> listaPedidos () {
		return this.pedidos;
	}
}
