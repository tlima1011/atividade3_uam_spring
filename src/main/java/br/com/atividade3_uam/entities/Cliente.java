package br.com.atividade3_uam.entities;

public class Cliente {
	
	private String name, endereco, contato, cnh;
	private int idade;
	
	public Cliente() { 
		
	}
	
	public Cliente(String name, String endereco, String contato, int idade, String cnh) { 
		this.name = name; 
		this.endereco  =  endereco; 
		this.contato = contato; 
		this.idade = idade;
		this.cnh = cnh;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	public String getCnh() {
		return cnh;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	} 
	
	public void dadosCliente() { 
		System.out.println("Nome: " +this.name); 
		System.out.println("Endereço: "+this.endereco); 
		System.out.println("Contato: "+this.contato); 
		System.out.println("Idade: " + this.idade);
		System.out.println("CNH: " +this.cnh);
	}
}
