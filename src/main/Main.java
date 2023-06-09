package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int opcao;
	
	public static void main(String[] args) {
		while (true) {
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
				listarTodos();
				break;
			case 5:
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
		// TODO Auto-generated method stub
		
	}

	private static void cadastrar(){
		// TODO Auto-generated method stub
		
	}

	private static void remover(){
		// TODO Auto-generated method stub
		
	}

	private static void listarTodos(){
		// TODO Auto-generated method stub
		
	}

	private static void faturamento(){
		// TODO Auto-generated method stub
		
	}

	public static int menu() {
		System.out.println("=======BEM-VINDO=======");
		System.out.println("==SELECIONE UMA OPÇÃO==");
		System.out.println("1 - VENDER PRODUTO");
		System.out.println("2 - CADASTRAR PRODUTO");
		System.out.println("3 - REMOVER PRODUTO");
		System.out.println("4 - LISTAR TODOS OS PRODUTOS");
		System.out.println("5 - FATURAMENTO");
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
