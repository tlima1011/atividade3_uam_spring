package br.com.atividade3_uam.entities;

public class Carro {
	
	private String marca, modelo, placa, renavam, cor; 
	private int anoFabricacao;
	private Cliente cliente;
	
	public Carro() { 
		
	}
	
	public Carro(String marca, String modelo, String placa, String renavam, String cor, int anoFabricacao, Cliente cliente) { 
		this.marca = marca; 
		this.modelo = modelo; 
		this.placa = placa; 
		this.renavam = renavam;  
		this.cor = cor; 
		this.anoFabricacao = anoFabricacao;
		this.cliente = cliente; 
	}
	
	
	public Carro(String marca, String modelo, String placa, String renavam, String cor, int anoFabricacao) { 
		this.marca = marca; 
		this.modelo = modelo; 
		this.placa = placa; 
		this.renavam = renavam;  
		this.cor = cor; 
		this.anoFabricacao = anoFabricacao;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getRenavam() {
		return renavam;
	}
	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	} 
	
	public String obterNomeCliente() { 
		return this.cliente.getName();
	}
	
	public void mostrarCarroComCliente() { 
		System.out.println("Dados do automóvel"); 
		System.out.println("Marca: " +getMarca()); 
		System.out.println("Modelo: " +getModelo());
		System.out.println("Placa: " +getPlaca());
		System.out.println("Renavam: " +getRenavam());
		System.out.println("Cor: " +getCor());
		System.out.println("Ano de Fabricação: " +getAnoFabricacao());
		System.out.println("Nome do Cliente: " +obterNomeCliente());
	}
	
	public void mostrarCarro() { 
		System.out.println("Dados do automóvel"); 
		System.out.println("Marca: " +getMarca()); 
		System.out.println("Modelo: " +getModelo());
		System.out.println("Placa: " +getPlaca());
		System.out.println("Renavam: " +getRenavam());
		System.out.println("Cor: " +getCor());
		System.out.println("Ano de Fabricação: " +getAnoFabricacao());
	}
}
