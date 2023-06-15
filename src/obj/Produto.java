package obj;

public abstract class Produto {
	private static int contador = 1;
	
	private int id;
	private String nome;
    private double preco;
    private String validade;
    private int quantidade;
    private String codigoDeBarras;
    
    public Produto() {
    	
    }
    
	public Produto(String nome, double preco, String validade, int quantidade, String codigoDeBarras) {
		this.nome = nome;
		this.preco = preco;
		this.validade = validade;
		this.quantidade = quantidade;
		this.codigoDeBarras = codigoDeBarras;
		this.id = contador;
    	contador++;
	}
	

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}
	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

    
}
