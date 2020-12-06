package app.abstracttypes;

public abstract class Produto {
	private String nome;
	private String fabricante;
	private double preco;
	
	public Produto (String nome, String fabricante, double preco) {
		this.setNome(nome);
		this.setFabricante(fabricante);
		this.setPreco(preco);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
