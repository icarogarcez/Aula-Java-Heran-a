package aulajavaherança;

public class ImpressãoAnimal {

	public static void main(String[] args) {
		
		TesteAnimal t1 = new TesteAnimal ();
		
		t1.somAnimal(new Cachorro());
		t1.somAnimal(new Cavalo ());
		t1.subir(new Preguiça());
		
	}

}
