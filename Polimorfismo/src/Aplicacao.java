
public class Aplicacao {

	public static void main(String[] args) {
		
//		Animal a = new Cachorro(); //Polimorfismo, o que vale � o objeto criado na mem�ria, a � um animal mas internamente ela ta
								   // referenciando um cachorro, Animal � apenas uma forma de referenciar esse cachorro
								   // instanceof verifica se um objeto � instancia de um tipo 
//		if(a instanceof Cachorro ) {
//			Cachorro c = (Cachorro) a;		//dessa forma eu evito problemas de execu��o por incompatibilidade de classes
//			c.morder();
//		}
		
		Cachorro c = new Cachorro();
		Gato g = new Gato();
		falar(c);
		falar(g);
	}	
	private static void falar(Animal a) {
		a.falar();
	}
		

	

}
