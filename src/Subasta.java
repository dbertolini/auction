import java.util.ArrayList;

public class Subasta extends SubastaSubject{

	private int precio;
	private Participante ganador;
	private ArrayList<Participante> arrayListParticipantes = new ArrayList<Participante>();
	
	public Subasta() {
	}

	public void notificar(ArrayList<Participante> arrayListParticipante) {
		for (Participante participante: arrayListParticipante) {
			if(participante.getNombre() != this.ganador.getNombre())
				participante.notificacionRecibida(this);
		}
	}

	public void impactarOferta(int precioOferta, Participante participante) {
		System.out.println("Ofertó " + participante.getNombre() + " con $" + precioOferta);
		this.precio = precioOferta;
		this.ganador = participante;
		this.notificar(arrayListParticipantes);
	}
	
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Participante getGanador() {
		return ganador;
	}

	public void setGanador(Participante ganador) {
		this.ganador = ganador;
	}

	public void agregar(Participante participante) {
		this.arrayListParticipantes.add(participante);
	}

	public void quitar(Participante participante) {
		this.arrayListParticipantes.remove(participante);
	}
	
}
