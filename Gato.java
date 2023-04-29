public class Gato extends Animal {
	public void som(){
		System.out.println("MIAU MIAU");

	}
	
		public void comer(){
		  super.comer();
		System.out.println("Animal está comendo");
		// estou definindo que todo o animal terá o texto igual impresso para esse método
	}
	
	
	
	
}