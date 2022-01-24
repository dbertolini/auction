
public class main {

	public static void main(String[] args) {
		
		Subasta subasta1 = new Subasta();
		
		Participante persona1 = new ParticipanteConservador("Cristian");
		Participante persona2 = new ParticipanteConservador("Andrea");
		Participante persona3 = new ParticipanteAgresivo("Jorge");
		Participante persona4 = new ParticipanteAgresivo("Diego");
		
		subasta1.setPrecio(0);
		subasta1.setGanador(persona1);
		subasta1.agregar(persona1);
		subasta1.agregar(persona2);
		subasta1.agregar(persona3);
		subasta1.agregar(persona4);
		
		persona1.realizarOferta(subasta1);
		
	}

}
