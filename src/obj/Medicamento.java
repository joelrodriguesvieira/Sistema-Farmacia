package obj;

public class Medicamento extends Produto implements Negocios{
	private String principio_ativo;

	public Medicamento() {
		super();
	}

	public Medicamento(String nome, double preco, String validade, int quantidade, String codigoDeBarras, String principio_ativo) {
		super(nome, preco, validade, quantidade, codigoDeBarras);
		this.principio_ativo = principio_ativo;
	}
	
	public String getPrincipio_ativo() {
		return principio_ativo;
	}
	
	public void setPrincipio_ativo(String principio_ativo) {
		this.principio_ativo = principio_ativo;
	}
	
	public String exibirInformacoes() {
		return "=== MEDICAMENTO ===" +
		"\nID: " + getId() +
		"\nNOME: " + getNome() +
		"\nPREÇO: R$  " + getPreco() +
		"\nVALIDADE: " + getValidade() +
		"\nPRINCIPIO ATIVO: " + getPrincipio_ativo() +
		"\nQUANTIDADE: " + getQuantidade() +
		"\nCÓDIGO: " + getCodigoDeBarras();
	}
	
}
