package test;

import java.util.*;

import app.*;

public class TestEcommerce {
	public static void main(String[] args){
        Carrinho car = new Carrinho();
        Computador computador1 = new Computador(
        	"MackBook",
        	"Apple",
        	60000.0,
        	"HD SATA2",
        	"RAM 16GB DDR4",
        	"Intel Core I5 10th Geração"
        );
        Pedido p1 = new Pedido(computador1, 3, computador1);
        car.addPedido(p1);
        
        Computador computador2 = new Computador(
        	"Dell Latitude",
        	"Dell",
        	3000.0,
        	"HD SATA 2",
        	"RAM 8GB DDR4",
        	"intel Core I5 8th Geração"
        );
        
        Pedido p2 = new Pedido(computador2, 2, computador2);
        car.addPedido(p2);
        
        Cerveja cerveja1 = new Cerveja(
        	"Skol puro malte",
        	"Skol",
        	7,
        	2.3,
        	Calendar.getInstance()
        );
        Pedido p3 = new Pedido(cerveja1, 10, cerveja1);
        car.addPedido(p3);
        
        Cerveja cerveja2 = new Cerveja(
        	"Bavaria normal",
        	"Bavaria",
        	7,
        	2.5,
        	Calendar.getInstance()
        );
        Pedido p4 = new Pedido(cerveja2, 10, cerveja2);
        car.addPedido(p4);
        
        System.out.println("Total Compras: " + car.totalCarrinho());
        System.out.println("Total Valor Imposto: " + car.totalValorImposto());
        
        List<Pedido> pedidos = car.listaPedidos();
        for(Pedido p: pedidos){
            System.out.println(p.produto.getNome() + " : " + p.produto.getPreco() + " : " + p.quantidade);
        }
    }
}
