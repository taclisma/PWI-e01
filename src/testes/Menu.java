package testes;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ifrs.pw1.clientes.*;
import br.edu.ifrs.pw1.contatos.Endereco;
import br.edu.ifrs.pw1.documentos.*;

public class Menu {
	
	static Scanner teclado = new Scanner(System.in);

	public static void imprimeMenu() {
		System.out.println("1 - Cadastrar Cliente Pessoa Física");
		System.out.println("2 - Pesquisar Cliente Pessoa Física pelo nome");
		System.out.println("3 - Pesquisar Cliente Pessoa Física pelo CPF");
		System.out.println("4 - Pesquisar Cliente Pessoa Física pelo Endereço");
		System.out.println("5 - Listar todos os Clientes");
		System.out.println("6 - Sair");
	}
	
	public static void imprimeClientes(List<ClientePessoaFisica> clientes) {
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	} 
	
	public static ClientePessoaFisica cadastrarCliente() {
		String telefoneAux, nomeAux, aux;
		String[] aux2;
		//int intAux;
		
		System.out.println("Cadastro: \nNome do cliente: ");
		nomeAux = teclado.nextLine();
		System.out.println("\nTelefone: ");
		telefoneAux = teclado.nextLine();
		System.out.println("\nCpf (formato: 000000000-00): ");
		aux = teclado.nextLine();		
		aux2 = aux.split("-");
		
		List<Endereco> enderecosAux = cadastrarEnderecos();
		
		
		
		ClientePessoaFisica clienteAux = 
				new ClientePessoaFisica(telefoneAux, enderecosAux, nomeAux, 
										new Cpf( Long.parseLong(aux2[0]), Integer.parseInt(aux2[1])) 
																 );
		
		return clienteAux;
	}
	
	private static List<Endereco> cadastrarEnderecos() {
		List<Endereco> enderecosAux = new ArrayList<>();
		boolean b = true;
		String i;
		
		while (b) {
			i = null;
			System.out.println("Adicionar um endereço? (s/n)");
			i = teclado.nextLine();
			
			if (i.equalsIgnoreCase("s")) {
				enderecosAux.add(adicionaNovoEndereco());
			} else {
				b = false;
			}
			
		}
		return enderecosAux;

	}

	private static Endereco adicionaNovoEndereco() {
		String logradouro, complemento;
		long cep;
		
		System.out.println("logradouro?");
		logradouro = teclado.nextLine(); //teclado.next();
		System.out.println("complemento?");
		complemento = teclado.nextLine(); //teclado.next();		
		System.out.println("cep?");
		cep = teclado.nextLong(); teclado.nextLine();
		
		Endereco endereco = new Endereco(logradouro, complemento, cep);
		
		return endereco;
	}

	
	public static void buscaClientePeloNome(List<ClientePessoaFisica> clientes) {
		System.out.println("Insira o nome a ser buscado:");
		String nome = teclado.nextLine();
		
		System.out.println(busca(nome, clientes));
	}

	private static String busca(String nomeBusca, List<ClientePessoaFisica> clientes) {
		for (ClientePessoaFisica cliente : clientes) {
			if (nomeBusca.equalsIgnoreCase(cliente.getNome())) {
				return cliente.toString();				
			}
		}
		return "não encontramos esse cliente";
		

	}
	
	
}