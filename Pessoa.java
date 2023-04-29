public class Pessoa {
	private String nome;
	private int idade;
	private final  String planeta = "Terra";
	//atributo imutavel vai ser cosntante indepedente da classe extendida
	public final  void dormir() {
		System.out.println("Ser humano tem que dormir entre 6 até 8 horas");
		// metodo que nao pode ser sobrescrito será cosntante em todos
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getPlaneta() {
		return planeta;
	}
	

}
