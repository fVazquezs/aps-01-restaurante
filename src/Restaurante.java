public class Restaurante {
	
	private Pratos prato1;
	private Pratos prato2;
	private Pratos prato3;
	
	private void mostrarCardapio(){
		System.out.println(prato1.getNome() + prato1.getPreço() + "\n" + prato1.getDescricao());
		System.out.println(prato2.getNome() + prato2.getPreço() + "\n" + prato2.getDescricao());
		System.out.println(prato3.getNome() + prato3.getPreço() + "\n" + prato3.getDescricao());
	}
}