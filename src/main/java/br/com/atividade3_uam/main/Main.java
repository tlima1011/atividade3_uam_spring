package br.com.atividade3_uam.main;

import br.com.atividade3_uam.entities.Carro;
import br.com.atividade3_uam.entities.Cliente;

public class Main {

	public static void main(String[] args) {
		
		
		
		Carro gol = new Carro("Fiat", "Uno","FFF-1222", "LLL-99/999","Preto", 2020); 
		Cliente jolene = new Cliente("Jolene", "Rua mané", "5555-8888", 35, "332558-8/24");
		gol = new Carro("Fiat", "Uno","FFF-1222", "LLL-99/999","Preto", 2020, jolene);
		//String marca, String modelo, String placa, String renavam, String cor, int anoFabricacao
		/*gol.setModelo("Uno");
		gol.setMarca("Fiat");
		gol.setCor("Preto");
		gol.setPlaca("FFF-1222");
		gol.setRenavam("LLL-99/999");*/
		gol.mostrarCarro();
		jolene.dadosCliente(); 
		System.out.println();
		gol.mostrarCarroComCliente();

	}

}
