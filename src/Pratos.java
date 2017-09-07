
public class Pratos {
	private String nome;
	private double preço;
	private String descricao;
	
	public Pratos(String nome, double preço) {
		super();
		this.nome = nome;
		this.preço = preço;
	}
	public String getNome() {
		return nome;
	}
	public double getPreço() {
		return preço;
	}
		public double setPreço() {
		return preço;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
