public class Larga extends Arma{
	private boolean tieneSelloRENAR;
	private String descripcion;
	private int nivel;

	public ArmaLarga(Policia policia, int cantidadMuniciones, int alcance, String marca, int calibre, String estado, boolean tieneSelloRENAR, String descripcion, int nivel) {
		super(policia, cantidadMuniciones, alcance, marca, calibre, estado);
		this.tieneSelloRENAR = tieneSelloRENAR;
		this.descripcion = descripcion;
		this.nivel = nivel;
	}

	@Override
	public boolean estaEnCondiciones() {
		return estado.equals("EN USO") && calibre >= 9;
	}

	@Override
	public boolean esMayorQue(Arma otraArma) {
		if (otraArma instanceof ArmaLarga) {
			ArmaLarga otraArmaLarga = (ArmaLarga) otraArma;
			return this.nivel > otraArmaLarga.nivel;
		}
		return false;
	}
}
