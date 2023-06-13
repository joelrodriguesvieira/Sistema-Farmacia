package obj;

public class MedicamentoReceita extends Medicamento{
	private String receita;

	public MedicamentoReceita() {
		super();
	}

	public MedicamentoReceita(String nome, double preco, String validade, int quantidade, String codigoDeBarras, String receita) {
		super(nome, preco, validade, quantidade, codigoDeBarras);
		this.receita = receita;
	}

	public String getReceita() {
		return receita;
	}
	
}
