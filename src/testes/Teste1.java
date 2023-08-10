package testes;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifrs.pw1.clientes.*;
import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		List<ClientePessoaFisica> clientes = new ArrayList<ClientePessoaFisica>();
		Scanner teclado = new Scanner (System.in);
		int menu = 0;
		
		//Endereco end1 = new Endereco("rua", "apt", 900);
		//Cpf cpf1 = new Cpf(11223344, 80);

		

		
		//List<Endereco> enderecos = new ArrayList<>();
		//enderecos.add(end1);
		//enderecos.add(end2);
		//enderecos.add(new Endereco("log1", "comp1", 123));
		
		//Cliente cli1 = new ClientePessoaFisica("991", enderecos, "mmm", cpf1);
		
		//System.out.println(cli1.toString());
	
		
		
		// menu 
		while (menu != 6) {
			Menu.imprimeMenu();

			menu = teclado.nextInt();teclado.nextLine();
			
			switch (menu) {
			case 1:
				System.out.println("Cadastrar Cliente Pessoa Física");
				
				try {
					clientes.add(Menu.cadastrarCliente());					
				} catch (Exception e){
					System.out.println("erro: " + e);
				}
				break;
				
				
			case 2:
				System.out.println("Pesquisar Cliente Pessoa Física pelo nome");
				try {
					Menu.buscaClientePeloNome(clientes);
				} catch (Exception e){
					System.out.println("Erro: " + e);
				}

				break;
				
				
			case 3:
				System.out.println("Pesquisar Cliente Pessoa Física pelo CPF");
				break;
				
				
			case 4:
				System.out.println("Pesquisar Cliente Pessoa Física pelo Endereço");
				break;
			case 5:
				System.out.println("Listar todos os clientes");
				Menu.imprimeClientes(clientes);
				break;
			case 6:
				System.out.println("Sair");
				return;
			default:
				System.out.println("\nopção invalida\n");
				break;
			}
			
		}
		
		teclado.close();
	}

}
