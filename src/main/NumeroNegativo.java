package main;

public class NumeroNegativo extends Exception {
	
    public NumeroNegativo() {
        super("ENTRADA INVÁLIDA! O NUMERO NÃO PODE SER NEGATIVO! "
        		+ "TENTE NOVAMENTE: ");
    }

}
