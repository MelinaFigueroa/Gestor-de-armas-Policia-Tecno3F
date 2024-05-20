public class Corta extends Arma{
	private boolean esAutomatica;

		public Corta(Policia policia, int cantidadMuniciones, int alcance, String marca, int calibre, String estado, boolean esAutomatica) {
			super(policia, cantidadMuniciones, alcance, marca, calibre, estado);
			this.esAutomatica = esAutomatica;
		}

		@Override
		public boolean estaEnCondiciones() {
			return estado.equals("EN USO") && calibre >= 9;
		}

		public boolean sePuedeDispararMasDe200m() {
			return alcance > 200;
		}
	}

}
