public class Cachorro extends Animal{
	pubblic void som(){
		System.out.println("AU AU");
	}
	
	public void comer(){
		  super.comer();
		System.out.println("Animal está comendo");
		// estou definindo que todo o animal terá o texto igual impresso para esse método
	}
	
	
	
}