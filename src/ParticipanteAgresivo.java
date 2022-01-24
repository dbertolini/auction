
public class ParticipanteAgresivo implements Participante {

	private String nombre;
	private int precioOferta;
	static final int limite = 700;
	
	public ParticipanteAgresivo(String nombre) {
		this.nombre = nombre;
	}

	public void realizarOferta(Subasta subasta) {
		precioOferta = subasta.getPrecio() + 10;
		if(precioOferta < limite)
			subasta.impactarOferta(precioOferta, this);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void notificacionRecibida(Subasta subasta) {
		realizarOferta(subasta);
	}

}
