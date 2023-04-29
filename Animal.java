//QUESTOES 1,2,12

public class Animal {
	private String nome;
	private  int peso;
	private  float velocidade;
	
	public void som(){
		System.out.println("Animal fazendo baruhlo");
	}
	public void comer(){
		System.out.println("Animal está comendo");
		
	}
	
	public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getPeso() {
			return peso;
		}
		public void setPeso(int peso) {
			this.peso = peso;
		}
		public float getVelocidade() {
			return velocidade;
		}
		public void setVelocidade(float velocidade) {
			this.velocidade = velocidade;
		}
		
		public Animal (String nome,int peso,float velocidade){
			this.nome = nome;
			this.peso = peso;
			this.velocidade = velocidade;
		
		
	}
	
}
	
