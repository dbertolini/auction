
public interface Participante {

	public void realizarOferta(Subasta subasta);
	public String getNombre();
	public void setNombre(String nombre);
	public void notificacionRecibida(Subasta subasta);
	
}
