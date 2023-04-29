public class TestarAnimal {
	
	public static void main(String[] args){
		Animal generico = Animal();
		generico.nome = "generico";
		generico.peso = 77;
		generico.velocidade = 22;
		generico.som();
		// Chamando a classe Pai a generica
		
		Animal cachorro2 = Cachorro();
		cachorro2.nome = "Zeus";
		cachorro2.peso = 80;
		cachorro2.velocidade = 42;
		cachorro2.som();// ira sobrescrever o método da classe PAI
		//chamando a subclasse Cachorro
		
		Animal gato2 = Gato();
		gato2.nome = "Zeus";
		gato2.peso = 80;
		gato2.velocidade = 42;
		gato2.som();// ira sobrescrever o método da classe PAI
		//Classe GATO
		
		
		
	}
	
}