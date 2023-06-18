package main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import obj.Medicamento;
import obj.MedicamentoReceita;
import obj.Produto;
import obj.ProdutoGeral;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int opcao;
	static ArrayList<Produto> lista = new ArrayList<Produto>();
	static double faturamento;
	static String itensVendidos;
	
	public static void main(String[] args) {
		while (true) {
//			Produto a = new ProdutoGeral("TESOURA",20,"2023-20-12",15,"565656565");
//			lista.add(a);
//			Produto b = new ProdutoGeral("PAPEL",10,"2023-12-20",5,"54544");
//			lista.add(b);
//			Produto c = new Medicamento("AMOXILINA", 15,"2023-12-01",2,"565656","BACTERIA");
//			lista.add(c);
			opcao = menu();
			
			switch(opcao) {
			case 1:
				vender();
				break;
			case 2:
				cadastrar();
				break;
			case 3:
				remover();
				break;
			case 4:
				adicionarQtd();
				break;
			case 5:
				listarTodos();
				break;
			case 6:
				faturamento();
				break;
			case 0:
				System.out.println("ENCERRANDO SISTEMA");
				System.exit(0);
			default:
				System.out.println("\nOPÇÃO NÃO ENCONTRADA! TENTE NOVAMENTE");
			}
		}
	}
	

	private static void vender(){		
		if (lista.isEmpty()) {
			System.out.println("NÃO HÁ NENHUM PRODUTO CADASTRADO!");
			return;
		}
		
		System.out.println("DIGITE O PRODUTO: ");
		String produto = sc.next().toUpperCase();
		
		boolean encontrado = false;
		for (Produto p: lista) {
			if (p.getNome().equals(produto)) {
				encontrado = true;
				System.out.println("DIGITE A QUANTIDADE: ");
				int qtd = sc.nextInt();
				
				if (p.getQuantidade() < qtd) {
					System.out.println("QUANTIDADE INSUFICIENTE!\nESTOQUE ATUAL DE " + p.getNome() + " = " + p.getQuantidade() + " UNIDADES");
					return;
				} else {
					p.setQuantidade(p.getQuantidade()-qtd);
					itensVendidos += "\nNOME: " + p.getNome() + "\nQUANTIDADE: " + qtd + 
							"\nVALOR: " + p.getPreco()*qtd; 
					faturamento += p.getPreco()*qtd;
					System.out.println("VENDA CADASTRADA!");
					return;
				}
			}
		}
		if (!encontrado) {
			System.out.println("PRODUTO NÃO ENCONTRADO!");
		}
		
	}

	private static void cadastrar(){
		System.out.println("NOME: ");
		String nome = sc.next().toUpperCase();	
		sc.nextLine();
		System.out.println("PREÇO: ");
		double preco = sc.nextDouble();
		System.out.println("DATA DE VALIDADE format:(yyyy-mm-dd): ");
		String data = sc.next();
		sc.nextLine();
		System.out.println("QUANTIDADE: ");
		int qtdProduto = sc.nextInt();
		System.out.println("CÓDIGO DE BARRA: ");
		String codBarra = sc.next().toUpperCase();
		
		while (true) {
			System.out.println("SIGA AS INSTRUÇÕES REFERENTE AO TIPO DE CADASTRO:\nDIGITE 1 - PARA PRODUTO\nDIGITE 2 - PARA MEDICAMENTO");
			String ask = sc.next();
			
			if (ask.equals("1")) {
				Produto produto = new ProdutoGeral(nome,preco,data,qtdProduto,codBarra);
				lista.add(produto);
				System.out.println("PRODUTO CADASTRADO!");
				break;
			} else  if (ask.equals("2")){
				System.out.println("PRINCÍPIO ATIVO DO REMÉDIO: ");
				String principio = sc.next().toUpperCase();
				
				System.out.println("SIGA AS INSTRUÇÕES REFERENTE AO TIPO DE MEDICAMENTO:\nDIGITE 1 - MEDICAMENTO SEM RECEITA\nDIGITE 2 - MEDICAMENTO COM RECEITA");
				String resposta = sc.next();
				while (true) {
					if (resposta.equals("1")) {
						Produto remedio = new Medicamento(nome,preco,data,qtdProduto,codBarra,principio);
						lista.add(remedio);
						System.out.println("MEDICAMENTO CADASTRADO!");
						return;
					} else if (resposta.equals("2")) {
						System.out.println("DIGITE A RECEITA: ");
						String receita = sc.next().toUpperCase();				
						Produto remedio2 = new MedicamentoReceita(nome,preco,data,qtdProduto,codBarra,principio,receita);
						lista.add(remedio2);
						System.out.println("MEDICAMENTO CADASTRADO!");
						return;
					} else if ((!resposta.equals("1")) && (!resposta.equals("2"))) {
						System.out.println("\nENTRADA INVÁLIDA. DIGITE APENAS 1 OU 2.");
					}
				}
			} else if ((!ask.equals("1")) && (!ask.equals("2"))) {
				System.out.println("\nENTRADA INVÁLIDA. DIGITE APENAS 1 OU 2.");
			}
		}
			
	}

	private static void remover(){
		// TODO Auto-generated method stub
		
	}
	
	private static void adicionarQtd() {
		// TODO Auto-generated method stub
		
	}

	private static void listarTodos(){
		if (lista.isEmpty()) {
			System.out.println("NÃO HÁ NENHUM PRODUTO CADASTRADO!");
			return;
		}
		for (Produto p: lista) {
			System.out.println(p.exibirInformacoes()); 
		}
	}
	

	private static void faturamento(){
		System.out.println("=== ITENS VENDIDOS ===");
		System.out.println(itensVendidos);
		System.out.println("FATURAMENTO:  R$ " + faturamento);
		
	}

	public static int menu() {
		System.out.println("\n=======BEM-VINDO=======");
		System.out.println("==SELECIONE UMA OPÇÃO==");
		System.out.println("1 - VENDER PRODUTO");
		System.out.println("2 - CADASTRAR PRODUTO");
		System.out.println("3 - REMOVER PRODUTO");
		System.out.println("4 - ADICIONAR QUANTIDADES");
		System.out.println("5 - LISTAR TODOS OS PRODUTOS");
		System.out.println("6 - FATURAMENTO");
		System.out.println("0 - SAIR");
		
		boolean inputValido = false;
        while (!inputValido) {
            try {
                System.out.print("DIGITE UMA OPÇÃO: : ");
                opcao = sc.nextInt();
                sc.nextLine();

                inputValido = true;
            } catch (InputMismatchException e) {
                System.out.println("\nENTRADA INVÁLIDA! TENTE NOVAMENTE!");
                sc.nextLine();
            }
        }
		return opcao;
	}
}
