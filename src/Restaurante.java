public class Restaurante {
	
	private Pratos prato1 = new Pratos("Feijoada",10,"Arroz, feijoada, batata frita e ovo");
	private Pratos prato2 = new Pratos("� la minuta",15,"Arroz, feij�o, batata frita, ovo, carne a milanesa, tomate e alface");
	private Pratos prato3 = new Pratos("Brownie",5,"Brownie com sorvete de creme e cobertura de doce de leite");
	
	public void mostrarCardapio(){
		System.out.println(prato1.getNome() +": "+ prato1.getPre�o() + "\n" + prato1.getDescricao()+".\n");
		System.out.println(prato2.getNome() +": "+ prato2.getPre�o() + "\n" + prato2.getDescricao()+".\n");
		System.out.println(prato3.getNome() +": "+ prato3.getPre�o() + "\n" + prato3.getDescricao()+".");
	}
}