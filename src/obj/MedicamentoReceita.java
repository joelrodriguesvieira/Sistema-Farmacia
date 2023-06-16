package obj;

public class MedicamentoReceita extends Medicamento implements Negocios{
	private String receita;

	public MedicamentoReceita() {
		super();
	}

	public MedicamentoReceita(String nome, double preco, String validade, int quantidade, String codigoDeBarras, String principio_ativo,String receita) {
		super(nome, preco, validade, quantidade, codigoDeBarras,principio_ativo);
		this.receita = receita;
	}

	public String getReceita() {
		return receita;
	}
	
	public String exibirInformacoes() {
		return "=== MEDICAMENTO COM RECEITA ===" +
		"\nID: " + getId() +
		"\nNOME: " + getNome() +
		"\nPREÇO: R$  " + getPreco() +
		"\nVALIDADE: " + getValidade() +
		"\nPRINCIPIO ATIVO: " + getPrincipio_ativo() +
		"\nRECEITA: " + getReceita() +
		"\nQUANTIDADE: " + getQuantidade() +
		"\nCÓDIGO: " + getCodigoDeBarras();
	}
	
}
