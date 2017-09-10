public class Pratos {
	private String nome;
	private double pre�o;
	private String descricao;
	Ingrediente ingredientefirst = new Ingrediente();
	Ingrediente ingredientesecond = new Ingrediente();
	Ingrediente ingredientethird = new Ingrediente();

	public Pratos(String nome, double pre�o, String descricao) {
		super();
		this.nome = nome;
		this.pre�o = pre�o;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public double getPre�o() {
		return pre�o;
	}

	public double setPre�o() {
		return pre�o;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setIngredientefirst(Ingrediente ingredientefirst) {
		this.ingredientefirst = ingredientefirst;
	}

	public void setIngredientesecond(Ingrediente ingredientesecond) {
		this.ingredientesecond = ingredientesecond;
	}

	public void setIngredientethird(Ingrediente ingredientethird) {
		this.ingredientethird = ingredientethird;
	}
}