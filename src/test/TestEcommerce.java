package test;

import java.util.Calendar;

import app.*;

public class TestEcommerce {
	public static void main(String[] args){
        Carrinho car = new Carrinho();
        Pedido p1 = new Pedido(
        	new Computador(
        		"MackBook",
        		"Apple",
        		60000.0,
        		"HD SATA2",
        		"RAM 16GB DDR4",
        		"Intel Core I5 10th Geração"
        	), 3);
        car.addPedido(p1);
        
        Pedido p2 = new Pedido(
        	new Computador(
        		"Dell Latitude",
        		"Dell",
        		3000.0,
        		"HD SATA 2",
        		"RAM 8GB DDR4",
        		"intel Core I5 8th Geração"
        	), 2);
        car.addPedido(p2);
        
        Pedido p3 = new Pedido(
            	new Cerveja(
            		"Skol puro malte",
            		"Skol",
            		7,
            		2.0,
            		Calendar.getInstance()
            	), 10);
        car.addPedido(p3);
        
        Pedido p4 = new Pedido(
        	new Cerveja(
        		"Bavaria normal",
        		"Bavaria",
        		7,
        		2.5,
        		Calendar.getInstance()
        	), 10);
        car.addPedido(p4);
        
        System.out.println("Total: " + car.totalCarrinho());
    }
}
