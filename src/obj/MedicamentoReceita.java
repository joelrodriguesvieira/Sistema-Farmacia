package obj;

public class MedicamentoReceita extends Medicamento{
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
	
}
