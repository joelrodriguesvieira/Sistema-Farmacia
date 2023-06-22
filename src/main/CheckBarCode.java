package main;

public class CheckBarCode extends Exception {

	public CheckBarCode() {
		super("CÓDIGO DE BARRA INVÁLIDO!\nO CÓDIGO DE BARRA PRECISA TER 13 CARACTERES\nVOLTE PARA O MENU E TENTE NOVAMENTE!");
		
	}	
}
